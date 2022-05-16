public abstract class Movie implements Comparable<Movie>{
   private String title;
   private int score;
   public Movie(String t, int s) {
      title = t;
      score = s;
   }
   
   public int getScore() {
      return score;
   }
   
   public String getTitle() {
      return title;
   }
   
   public int compareTo(Movie that) {
      if (this.getScore() == that.getScore()){
         return 0;
      }
      if (this.getScore() > that.getScore()){
         return 1;
      }
      if (this.getScore() < that.getScore()){
         return -1;
      }
      return 0;

   }
   
   public String toString() {
      return "title: " + title + ", score:" + score;
   }
   
   abstract public String getGenre();
}