import java.util.Arrays;

public class FractionChecker{
   public static void main(String[] args){
   
   }
   public static void sorting(FractionUnit3 [] arr){
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++){
      System.out.println((i+1) + ")/t" + arr[i].getN() + "/" + arr[i].getD() +"/t" + arr[i].decimalValue());
      }
   }
}