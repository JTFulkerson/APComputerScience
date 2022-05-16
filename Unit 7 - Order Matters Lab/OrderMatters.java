public class OrderMatters {
   private double[][] orderedData;
   private int rows;
   private int cols;
   
   public OrderMatters(int numberOfRows, int numberOfColumns) {
      orderedData = new double[numberOfRows][numberOfColumns];
   }
   
   public void rowOrder(double[] data) {
      int arrCounter = 0;
      for(int row = 0; row < orderedData.length; row++) {
         for(int col = 0; col < orderedData[0].length; col++) {
            orderedData[row][col] = data[arrCounter];
            arrCounter++;
         }
      }
   }
   
   public void columnOrder(double[] data) {
      int arrCounter = 0;
      for(int j = 0; j < orderedData[0].length; j++) {
         for(int i = 0; i < orderedData.length; i++) {
            orderedData[i][j] = data[arrCounter];
            arrCounter++;
         }
      }
   }
   
   public void wrappedOrder(double[] data) {
      int arrCounter = 0;
      for(int row = 0; row < orderedData.length; row++) {
         for(int col = 0; col < orderedData[0].length; col++) {
            orderedData[row][col] = data[arrCounter];
            arrCounter++;
         }
         row++;
         if(row == orderedData.length) {
         
         } else {
            for(int col = orderedData[0].length - 1; col >= 0 ; col--) {
               orderedData[row][col] = data[arrCounter];
               arrCounter++;
            }
         }
      }
   }
   public void print2D() {
      System.out.print("\t\t\t");
      for(int i = 0; i < orderedData[0].length; i++) {
         System.out.print("col " + i + "\t");
      }
      System.out.println();
      for(int row = 0; row < orderedData.length; row++) {
         System.out.print("row " + row + "\t");
         for(int col = 0; col < orderedData[0].length; col++) {
            System.out.print(orderedData[row][col] + "\t");
         }
         System.out.println();
      }
   }
   
}