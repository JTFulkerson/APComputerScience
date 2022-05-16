import java.util.*;
public class Array2D {
   private int[][] array;

   public Array2D(int[][] a) {
      array = a;
   }
   
   public void printArray(){
      for (int j = 0; j<array.length; j++) {
         for (int k = 0; k< array[0].length; k++) {
            System.out.print(array[j][k] + " ");
         }
         System.out.println();
      }
   }

   
   public int max() {
      int max = Integer.MIN_VALUE;
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[0].length; j++) {
            if(array[i][j] > max) {
               max = array[i][j];
            }
         }
      }
      return max;
   }
   
   public int min() {
      int num = 0;
      for(int row = 0; row < array.length; row++) {
         for(int col = 0; col < array[0].length; col++) {
            if(array[row][col] < num) {
               num = array[row][col];
            }
         }
      }
      return num;
   }
   
   public double median() {
      int[] temp = new int[array.length * array[0].length];
      int counter = 0;
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[0].length; j++) {
            temp[counter] = array[i][j];
            counter++;
         }
      }
      Arrays.sort(temp);
      if(temp.length % 2 == 0) {
         return ((temp[temp.length / 2 - 1] + temp[temp.length / 2]) / 2.0);
      }
      else 
         return temp[temp.length / 2];
   }
   
   public int mode() {
      int comp = 0;
      int count = 0;
      int maxCount = 0;
      int finalMode = 0;
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[0].length; j++) {
            comp = array[i][j];
            count = 0;
            for(int k = 0; k < array.length; k++) {
               for(int l = 0; l < array[0].length; l++) {
                  if(array[k][l] == comp) {
                     count++;
                  }
               }
               if(count > maxCount) {
                  maxCount = count;
                  finalMode = comp;
               }
            }
         }
      }
      return finalMode;
   }
   
   public double average() {
      int sum = 0;
      int counter = 0;
      for(int row = 0; row < array.length; row++) {
         for(int col = 0; col < array[0].length; col++) {
            sum += array[row][col];
            counter++;
         }
      }
      return (sum * 1.0) / counter;
   }
   
   public int closestToZero() {
      int min = Integer.MAX_VALUE;
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[0].length; j++) {
            if(Math.abs(array[i][j]) < Math.abs(min)) {
               min = array[i][j];
            }
         }
      }
      return min;
   }
   
   public void biggerThanAverage() {
      double avg = average();
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[0].length; j++) {
            if(array[i][j] > avg) {
               System.out.print(array[i][j] + "  ");
            }
         }
      }
   }
   
   public int sumRow(int r) {
      if(r >= array.length || r < 0) {
         return -1;
      }
      int sum = 0;
      for(int i = 0; i < array[0].length; i++) {
         sum += array[r][i];
      }
      return sum;
   }
   
   public int sumCol(int c) {
      if(c >= array[0].length || c < 0) {
         return -1;
      }
      int sum = 0;
      for(int i = 0; i < array.length; i++) {
         sum += array[i][c];
      }
      return sum;
   }
   
   public int sumMain() {
      if(array.length != array[0].length) {
         return -1;
      }
      int sum = 0;
      for(int i = 0; i < array.length; i++) {
         sum += array[i][i];
      }
      return sum;
   }
   
   public int sumMinor() {
      int sum = 0;
      if(array.length != array[0].length) {
         return -1;
      }
      for(int i = 0; i < array[0].length; i++) {
         sum += array[i][array[0].length - 1 - i];
      }
      return sum;
   }
}