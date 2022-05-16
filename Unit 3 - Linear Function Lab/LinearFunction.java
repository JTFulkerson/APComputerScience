public class LinearFunction implements LinearFunctionMethods{
   private double m;
   private double b;
   private double x;
   private double y;
   public LinearFunction (double m, double b){
      this.m = m;
      this.b = b;
   }
   public double getSlope (){
      return m;
   }
   
   public double getYIntercept (){
      return b;
   }
   
   public double getRoot (){
      return this.getXvalue (0);
   }
   
   // return the y value corresponding to x
   public double getYvalue (double x){
      return (m * x) + b;
   }   
   // return the x value corresponding to y
   public double getXvalue (double y){
      if (Double.isInfinite((y - b) / m))
         return 2.147483647E9;
      else
         return (y - b) / m;
   }
      
   // prints out a linear equation in y = mx + b form (make sure to consider m=0 or/and b=0 cases)
   public String toString (){
      if(m == 0)
         return "y = " + b;
      if(b == 0)
         return "y = " + m + "*x";
      if (b < 0)
         return "y = " + m + "*x -" + Math.abs(b);
      else
         return "y = " + m + "*x +" + b;
   
   }
}