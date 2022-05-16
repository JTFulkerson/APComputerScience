import java.util.Scanner;

public class HarryPotter{
   public static void main(String[] args){
      String[] names = new String[5];
      names[0] = "Hermione";
      names[1] = "Harry";
      names[2] = "Ron";
      names[3] = "Dumbledore";
      names[4] = "Snape";
      System.out.println(names[names.length-1]);
      for(int i = names.length - 1; i >=0; i--){
         System.out.print(names[i] + " ");
         System.out.println(names[i].length());
      }
      Scanner input = new Scanner(System.in);
      String[] names2 = new String[10];
      for(int i = 0; i <= names.length - 1; i++){
         String tempWord;
         tempWord = names[i];
         names2[i] = tempWord;
      }
      for(int i = 5; i <= names2.length - 1; i++){
         System.out.print("Enter any wizard: ");
         String wizard = input.next();
         names2[i]=wizard;
      }
      System.out.println(names2[((int)(Math.random() * (9-0+1) + 0))]);
      for(int i = 0; i <= names2.length - 1; i++){
         System.out.println((i+1) + ") " + names2[i]);
      }
      int sum = 0;
      for(int i = 0; i <= names2.length - 1; i++){
         int tempNum;
         tempNum = names2[i].length();
         sum = sum + tempNum;
      }
      System.out.println("The average length of a name in the array2 array is " + (sum/10.0));
      input.close();
   }
}