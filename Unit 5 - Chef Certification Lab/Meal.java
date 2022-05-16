public class Meal {
   private String mealDesc;
   private Food[] foods;

   public Meal(String desc, Food[] foodsArray) {
      mealDesc = desc;
      foods = foodsArray;
   }

   public String getMealDesc() {
      return mealDesc;
   }

   public Food[] getFoods() {
      return foods;
   }
}