public class DriversLicense extends Card {
   private int licenseNumber;
   private int licenseDate;

   public DriversLicense(String name, int num, int date) {
      super(name);
      licenseNumber = num;
      licenseDate = date;
   }
   
   public boolean isExpired() {
      if(licenseDate < 2021) {
         return true;
      }
      return false;
   }
   
   public void printCard() {
      super.printCard();// Card holder: Joe Soap
      System.out.println("License # " + licenseNumber + " expires in " + licenseDate);// License # 34 expires in 2012
   }
}