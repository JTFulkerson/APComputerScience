public class SciFi extends Movie {
   private double level;
   
   public SciFi(String t, int s, double l) {
      super(t, s);
      level = l;
   }
   
   public double getLevel() {
      return level;
   }
  
   public String toString() {
      return super.toString() + ", Complexity of Plot: " + level;
   }
   
   public String getGenre() {
      return "SciFi";
   }
}