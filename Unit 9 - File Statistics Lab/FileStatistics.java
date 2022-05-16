import java.io.*;
import java.util.*;

public class FileStatistics {
   public static void main(String[] args) throws FileNotFoundException {
      String line = null;
      int lines = 0;
      int characters = 0;
      int vowels = 0;
      int eS = 0;
      int nonLetters = 0;
      int sentences = 0;
      int uppercaseLetters = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("File name: ");
      Scanner story = new Scanner(new File(input.nextLine()));
      while(story.hasNext()) {
         lines++;
         line = story.nextLine();
         System.out.println(lines + ". " + line);
         characters += line.length();
         for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u' || line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U') {
               vowels++;
            }
            if(line.charAt(i) == 'e' || line.charAt(i) == 'E') {
               eS++;
            }
            if(line.charAt(i) == '.' || line.charAt(i) == '!' || line.charAt(i) == '?') {
               sentences++;
            } 
            if(Character.isUpperCase(line.charAt(i)) == true) {
               uppercaseLetters++;
            }
            if(line.charAt(i) == '"' || line.charAt(i) == ';' || line.charAt(i) == ':' || line.charAt(i) == '!' || line.charAt(i) == '.' || line.charAt(i) == '?' || line.charAt(i) == ',' || line.charAt(i) == ' ' || line.charAt(i) == '\'' || line.charAt(i) == ')' || line.charAt(i) == '('  || line.charAt(i) == '-') {
               nonLetters++;
            }
         }
        
      }
      System.out.println("");
      System.out.println("Lines: " + lines);
      System.out.println("Characters: " + characters);
      System.out.println("Vowels: " + vowels);
      System.out.println("E's: " + eS);
      System.out.println("Non letters: " + nonLetters);
      System.out.println("Sentences: " + sentences);
      System.out.println("Uppercase letters: " + uppercaseLetters);
      
   }
}