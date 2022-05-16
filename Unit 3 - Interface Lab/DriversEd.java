public class DriversEd implements Gradable{
   private String name;
   private int score;
   public DriversEd (String name){
      this.score = 100;
      this.name = name;
   }
   public void deductPoints (int num){
      score = score - num;
   }
   public String getName (){
      return name;
   }
   public double getPercent(){
      return score * 1.0;
   }
   public boolean isPassing(){
      return score >= 85;
   }
}