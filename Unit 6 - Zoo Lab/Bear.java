public class Bear extends Animal{
   String color;
   //default constructor that calls the default constructor of Animal class 
   Bear(){
      super();
      color = null;
   }
   // constructor with parameters
   Bear(String n, String s,String c) {
      super(n, s);
      color = c;
   }
   public String getColor(){
      return color;
   }
   public String toString(){
      String message = "The bear " + super.toString(); 
      message += (" and is " + color); 
      return message; 
   } 
} 
