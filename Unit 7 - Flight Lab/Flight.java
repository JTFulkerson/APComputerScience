public class Flight {
   private Seat[][] mySeats; //a 2D array of Seats on this flight
  
  //a constructor that creates a row x column matrix of Seats 
   public Flight(int rows, int columns) {
      mySeats = new Seat[rows][columns];
      int aisle1 = mySeats[0].length/2;
      int aisle2 = aisle1 + 1;
      if (mySeats[0].length % 2 == 0) {
         aisle2 = aisle1 - 1;
      }
      for (int i = 0; i < mySeats.length; i++) {
         for (int j = 0; j < mySeats[i].length; j++) {
            if (j == 0 || j == mySeats[i].length - 1) {
               mySeats[i][j] = new Seat(Seat.WINDOW);
            }
            else if (j == aisle1 ||  j == aisle2) {
               mySeats[i][j] = new Seat(Seat.AISLE);
            }
            else {
               mySeats[i][j] = new Seat(Seat.MIDDLE);
            }
         }
      }
   }
  
   //method assigns a passenger to the requested seat and returns true   		// if it was successful, false otherwise.
   public boolean setPassenger(int row, int column, String name) {
      if(row > mySeats.length || row < 0 || column > mySeats[0].length || column < 0) {
         return false;
      }
      return mySeats[row][column].setPassenger(new Passenger(name));
   }

   //method prints the matrix of Seats on this Flight in row order
   public void printChart(){
      for(int row = 0; row < mySeats.length; row++) {
         for(int col = 0; col < mySeats[0].length; col++) {
            System.out.print(mySeats[row][col]);
         }
         System.out.println("");
      }
   }

   //method returns the number of empty seats whose type is seatType;
   //if seatType is "any", returns the total number of empty seats
   public int emptySeatCount(String seatType) {
      int tally = 0;
      for(int row = 0; row < mySeats.length; row++) {
         for(int col = 0; col < mySeats[0].length; col++) {
            if(seatType.equals("any")) {
               if(mySeats[row][col].isEmpty()) {
                  tally++;
               }
            }
            else if(mySeats[row][col].getType().equals(seatType)) {
               if(mySeats[row][col].isEmpty()) {
                  tally++;
               }
            }
         }
      }
      return tally;
   }
	


   // method returns column index of the first(lowest index)
   // seat in a block of seatsNeeded adjacent empty seats
   // in the specified row;
   // If no such block exists, returns -1	
   public int findBlock(int row, int seatsNeeded) {
      if(row < 0 || row >= mySeats.length) {
         return -1;
      }
      int emptySeats = 0;
      for(int i = 0; i < mySeats[row].length; i++) {
         if(mySeats[row][i].isEmpty()) {
            emptySeats++;
               for(int j = i + 1; j < i + seatsNeeded; j++) {
                  if(j >=mySeats[0].length) {
                  
                  }else if(mySeats[row][j].isEmpty()) {
                     emptySeats++;
                  }
               }
            if(emptySeats == seatsNeeded) {
               return i;
            } else {
               emptySeats = 0;
            }
         }
      }
      return -1;
   }

   //If possible, assigns the group.length passengers from group to
   //adjacent empty seats in a single row and returns true;
   // otherwise makes no changes and returns false
   public boolean assignGroup(Passenger[] group) {
      int numP = group.length;
      for(int i = 0; i < mySeats.length; i++) {
         int index = findBlock(i, numP);
         if(index >= 0) {
            for(int j = 0; j < group.length; j++) {
               if(j + index < mySeats[0].length) {
                  mySeats[i][j + index].setPassenger(group[j]);
               }
            }
            return true;
         }
      }
      return false;
   }
   
   
   
   /*public boolean assignGroup(Passenger[] group) {
      int r = -1;
      int temp = 0;
      while(r == -1) {
         if(temp > mySeats[0].length) {
            return false;
         }
         else if(findBlock(temp, group.length) != -1) {
            r = temp;
         }
         temp++;
      }
      int col = findBlock(r, group.length);
      for(int i = 0; i < group.length - 1; i++) {
         mySeats[r][col].setPassenger(group[i]);
         col++;
      }
      return true;
   }
   */
}