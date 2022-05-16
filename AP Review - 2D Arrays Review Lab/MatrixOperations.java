public class MatrixOperations {

   public double[][] scalarMultiplication(double[][] ar1, double sc) {
      double[][] output = new double[ar1.length][ar1[0].length];
      int row = 0;
      for(double[] ar: ar1) {
         int col = 0;
         for(double a: ar) {
            output[row][col] = ((int)((a * sc) * 100))/100.0;
            col++;
         }
         row++;
      }
      return output;
   }
   
   public double[][] addMatrix(double[][] ar1, double[][] ar2){
      if(ar1.length == ar2.length && ar1[0].length == ar2[0].length) {
         double[][] output = new double[ar1.length][ar1[0].length];
         for(int i = 0; i < ar1.length; i++) {
            for(int j = 0; j < ar1[0].length; j++) {
               output[i][j] = ((int)((ar1[i][j] + ar2[i][j]) * 100))/100.0;
            
            }
         }
         return output;
      }
      return null;
   }
   
   public double[][] subtractMatrix(double[][] ar1, double[][] ar2){
      if(ar1.length == ar2.length && ar1[0].length == ar2[0].length) {
         double[][] output = new double[ar1.length][ar1[0].length];
         for(int i = 0; i < ar1.length; i++) {
            for(int j = 0; j < ar1[0].length; j++) {
               output[i][j] = ((int)((ar1[i][j] - ar2[i][j]) * 100))/100.0;
            }
         }
         return output;
      }
      return null;
   }
   
   public double [][] multiplyMatrix(double[][] ar1, double[][] ar2){
      if(ar1[0].length == ar2.length) {
         double[][] output = new double[ar1.length][ar2[0].length];
         int h;
         int i;
         for(h = 0; h < ar2[0].length; h++) {//Collums in ar2 and new array
            for(i = 0; i < ar1.length; i++) {
               double sum = 0.0;
               for(int j = 0; j < ar1[0].length; j++) {
                  sum += ar1[i][j] * ar2[j][h];
               }
               output[i][h] = ((int)((sum) * 100))/100.0;
            }
         }
         return output;
      }
      return null;
   }
   
   public void printMatrix(double[][] ar1) {
      if(ar1 == null) {
         System.out.println("Operation cannot be performed");
      } else {
         for(double[] ar: ar1) {
            for(double a: ar) {
               System.out.print(a + "\t");
            }
            System.out.println("");
         } 
      }
   }
}