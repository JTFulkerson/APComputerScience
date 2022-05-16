public class PhoneCard extends Card {
   private String phoneNumber;
   private int phonePin;

   public PhoneCard(String name, String num, int pin) {
      super(name);
      phoneNumber = num;
      phonePin = pin;
   }
   
   public void printCard() {
      super.printCard();// Card holder: Joe Soap
      System.out.println("Phone # " + phoneNumber + " with PIN " + phonePin);// Phone # 718-815-4632 with PIN 119
   }
}