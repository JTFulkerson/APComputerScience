public class Bird extends Animal
   { 
      String birdSpecie; // "sparrow", "parrot", "ostrich" etc.
      boolean canFly; 
      double eggSize; // in cm
    
     // Constructor 
      Bird(String n, String s, String b, boolean c, double e) {
         super(n, s);
         birdSpecie = b;
         canFly = c;
         eggSize = e;
      }
      public String getSpecie(){
         return birdSpecie;
      }
      public double getEggSize (){
         return eggSize;
      }
      public boolean getCanFly() {
         return canFly;
      }
      public String toString(){
               String message = "The bird " + super.toString(); 
      message += getName() + "is a " + birdSpecie + " that ";
         if(canFly == true) {
            message += "can fly";
         } else {
         message += "cannot fly";
         } 
         message += "with " + eggSize + "cm eggs";
      return message; 
      } // make sure to include "can fly" or "cannot fly" phrases into the toString() message
   }
