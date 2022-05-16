import java.util.*;

public class Person{
   private String name;// person’s name
   private char [] answers;// array of responses (A’s and B’s)
   public Person (String nameIn, char [] letters){
      name = nameIn;
      answers = letters;
   } 
   public String getName(){
      return name;
   }
   public char [] getAnswers() {
      return answers;
   }
}

