      public class APTriangle {
   private double A;
   private double B;
   private double C;
   public APTriangle(double a, double b, double c) {
      if(a + b > c && b + c > a && a + c > b){
         A = Math.min(Math.min(a, b),c);
         C = Math.max(Math.max(a, b),c);
         B = a + b + c - A - C;
      } else {
         A = 0;
         B = 0;
         C = 0;
      }
   }
   public double getA() {
      return A;
   }
   public double getB() {
      return B;
   }
   public double getC() {
      return C;
   }
   public double getPerimeter() {
      if(A == 0 && B == 0 && C == 0){
         return 0;
      }
      return A + B + C;
   }
   public double getArea() {
      if(A == 0 && B == 0 && C == 0){
         return 0;
      }
      double s = (A + B + C) / 2;
      return Math.sqrt(s * (s - A) * (s - B) * (s - C));
   }
   public String compareBySides() {
      if(A == 0 && B == 0 && C == 0){
         return null;
      } else if(A == B && A == C && B == C) {
         return "equilateral";
      } else if(A == B || A == C || B == C) {
         return "isosceles";
      }
      return "scalene";
   }
   public String compareByAngles() {
      if(A == 0 && B == 0 && C == 0){
         return null;
      } else if (C * C == (A * A) + (B * B)) {
         return "right";
      } else if (C * C < (A * A) + (B * B)) {
         return "acute";
      }
      return "obtuse";
   }
   public double largestAngle() {
      if(A == 0 && B == 0 && C == 0){
         return 0;
      }
      return Math.toDegrees(Math.acos((A * A + B * B - C * C)/(2*A*B)));
   }
   public String locationOfCircumcenter() {
      if(A == 0 && B == 0 && C == 0){
         return null;
      }
      if(compareByAngles().equals("right")){
      return "on";
      } else if(compareByAngles().equals("acute")){
      return "inside";
      }
      return "outside";
   }
}