import java.util.*;
public class Point{
      private int x, y;
   
   public  Point (){
      this.x=0;
      this.y=0;
   }
   public  Point (int x, int y){
      this.x=x;
      this.y=y;
   }
   public  void setLocation (int inx, int iny){
      this.x=inx;
      this.y=iny;
   }

   public int getX(){
   return x;
   }
   public int getY(){
   return y;
   }
   public double distanceFromOrigin(){
   return Math.sqrt(x*x+y*y);
   }
   public String toString(){
   return "("+x+" , "+y+")";
   }
}
