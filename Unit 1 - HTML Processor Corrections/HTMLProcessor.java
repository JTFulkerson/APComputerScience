public class HTMLProcessor{
   public static String findFirstTag(String text){
      int start = text.indexOf("<");
      int end = text.indexOf(">");
      if(start == -1){
         return null;
      }
      return text.substring(start,end + 1);
   }
   public static String remove(String text, String str){
      int position = text.indexOf(str);
      if(position == -1){
         return text;
      }
      String tempText = text.substring(0,position) + text.substring(position + str.length(),text.length());
      return tempText;
   }
   public static String removeAllTags(String text){
      String tempText = text;
      while(tempText.indexOf("<") != -1){
         tempText = remove(tempText,findFirstTag(tempText));
      }
      return tempText;
   }
}