public class Hand{
   private Card c1;
   private Card c2;
   public Hand (String val1, String val2, String suit1, String suit2){
      c1 = new Card(val1, suit1);
      c2 = new Card(val2, suit2);
   }
   public int totalHand (){
      return c1.getValue() + c2.getValue();
   }
}