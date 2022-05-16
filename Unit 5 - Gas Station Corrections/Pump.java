public class Pump {
   private double gallons;
   public Pump() {
      this.gallons = 0;
   }
   public double gallonsSold() {
      return gallons;
   }
   
   public void resetGallonsSold() {
      gallons = 0.0;
   }
   
   public void setGallons(double newGallons) {
      gallons = newGallons;
   }
}