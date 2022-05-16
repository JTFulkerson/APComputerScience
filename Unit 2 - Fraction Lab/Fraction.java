public class Fraction{
   private int N;
   private int D;
   public Fraction   (int n, int d){
      if(d == 0){
         System.out.println("Denominator is zero!");
      }
      N = n;
      D = d;
   }
   public Fraction (){
      N = 0;
      D = 1;
   }
   public void setDenominator(int d){
      D = d;
   }
   public void setNumerator(int n){
      N = n;
   }
   public int getDenominator(){
      this.simplify();
      return D;
   }
   public int getNumerator(){
      this.simplify();
      return N;
   }
   public Fraction add (Fraction aFraction){
      if (this.D == aFraction.getDenominator()){
         int newN = aFraction.getNumerator() + this.N;
         int newD = aFraction.getDenominator();
         Fraction returnThis = new Fraction(newN,newD);
         returnThis.simplify();
         return returnThis;
      } else {
         int newD = aFraction.getDenominator() * this.D;
         int newN = (this.N * aFraction.getDenominator()) + (aFraction.getNumerator() * this.D);
         Fraction newFraction = new Fraction(newN,newD);
         newFraction.simplify();
         return newFraction;
      }
   }
   public Fraction subtract (Fraction aFraction){
      if (this.D == aFraction.getDenominator()){
         int newN = this.N - aFraction.getNumerator();
         int newD = aFraction.getDenominator();
         Fraction newFraction = new Fraction(newN,newD);
         newFraction.simplify();
         if(newFraction.getDenominator() <= 0){
            newFraction.setDenominator(Math.abs(newFraction.getDenominator()));
            newFraction.setNumerator(newFraction.getNumerator() * -1);
         }
         return newFraction;
      } else {
         int newD = aFraction.getDenominator() * this.D;
         int newN = (this.N * aFraction.getDenominator()) - (aFraction.getNumerator() * this.D);
         Fraction newFraction = new Fraction(newN,newD);
         newFraction.simplify();
         if(newFraction.getDenominator() <= 0){
            newFraction.setDenominator(Math.abs(newFraction.getDenominator()));
            newFraction.setNumerator(newFraction.getNumerator() * -1);
         }
         return newFraction;
      }
   }
   public Fraction multiply (Fraction aFraction){
      int newN = aFraction.getNumerator() * this.N;
      int newD = aFraction.getDenominator() * this.D;
      Fraction returnThis = new Fraction(newN,newD);
      returnThis.simplify();
      return returnThis;
   }
   public Fraction divide (Fraction aFraction){
      int newN = this.N * aFraction.getDenominator();
      int newD = this.D * aFraction.getNumerator();
      Fraction returnThis = new Fraction(newN,newD);
      returnThis.simplify();
      return returnThis;
   }
   public String toString (){
      this.simplify();
      if(D <= 0){
         D = (Math.abs(D));
         N = N * -1;
      }
      if(D == 1){
         return N + "";
      } else if(N == 0){
         return "0";
      }
      return N + "/" + D;
   }
   public boolean equals (Fraction aFraction){
      this.simplify();
      aFraction.simplify();
      return this.N == aFraction.getNumerator() && this.D == aFraction.getDenominator();
   }
   public double decimalValue (){
      return (double) N / D;
   }
   public static int gcf (int n1, int n2){
      if (n2 == 0) {
         return n1;
      } else {
         return (gcf(n2, n1 % n2));
      }
   }
   public void simplify (){
      for(int i = 0; i < 3; i++){
         int gcf = gcf(N, D);
         N = N / gcf;
         D = D /gcf;
      }
   }
   public static void main(String[] args) {
      Fraction f1 = new Fraction(10,5);
      System.out.println(f1.toString());
      
      // simplify 4/8
   }
}