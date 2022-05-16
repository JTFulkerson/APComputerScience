import java.util.Arrays;
 
public class Pizza{
   private final int MAX = 15;  // max number of toppings allowed
   private String [] toppings; // an array of toppings
   private int numToppings; // current number of valid toppings (must be <= MAX)
   public Pizza(String [] items){
      toppings = new String [MAX];
      for(int i = 0; i < items.length; i++) {
         if(items[i] == null){
            toppings[i] = "zzz";
         } else {
            toppings[i] = items[i];
            if(!toppings[i].equals("zzz")) {
               numToppings++;
            }
         }
      }
      for(int i = items.length; i < MAX; i++) {
         toppings[i] = "zzz";
      }
      Arrays.sort(toppings);
   }
   public int getNumTopping(){
      return numToppings;
   }
   
   //prints out valid toppings
   public void printTopping(){
      for(int i = 1; i <= numToppings; i++){
         System.out.println(i + ". " + toppings[i - 1]);
      }
   }
   public void printToppingWithZ(){
      for(int i = 1; i <= toppings.length; i++){
         System.out.println(i + ". " + toppings[i - 1]);
      }
   }
   //adds topping to pizza, returns false if there are already 15 valid toppings
   public boolean addTopping(String topping) {
      if(numToppings == 15){
         return false;
      }
      int index = numToppings;
      while(index > 0 && toppings[index - 1].compareTo(topping) > 0 ) {
         toppings[index] = toppings[index - 1];
         index--;
      }
      toppings[index] = topping;
      numToppings++;
      return true;
   }
   public int binarySearch(String key) {
      int low = 0;
      int high = toppings.length - 1;
      while (low <= high) {
         int mid = low + (high - low) / 2;
         int compare = key.compareTo(toppings[mid]);
            // Check if key is present at mid
         if (compare == 0)
            return mid; 
            // If key greater, ignore left half
         if (compare > 0)
            low = mid + 1;
            // If key is smaller, ignore right half
         else
            high = mid - 1;
      }
      return -1;
   }
}