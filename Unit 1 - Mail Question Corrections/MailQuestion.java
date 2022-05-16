public class MailQuestion{
   public static double MailMeter(double ounces){
      ounces = Math.ceil(ounces);
      if(ounces <= 11 && ounces > 0.0){
         double tempOunces = ounces - 1.0;
         return .44 + (tempOunces * .19);
      }
      if(ounces > 11 && ounces <= 32){
         return 4.60;
      }
      if(ounces > 32){
         double tempOunces = ounces - 32;
         return 4.60 + (tempOunces * .45);
      }
      return 0.0;
   }
   public static boolean combine(double ounces1, double ounces2){
      double combined = ounces1 + ounces2;
      double price1 = MailMeter(ounces1);
      double price2 = MailMeter(ounces2);
      double priceCombined = MailMeter(combined);
      return (price1 + price2) >= priceCombined;
   }
   public static void main(String[] args) {
      System.out.println(MailMeter(1.4));
   }
}