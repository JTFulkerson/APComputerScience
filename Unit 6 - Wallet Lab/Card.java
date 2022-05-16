public class Card implements Comparable<Card>{  
   private String name;

   public Card() {
      name = "";
   }
   
   public Card(String n) {
      name = n;
   }
   
   public boolean isExpired() {
      return false;
   }
   
   public void printCard() {
      System.out.println("Card holder: " + name);// Card holder: Joe Soap
   }
   
   public String getName() {
      return name;
   }
   
   public int compareTo(Card that) {
      if (this.getName().equals(that.getName())){
         return 0;
      }
      return -1;
   }
   
   public boolean equals(Card that) {
      if(this.getName().equals(that.getName())) {
         return true;
      }
      return false;
   }
   
   public Card clone() {
      return new Card(this.getName());
   }
}
