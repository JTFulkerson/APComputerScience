public class TreasureMap {
   private boolean[][] myGrid;
   
   public TreasureMap(boolean[][] info) {
      myGrid = info;
   }
   
   public int numRows() {
      return myGrid.length;
   }
   
   public int numCols() {
      return myGrid[0].length;
   }
   
   public boolean hasTreasure(int row, int col) {
      if(row < numRows() && col < numCols() && row >= 0 && col >= 0) {
         return myGrid[row][col];
      }
      return false;
   }
   
   public int numAdjacent(int row, int col) {
      int sum = 0;
         for(int i = row - 1; i < row + 2; i++) {
            for(int j = col - 1; j < col + 2; j++) {
               if(hasTreasure(i, j)) {
                  if(i == row && j == col) {
                  
                  } else {
                  sum++;
                  }
               }
            }
         }
         return sum;
   }
}