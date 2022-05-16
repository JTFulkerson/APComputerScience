public class Comedy extends Movie {
   private int laughs;
   
   public Comedy(String t, int s, int l) {
      super(t, s);
      laughs = l;
   }
   
   public int getLaughs() {
      return laughs;
   }
  
   public String toString() {
      return super.toString() + ", Average Laughs: " + laughs;
   }
   
   public String getGenre() {
      return "Comedy";
   }
}