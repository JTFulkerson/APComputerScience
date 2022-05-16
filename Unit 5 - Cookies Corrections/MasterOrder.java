import java.util.*;  

public class MasterOrder {
   private ArrayList<CookieOrder> orders;

   public MasterOrder() {
      orders = new ArrayList<CookieOrder>();
   }

   public void addOrder(CookieOrder theOrder) {
      orders.add(theOrder);
   }

   public int getTotalBoxes() {
      int total = 0;
      for(CookieOrder order : orders) {
         total += order.getNumBoxes();
      }
      return total;
   }

   public int removeVariety(String cookieName) {
      int counter = 0;
      for(int i = orders.size() - 1; i >= 0; i--) {
         if(cookieName.equals(orders.get(i).getVariety())) {
            counter += orders.remove(i).getNumBoxes();
         }
      }
      return counter;
   }

}