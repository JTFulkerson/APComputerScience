import java.util.*;  

public class Chef {
   private String name;
   private List<Meal>meals;
   private int yearsExperience;
   
   public Chef(String m, List<Meal> mealz, int yrs) {
      name = m;
      meals = mealz;
      yearsExperience = yrs;
   }
   
   public String foodCertification(String foodType, String foodDesc) {
      int counter = 0;
      for(int i = 0; i < meals.size(); i++) {
         Food[] meal = meals.get(i).getFoods();
         for(int j = 0; j < meal.length; j++) {
            if(meal[j].getFoodDesc().equals(foodDesc)) {
               counter++;
            }
         }
      }
      if(counter >= 100) {
         return "A";
      } else if(50 <= counter && counter <= 99) {
         return "B";
      }
      return "C";
   }
   
   public boolean mealMasterChef(Meal mealCombo) {
      Food[] meal = mealCombo.getFoods();
      for(int i = 0; i < meal.length; i++) {
         if(!(foodCertification("", meal[i].getFoodDesc())).equals("A")) {
            return false;
         }
      }
      return true;
   }
}