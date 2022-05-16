public class MovieTrilogy extends Movie {
   private String genre;

   public MovieTrilogy(Movie m1, Movie m2, Movie m3) {
      super(m1.getTitle() + "/" + m2.getTitle() + "/" + m3.getTitle(), (m1.getScore() + m2.getScore() + m3.getScore()) / 3);
      genre = m1.getGenre();
      if(!genre.equals(m2.getGenre()) || !genre.equals(m3.getGenre())) {
         genre = "Trilogy";
      }
   }
   
      public String getGenre() {
         return "Trilogy(" + genre + ")";
        /* if(m1.getGenre().equals(m2.getGenre()) && m2.getGenre().equals(m3.getGenre())) {
            return "Trilogy(" + m1.getGenre() + ")";
         }
            return "Trilogy(Trilogy)";*/
   }
}