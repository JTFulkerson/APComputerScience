public class Food {
   private String foodType;
   private String foodDesc;
   
   public Food(String type, String desc) {
      foodType = type;
      foodDesc = desc;
   }
   
   public String getFoodType() {
      return foodType;
   }
   
   public String getFoodDesc() {
      return foodDesc;
   }
   
   public String toString() {
      return foodType + "::" + foodDesc;
   }
}