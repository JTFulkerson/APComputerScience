import java.util.*;  

public class GasStation {
   private double myBasePrice;
   private ArrayList<Pump> myPumps;
   
   public GasStation(Pump[] pumpz, double price) {
      myPumps = new ArrayList<Pump>();
      for(int i = 0; i < pumpz.length; i++) {
         myPumps.add(pumpz[i]);
      }
      myBasePrice = price;
   }
   
   public double getBasePrice() {
      return myBasePrice;
   }
   
   public ArrayList<Pump> getPumps() {
      return myPumps;
   }
   
   public void resetAll() {
      for(int i = 0; i < myPumps.size(); i++) {
         myPumps.get(i).resetGallonsSold();
      }
   }
   
   public double totalSales() {
      double total = 0.0;
      for(int i = 0; i < myPumps.size(); i++) {
         if(i == 0 || i == 1) {
            total += (myPumps.get(i).gallonsSold()) * (myBasePrice + 0.25);
         } else {
         total += (myPumps.get(i).gallonsSold()) * (myBasePrice);
         }
      }
      return total;
   }
   
   public double closeStation() {
      double total = this.totalSales();
      this.resetAll();
      return total;
   }
}