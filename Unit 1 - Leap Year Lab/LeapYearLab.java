import java.util.Scanner;
public class LeapYearLab {
   public static void main(String args[]){
      Scanner input = new Scanner(System.in);
      int year = -1;
      boolean flag = false;
      while(flag != true){
         System.out.print("Enter a year 1582 or greater (0 to quit): ");
         year = input.nextInt();
         if(year == 0){
            System.out.print("Good-bye");
            flag = true;
         } else if(validity(year) == false){
            System.out.println("Error: the year must be greater than 1581");
         } else if(leap(year) == true){
            System.out.println(year + " is a leap year");
         } else{
            System.out.println(year + " is not a leap year");
         }
         System.out.println();
      }
   }
   public static boolean validity(int year){
      return year >= 1582;
   }
   public static boolean leap(int year){
      if(year % 400 == 0){
         return true;
      }
      if(year % 100 == 0){
         return false;
      }
      if(year % 4 == 0){
         return true;
      }
      return false;
   }
}