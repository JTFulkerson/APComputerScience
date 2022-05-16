public class Dolphin extends Animal
{  
   int IQ;
   double lifespan; // in years
     //default constructor that calls the default constructor of Animal class
   Dolphin(){
      super();
      IQ = 0;
      lifespan = 0.0;
   }
     // constructor with parameters
   Dolphin(String n, String s, int i, double l){
      super(n, s);
      IQ = i;
      lifespan = l;
   }  
      
   public int getIQ(){
      return IQ;
   }
   public double getLifespan(){
      return lifespan;
   }
   
   public String toString(){
      String message = "The dolphin " + super.toString(); 
      message += (" and has an IQ of " + IQ + " with a lifespan of " + lifespan + " years"); 
      return message; 
   } 
      

} 
