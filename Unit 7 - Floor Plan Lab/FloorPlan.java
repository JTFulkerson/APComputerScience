import java.util.*;

public class FloorPlan {
   private int[][] room;
   private final int ROWS;
   private final int COLS;

   public FloorPlan(int r, int c) {
      ROWS = r;
      COLS = c;
      room = new int[r][c];
   }

   public void printRoom() {
      for(int i = 0; i < room.length; i++) {
         for(int j = 0; j < room[0].length; j++) {
            System.out.print(room[i][j] + " ");
         }
         System.out.println(""); 
      }
   }

   public int[][] getRoom() {
      return room;
   }

   public void eliminate(int r, int c) {
      if ((r >= 0 && r < ROWS) && (c >= 0 &&  c < COLS)) {
         room[r][c] = 1;
      }
   }
   
   public boolean isEmptyRegion(int top, int bottom, int left, int right) {
      if(top > bottom || left > right || room.length <= bottom || room[0].length <= right || top < 0 || bottom < 0 || left < 0 || right < 0) {
         return false;
      }
      for(int i = top; i <= bottom; i++) {
         for(int j = left; j <= right; j++) {
            if(room[i][j] == 1) {
               return false;
            }
         }
      }
      return true;
   }
   
   public boolean fits(int width, int height, Location ulCorner) {
      if(width == 0 || height == 0 || width >= room[0].length || height >= room.length) {
         return false;
      }
      int top = ulCorner.getRow() - 1;
      int bottom = ulCorner.getRow() + height;
      int left = ulCorner.getCol() - 1;
      int right = ulCorner.getCol() + width;
      if(top == -1)
         top++;
      if(left == -1)
         left++;
      if(right >= room[0].length)
         right--;
      if(bottom >= room.length)
         bottom--;
      return isEmptyRegion(top, bottom, left, right);
   }
   
   public ArrayList<Location> whereFits(int width, int height) {
   ArrayList<Location> toReturn = new ArrayList<Location>();
      for(int i = 0; i < room.length; i++) {
         for(int j = 0; j < room[0].length; j++) {
         boolean temp = fits(width, height, new Location(i, j));
            if(temp == true) {
               toReturn.add(new Location(i, j));
            }
         }
      }
      return toReturn;
   }
}