public class Card{
   private String mySuit;
   private String myDenom;
   public Card (String denom, String suit){
      mySuit = suit;
      myDenom = denom;
   }
   public String getSuit (){
      return mySuit;
   }
   public boolean isFaceCard (){
      return myDenom.equals("J") || myDenom.equals("Q") || myDenom.equals("K");
   }
   public int getValue (){
      if(this.isFaceCard() == true || myDenom.equals("T")){
         return 10;
      } else if (myDenom.equals("A")){
         return 11;
      }
      int newInt = Integer.parseInt(myDenom);
      return newInt;
   }
   public String toString (){
   if(this.myDenom.equals("T")){
      return "10 of " + this.mySuit;
      } else{
      return this.myDenom + " of " + this.mySuit;
      }
   }
   public String getDenomination (){
      return myDenom;
   }
}