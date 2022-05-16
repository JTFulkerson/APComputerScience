public class Camel extends Animal 
{ 
// one instance variable; all others are inherited from Animal 
int myHumps; 
/** 
* Constructor for objects of class Camel 
* Takes three parameters, the camel's name, sound, and # 
* of humps. 
*/ 
Camel(String newName, String newSound, int newHumps) 
{ 
// initialize the inherited instance variables 
super (newName, newSound); // call the superclass's constructor 
// constructor 
myHumps = newHumps; // and set the Camel specific property 
} 
// One method, which is the overridden toString() method 
// All others are inherited from Animal 
public int getHumps(){
   return myHumps;
}
public String toString() 
{ 
String message = "The camel " + super.toString(); 
message += (" and has " + myHumps + " humps."); 
return message; 
} 
} 
