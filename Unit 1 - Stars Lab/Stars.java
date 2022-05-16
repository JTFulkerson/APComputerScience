public class Stars {
   public static void main(String[] args){
      //printTriangle(6);//Done
      //printTriangle(10);//Done
      //printTriangle(14);//Done
      //printArrowhead(4);//Done
      //printArrowhead(6);//Done
      //printArrowhead(10);//Done
      //printSquareOnDiagonal(2);
      //printSquareOnDiagonal(9);
      //printSquareOnDiagonal(9);
      //printXinSquare(3);
      printXinSquare(10);
      //printXinSquare(10);
      //printStairs(2);//Done
      //printStairs(5);//Done
      //printStairs(6);//Done
   }
   public static void printTriangle(int rows){
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
   
   public static void printArrowhead(int width){
      for (int i = 1; i <= width; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print("*");
            if(j!=i){
               System.out.print(" ");
            }
         }
         System.out.println();
      }
      for (int i = 1; i <= width-1; i++) {
         for (int j = width-1; i <= j; j--) {
            System.out.print("*");
            if(j!=i){
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
     
   public static void printSquareOnDiagonal(int width){
      for (int line = 0; line < width; line++) {
         String rail = "";
         for (int i = 0; i < (Math.abs(line - (width/2))); i++) {
            System.out.print("  ");
         }
         for (int i = 0; i < width - (Math.abs(line - (width / 2)) * 2); i++) {
            System.out.print(rail);
            System.out.print("*");
            rail = " ";
         }
         System.out.println();
      }
   }
   public static void printXinSquare(int width){
   /*if(width==5) {
   System.out.println("  * * *");
   System.out.println("*   *   *");
   System.out.println("* *   * *");
   System.out.println("*   *   *");
   System.out.println("  * * *");
   return;
   }*/
      for(int row = 0; row < width; row++){
         String rail = "";
         for(int col = 0; col < width; col++){
            if(row == col || row + col == width - 1){
               if(col + 1 < width) {
                  System.out.print(rail + " ");
               }
            } else {
               System.out.print(rail + "*");
            }
            rail = " ";
         }
         System.out.println("");
      }
   }
   public static void printStairs(int numMen) {
      for(int iMen = 0; iMen < numMen; iMen++) {
         for(int iRow = 0; iRow < 3; iRow++) {
            // Print Spaces   
            for(int i = 0; i < numMen  - 1- iMen; i++) {
               System.out.print("     ");
            }
            // Print Man
            if(iRow == 0) {
               System.out.print("  O  ******");
            } else if(iRow == 1) {
               System.out.print(" /|\\ *     ");
            } else {
               System.out.print(" / \\ *     ");
            }
            // Print Backspace
            for(int i = 0; i < iMen; i++) {
               System.out.print("     ");
            }
            // Print backstair
            System.out.println("*");
         }
      }
      for(int i = 0; i <= numMen;i++){
         System.out.print("*****");
      }
      System.out.println("**");
   }
}