public class SnowyOwl extends Owl {
   public SnowyOwl() {
      super("Snowy owl");
   }
   public String getFood() {
      double randNum = Math.random();
      if(randNum <= (1.0 / 3.0)) {
         return "hare";
      }
      if(randNum <= (2.0 / 3.0)) {
         return "lemming";
      }
      return "small bird";
   }
}