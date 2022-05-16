import java.util.*;
public class TreasureMapTester
{
   public static void main(String [] args) {
      boolean[][] temp = {{false, true, true, false, true, false, true, false, false}, {false, true, false, false, false, false, true, false, false}, {false, true, false, true, true, false, false, true, true}, {true, false, true, false, true, true, false, false, false}, {false, true, false, false, true, false, false, true, false}, {true, false, false, true, false, true, false, false, false}};
      TreasureMap theMap = new TreasureMap(temp);
      System.out.println(theMap.numAdjacent(3, 3));
   }
}
