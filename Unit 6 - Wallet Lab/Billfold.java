public class Billfold {
   private Card card1;
   private Card card2;
   
   public void addCard(Card c) {
      if(card1 == null) {
         card1 = c;
      } else if (card2 == null) {
         card2 = c;
      }
   }
   
   public void printCards() {
      if(card1 != null) {
         card1.printCard();
      }
      if(card2 != null) {
         card2.printCard();
      }
   }
   
   public void printExpiredCards() {
      if(card1.isExpired()) {
         card1.printCard();
      }
      if(card2.isExpired()) {
         card2.printCard();
      }
   }
}