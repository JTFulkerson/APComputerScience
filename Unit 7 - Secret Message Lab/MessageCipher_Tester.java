import java.util.*;
public class MessageCipher_Tester
{
   public static void main (String [] args){
      MessageCipher puzzle= new MessageCipher(3,5);
      puzzle.fillBlock("Meet at midnight");
      puzzle.printTable();
      puzzle.fillBlock("Meet at noon");
      puzzle.printTable();
      System.out.println(puzzle.encryptBlock()); 
  }
}
