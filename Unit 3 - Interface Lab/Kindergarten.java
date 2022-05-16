public class Kindergarten implements Gradable{
   private String name;
   private int stars;
   public Kindergarten (String name){
      this.name = name;
   }
   public void addStars(int number){
      stars = stars + number;
   }
   public String getName (){
      return name;
   }
   public double getPercent(){
   return stars * 1.0;
   }
   public boolean isPassing(){
      return stars > 50;
   }
}