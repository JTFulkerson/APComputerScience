import java.util.*;
public class FloorPlanTester{
   public static void main (String [] args){
      FloorPlan m1= new FloorPlan (8, 9); 
      m1.eliminate(0,1);
      m1.eliminate(0,2);
      m1.eliminate(2,8);
      m1.eliminate(3,8);
      m1.eliminate(4,8);
      m1.eliminate(5,8);
      m1.eliminate(7,5);
      m1.eliminate(7,6);
      m1.eliminate(7,7);
      m1.printRoom();
      Location loc1= new Location (2,2);
      Location loc2= new Location (2,0);
      Location loc3= new Location (6,0);
      Location loc4= new Location (1,2);
      Location loc5= new Location (2,4);
      Location loc6= new Location (6,1);
      System.out.println(m1.fits(4, 2, loc1));//true
      System.out.println(m1.fits(4, 2, loc2));//true
      System.out.println(m1.fits(4, 2, loc3));//true
      System.out.println(m1.fits(4, 2, loc4));//false
      System.out.println(m1.fits(4, 2, loc5));//false
      System.out.println(m1.fits(4, 2, loc6));//false
   
   }
}