public class IDCard extends Card {
   private int idNumber;

   public IDCard(String name, int id) {
      super(name);
      idNumber = id;
   }
   
   public void printCard() {
      super.printCard();// Card holder: Joe Soap
      System.out.println("ID# " + idNumber);// ID# 123
   }
}