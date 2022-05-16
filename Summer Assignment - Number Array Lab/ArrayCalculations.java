import java.util.Arrays;

public class ArrayCalculations{
   public static void main(String[] args){
      double[] array = new double[20];
      for(int i = 0; i <= array.length - 1; i++){
         array[i] = (int)(Math.random() * (500-1+1) + 1);
      }
      System.out.print("The sum of the array is ");
      sum(array);
      System.out.print("The average of the array is ");
      average(array);
      System.out.print("The smallest value of the array is ");
      smallestValue(array);
      System.out.print("The largest value of the array is ");
      largestValue(array);
   }
   
   public static void sum(double[] tempList){
      double sum = 0.0;
      for(int i = 0; i <= tempList.length - 1; i++){
         sum = sum + tempList[i];
      }
      System.out.println(sum);
   }
   
   public static void average(double[] tempList){
      double sum = 0.0;
      for(int i = 0; i <= tempList.length - 1; i++){
         sum = sum + tempList[i];
      }
      double average = sum/20.0;
      System.out.println(average);
   }
   public static void smallestValue(double[] tempList){
      Arrays.sort(tempList);
      System.out.println(tempList[0]);
   }
   public static void largestValue(double[] tempList){
      Arrays.sort(tempList);
      System.out.println(tempList[tempList.length-1]);
   }
}