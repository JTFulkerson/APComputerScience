import java.util.*;
public class MessageCipher {
   private String[][] letterBlock;
   private int numRows;
   private int numCols;

   public MessageCipher (int row, int col){
      numRows=row;
      numCols=col;
      letterBlock = new String[row][col];
   }

   public void fillBlock(String str) {
      int counter = 0;
      for(int row = 0; row < letterBlock.length; row++) {
         for(int col = 0; col < letterBlock[0].length; col++) {
            if(counter > str.length() - 1) {
               letterBlock[row][col] = "A";
            } else {
               letterBlock[row][col] = str.substring(counter, counter + 1);
               counter++;
            }
         }
      }
   }
   
   public void printTable() {
      for(int row = 0; row < letterBlock.length; row++) {
         for(int col = 0; col < letterBlock[0].length; col++) {
            System.out.print(letterBlock[row][col] + "  ");
         }
         System.out.println();
      }
   }

   public String [][] getTable() {
      return letterBlock;
   }

   public String encryptBlock() {
      String message = "";
      for(int j = 0; j < letterBlock[0].length; j++) {
         for(int i = 0; i < letterBlock.length; i++) {
            message = message + letterBlock[i][j];
         }
      }
      return message;
   }
   
   public String encryptMessage(String str) {
      String message = "";
      for(int i = 0; i < str.length(); i += numRows * numCols) {
         fillBlock(str.substring(i));
         message += encryptBlock();
      }
      return message;
   }    
}
