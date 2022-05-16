public class BatteryCharger {
   private int[] rateTable;
   public BatteryCharger() {
      rateTable = new int[] {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
   }
   public BatteryCharger(int[] table) {
      rateTable = table;
   }
   public int getChargingCost(int startHour, int chargeTime) {
      if(startHour > 23 || startHour < 0 || chargeTime <= 0) {
         return -1;
      }
      int cost = 0;
      int counter = startHour;
      for(int i = 0; i < chargeTime; i++) {
         cost += rateTable[counter];
         counter++;
         if(counter > 23) {
            counter = 0;
         }
      }
      return cost;
   }
   public int getChargeStartTime(int chargeTime) {
      if(chargeTime <= 0) {
         return -1;
      }
      int index = 0;
      int cheapestPrice = this.getChargingCost(0, chargeTime);
      for(int i = 1; i < 24; i++) {
         if(this.getChargingCost(i, chargeTime) < cheapestPrice) {
            cheapestPrice = this.getChargingCost(i, chargeTime);
            index = i;
         }
      }
      return index;
   }
}