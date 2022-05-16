import java.util.*;
public class SkiArea {
   private int[][] alts;

   public SkiArea(int[][] array) {
      alts=array;
   }
   
   public int[][] getAlts() {
      return alts;
   }
   
   public void printAlts() {
      for (int j = 0; j < alts.length; j++) {
         for (int k = 0; k < alts[0].length; k++) {
            System.out.print(alts[j][k] + " ");
         }
         System.out.println();
      }
   }
   
   public static int indexOfMax(int[] arr) {
      int max = -1;
      int index = -1;
      for(int i = 0; i < arr.length; i++) {
         if(arr[i] > max) {
            max = arr[i];
            index = i;
         }
      }
      return index;
   }
   
   public static int rightIndexOfMax(int[] arr) {
      int max = -1;
      int index = -1;
      for(int i = arr.length - 1; i >= 0; i--) {
         if(arr[i] > max) {
            max = arr[i];
            index = i;
         }
      }
      return index;
   }
   
   public int findSummit() {
      int max = -1;
      int index = -1;
      for(int i = 0; i < alts[0].length; i++) {
         if(alts[0][i] > max) {
            max = alts[0][i];
            index = i;
         }
      }
      return index;
   }
   
   public ArrayList<Location> findSteepestTrail() {
      ArrayList<Location> trail = new ArrayList<Location>();
      int lastTrail = findSummit();
      int smallest;
      trail.add(new Location(0, lastTrail));
      for(int i = 1; i < alts.length; i++) {
         if(lastTrail == 0) {
            if(alts[i][lastTrail] < alts[i][lastTrail + 1]) {
               smallest = lastTrail;
            } else {
               smallest = lastTrail + 1;
            }
         } else if (lastTrail == alts[0].length - 1) {
            if(alts[i][lastTrail] < alts[i][lastTrail - 1]) {
               smallest = lastTrail;
            } else {
               smallest = lastTrail - 1;
            }
         } else {
            if(alts[i][lastTrail - 1] < alts[i][lastTrail] && alts[i][lastTrail - 1] < alts[i][lastTrail + 1]) {
               smallest = lastTrail - 1;
            } else if (alts[i][lastTrail] < alts[i][lastTrail + 1]) {
               smallest = lastTrail;
            } else {
               smallest = lastTrail + 1;
            }
         }
         lastTrail = smallest;
         trail.add(new Location(i, lastTrail));
      }
      return trail;
   }
   
   public ArrayList<Location> findZigzagTrail() {
      ArrayList<Location> trail = new ArrayList<Location>();
      int index = -1;
      int max = -1;
      for(int i = 0; i < alts.length; i++) {
         if(i % 2 == 0) {
            for(int j = 0; j < alts[0].length; j++) {
               if(alts[i][j] > max) {
                  max = alts[i][j];
                  index = j;
               }
            }
         } else {
            for(int j = alts[0].length - 1; j >= 0; j--) {
               if(alts[i][j] > max) {
                  max = alts[i][j];
                  index = j;
               }
            }
         }
         trail.add(new Location(i, index));
         index = -1;
         max = -1;
      }
      return trail; 
   }
}