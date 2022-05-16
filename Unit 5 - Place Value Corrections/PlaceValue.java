import java.util.*;  

public class PlaceValue {

   public static ArrayList<Integer> parsePlaceValueIntoArrayList(int num) {
      ArrayList<Integer> list = new ArrayList<>();
      int zero = 10;
      int temp;
       list.add(num % 10);
       num = num / 10;
      while(num > 0) {
         temp = num % 10;
         num = num / 10;
         list.add(temp * zero);
         zero = zero * 10;
      }
      return list;
   }

}