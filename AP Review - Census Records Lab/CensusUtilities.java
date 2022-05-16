public class CensusUtilities {
   public static int letterToNumber(String letter) {
      for(int i = 0; i < letter.length(); i++) {
         if(letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("f") || letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("v")) {
            return 1;
         } else if(letter.equalsIgnoreCase("c") || letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("s") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("z")) {
            return 2;
         } else if(letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("t")) {
            return 3;
         } else if(letter.equalsIgnoreCase("l")) {
            return 4;
         } else if(letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n")) {
            return 5;
         } else if(letter.equalsIgnoreCase("r")) {
            return 6;
         }
      }
      return -1;
   }

   public static String getFirstSurname(String censusData) { 
      return "N/A";
   }
   
   public static String getSoundex(String name) { 
      return "N/A";
   }
   
   public static boolean sameFirstSurname(String censusData1, String censusData2) { 
      return false;
   }
}