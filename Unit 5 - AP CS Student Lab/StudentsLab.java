import java.util.*;

public class StudentsLab {
   public static void printList(ArrayList<String> x) {
      int counter = 1;
      for(String student : x){
         System.out.println(counter + ". " + student);
         counter++;
      }
   }
   
   public static void removeCh(ArrayList<String> x, char ch) {
      String character = ch + "";
      for(int i = 0; i < x.size(); i++) {
         if(character.equalsIgnoreCase((x.get(i)).substring(0,1))) {
            x.remove(i);
            i--;
         }
      }
   }
   
   public static void addArray(ArrayList<String> x, String[]names) {
      for(int i = 0; i < names.length; i++) {
         x.add(names[i]);
      }
   }
   
   public static void replaceName(ArrayList<String> x, String oldOne, String newOne) {
      for(int i = 0; i < x.size(); i++) {
         if(oldOne.equalsIgnoreCase(x.get(i))) {
            x.set(i, newOne);
         }
      }
   }
   
   public static void removeDup(ArrayList<String> x) {
      for(int i = x.size(); i > 0; i--) {
         if(x.indexOf(x.get(i - 1)) != i - 1) {
            x.remove(i - 1);
         }
      }
   }
   
   public static ArrayList<String>  mergeLists (ArrayList<String> a, ArrayList<String> b) {
   a.addAll(b);
   Collections.sort(a);
   removeDup(a);
   return a;
   }
   public static void main(String[] args) {
      ArrayList<String> students = new ArrayList<String>();
      students.add("Arsalan");
      students.add("John");
      students.add("Alice");
      students.add("Karam");
      students.add("Alice");
      students.add("Alice");
      students.add("Mia");
      students.add("Connor");
      students.add("Key");
      students.add("Alice");
      students.add("Teddy");
      students.add("Brian");	
      students.add("Sam");
      students.add("Sam");
      students.add("Sam");
      students.add("John");
      students.add("Jake");
      students.add("Jacob");
      students.add("Eric");
      students.add("Diana");
      students.add("Summer");	
      students.add("Summer");
      students.add("Jean");
      System.out.println(students.size());
      printList(students);
      System.out.println();
      
      removeDup(students);
      printList(students);
   }
}