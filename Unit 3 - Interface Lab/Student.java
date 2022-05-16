public class Student implements Gradable{
   private double percent;
   private boolean passing;
   private String name;
   private double sumOfTests;
   private int tests;
   public Student (String n){
      name = n;
   }
   public void addTestScore (double score){
      sumOfTests += score;
      tests++;
   }
   public String getName (){
      return name;
   }
   public double getPercent (){
      if (tests == 0){
         return 0.0;
      }
      return sumOfTests / tests;
   }
   public boolean isPassing (){
      return this.getPercent() >= 60;
   }
}