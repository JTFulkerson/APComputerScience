public class APLine{
   private int a;
   private int b;
   private int c;
   public APLine (int inita, int initb, int initc){
      a = inita;
      b = initb;
      c = initc;
   }
   public double getSlope (){
      return ((a * -1.0) / b);
      }
   public int getA (){
      return a;
   }
   public int getB (){
      return b;
   }
   public int getC (){
      return c;
   }
   public boolean isOnLine (int x, int y){
      return ((this.a * x) + (this.b * y) + this.c) == 0;
   }
}