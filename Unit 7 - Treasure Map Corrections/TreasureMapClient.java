public class TreasureMapClient {
   public static int[][] computeCounts(TreasureMap theMap) {
      int[][] newArr = new int[theMap.numRows()][theMap.numCols()];
      for(int i = 0; i < newArr.length; i++) {
         for(int j = 0; j < newArr[0].length; j++) {
            if(theMap.hasTreasure(i, j) == true) {
               newArr[i][j] = 9;
            } else {
               newArr[i][j] = theMap.numAdjacent(i, j);
            }
         }
      }
      return newArr;
   }
}