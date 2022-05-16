import java.util.*;

public class Zoo {
   private ArrayList<Animal> residents;
   
   public Zoo() {
      residents = new ArrayList<Animal>();
   }
   
   public void addResident(Animal a) {
      residents.add(a);
   }
   
   public void getResidents() {
      for(int i = 0; i < residents.size(); i++) {
         System.out.println(residents.get(i).toString());
      }
   }
   
   public int getZooSize() {
      return residents.size();
   }
}