public class FractionUnit3 implements Comparable<FractionUnit3>{
   private int N;
   private int D;
   public FractionUnit3   (int n, int d){
      if(d == 0){
         System.out.println("Denominator is zero!");
      }
      N = n;
      D = d;
   }
   public FractionUnit3 (){
      N = 0;
      D = 1;
   }
   public double decimalValue (){
      return (double) N / D;
   }
   public int getN (){
      return N;
   }
   public int getD (){
      return D;
   }
   public int compareTo (FractionUnit3 that){
      if (this.decimalValue() == that.decimalValue()){
         return 0;
      }
      if (this.decimalValue() > that.decimalValue()){
         return 1;
      }
      if (this.decimalValue() < that.decimalValue()){
         return -1;
      }
      return 0;
   }
}
