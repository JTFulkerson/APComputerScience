public class StringExercises{
   //public static void main(String[] args){
      //System.out.println(reverse("AP Computer Science"));
      //System.out.println(reverse(""));
      //System.out.println(reverse("J"));
      //System.out.println(reverse(null));
      //System.out.println(removeAll("Remove them all!","e"));
      //System.out.println(removeAll("Remove them all!","em"));
      //System.out.println(removeAll("","e"));
      //System.out.println(removeAll(null,"abc"));
      //System.out.println(removeAll(null,null));
      //System.out.println(removeAll("Remove them all!","zoo"));
      //System.out.println(removeAll("Remove them all!",""));
      //System.out.println(isPalindrome("Java!"));
      //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
      //System.out.println(isPalindrome("J"));
      //System.out.println(isPalindrome("No lemon, no Melon"));
      //System.out.println(isPalindrome(null));
      //System.out.println(isPalindrome(""));
      //System.out.println(toPigLatin("I am fluent in Pig Latin"));
      //System.out.println(toPigLatin("Hey"));
      //System.out.println(toPigLatin(null));
      //System.out.println(toPigLatin("ZZZ"));
      //System.out.println(toPigLatin("great job"));
      //System.out.println(toPigLatin("")); 
       
   //}

   public static String reverse (String str){
      if(str==null){
         return null;
      }
      String newWord = "";
      for(int i = 0; i<str.length();i++){
         newWord = newWord + str.substring(str.length()-1-i,str.length()-i);
      }
      return newWord;
   }
   
   public static String removeAll (String str1, String str2){
      if(str1==null){
         return null;
      }
      if(str2=="" || str2==null){
         return str1;
      }
      while(str1.contains(str2)==true){
         str1 = str1.substring(0,str1.indexOf(str2)) + str1.substring((str1.indexOf(str2)+str2.length()),str1.length());
      }
      return str1;
   }
   
   public static Boolean isPalindrome (String str){
      if(str==null){
         return false;
      }
      while(str.contains(" ")==true){
         str = str.substring(0,str.indexOf(" ")) + str.substring((str.indexOf(" ")+1),str.length());
      }
      while(str.contains("?")==true){
         str = str.substring(0,str.indexOf("?")) + str.substring((str.indexOf("?")+1),str.length());
      }
      while(str.contains(",")==true){
         str = str.substring(0,str.indexOf(",")) + str.substring((str.indexOf(",")+1),str.length());
      }
      while(str.contains(";")==true){
         str = str.substring(0,str.indexOf(";")) + str.substring((str.indexOf(";")+1),str.length());
      }
      while(str.contains(":")==true){
         str = str.substring(0,str.indexOf(":")) + str.substring((str.indexOf(":")+1),str.length());
      }
      while(str.contains("'")==true){
         str = str.substring(0,str.indexOf("'")) + str.substring((str.indexOf("'")+1),str.length());
      }
      while(str.contains("\"")==true){
         str = str.substring(0,str.indexOf("\"")) + str.substring((str.indexOf("\"")+1),str.length());
      }
      String newString = str.toLowerCase();
      String newWord = "";
      for(int i = 0; i<=newString.length()-1;i++){
         newWord = newWord + newString.substring(newString.length()-1-i,newString.length()-i);
      }
      return newWord.equals(newString);
   }  
   public static String toPigLatin (String str){
      if(str==null){
         return null;
      }
      if(str.equals("")||str.equals(" ")){
         return str;
      }
      String newString = "";
      int position = 0;
      for(int i = 0; i <= str.length()-1;i++){
         if(str.substring(i,i+1).equals(" ")){
            newString = newString + toPigLatinWord(str.substring(position,i))+" ";
            position = i+1;
         }
      }
      newString = newString + toPigLatinWord(str.substring(position, str.length()));
      return newString;
   }
   public static String toPigLatinWord (String str){
      if(str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o") || str.startsWith("u") || str.startsWith("A") || str.startsWith("E") || str.startsWith("I") || str.startsWith("O") || str.startsWith("U")){
         str = str + "yay";
      }
      else if(!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u") && !str.contains("A") && !str.contains("E") && !str.contains("I") && !str.contains("O") && !str.contains("U")){
         str = str + "ay";
      }
      else{
         boolean flag = false;
         for(int i = 0; i<=str.length()-1 && !flag;i++){
            if(str.substring(i,i+1).equals("a") || str.substring(i,i+1).equals("e") || str.substring(i,i+1).equals("i") || str.substring(i,i+1).equals("o") || str.substring(i,i+1).equals("u") || str.substring(i,i+1).equals("A") || str.substring(i,i+1).equals("E") || str.substring(i,i+1).equals("I") || str.substring(i,i+1).equals("O") || str.substring(i,i+1).equals("U")){
               str = str.substring(i, str.length()) + str.substring(0,i) + "ay";
               flag=true;
            }
         }
      }
      return str;
   }
}