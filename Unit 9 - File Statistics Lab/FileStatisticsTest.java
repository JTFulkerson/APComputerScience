import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import java.io.*;
import java.util.*;


public class FileStatisticsTest {


   private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    
   ByteArrayInputStream in1 = new ByteArrayInputStream("aesop.txt\r\n".getBytes());
   ByteArrayInputStream in2 = new ByteArrayInputStream("cavity.txt\r\n".getBytes());
   ByteArrayInputStream in3 = new ByteArrayInputStream("like.txt\r\n".getBytes());
   
   String[] out1 = {"1. A Boy was given permission to put his hand into a pitcher to get some filberts. But he took such a great fistful that he could not draw his hand out again. There he stood, unwilling to give up a single filbert and yet unable to get them all out at once. Vexed and disappointed he began to cry.\r\n",
                    "2. \"My boy,\" said his mother, \"be satisfied with half the nuts you have taken and you will easily get your hand out. Then perhaps you may have some more filberts some other time.\"\r\n",
                    "3. Do not attempt too much at once.\r\n", "\r\n",
                    "Lines: 3\r\n","Characters: 501\r\n","Vowels: 154\r\n",
                    "E's: 44\r\n", "Non letters: 110\r\n", "Sentences: 7\r\n",
                    "Uppercase letters: 8"};
   String[] out2 = {"1. This is an appealing story.\r\n",
                    "2. One day, a hermit brother about to leave for town went to a brother who lived nearby and who had continual compunction. He said to his fervent neighbor, \"Please do me the kindness, brother, of taking care of my garden until my return.\" The other replied, \"Believe me, brother, I will do my best not to neglect it.\" After the brother's departure, he said to himself, Now take care of this garden. And from evening until dawn he stood in psalmody, ceaselessly shedding tears. He prayed the same way for the entire day. Coming home late, the brother found that hedgehogs had ravaged his garden.\r\n",
                    "3. He said, \"God forgive you, brother, for not taking care of my garden.\"\r\n",
                    "4. The other answered, \"God knows I did my best to keep it, and I hope through God's mercy that the little garden will bear fruit.\"\r\n",
                    "5. The brother said, \"But it has been completely destroyed!\"\r\n",
                    "6. The other replied, \"I know, but I have confidence in God that it will flower again.\"\r\n",
                    "7. But he was speaking of the effort of his continual tears, the weeping for one's sins in the hope of salvation, and of the garden of his heart, watered by him and in full flower.\r\n",
                    "\r\n",
                    "Lines: 7\r\n","Characters: 1134\r\n","Vowels: 330\r\n",
                    "E's: 119\r\n", "Non letters: 251\r\n", "Sentences: 13\r\n",
                    "Uppercase letters: 26"};
   String[] out3 = {"1. She could see she was becoming a thoroughly unlikable person. Each time she opened her mouth she said something ugly, and whoever was nearby liked her a little less. These could be strangers, these could be people she loved, or people she knew only slightly whom she had hoped would one day be her friends. Even if she didn't say anything, even if all she did is seem a certain way, have a look on her face, or make a soft sound of reaction, it was always unlikable-except in the few cases that she fixed herself on being likable for the next four seconds (more than that was impossible) and sometimes that worked, but not always.\r\n",
                    "2. Why couldn't she be more likable? What was the problem? Did she just not enjoy the world anymore? Had the world gotten away from her? Had the world gotten worse? (Maybe, probably not. Or probably in some ways but not in the ways that were making her not like it). Did she not like herself? (Well, of course she didn't, but there was nothing new in that.)\r\n",
                    "3. Or had she become less likable simply by growing older-so that she might be doing the same thing she always did, but because she was now forty-one, not twenty, it had become unlikable because any woman doing something at forty-one is more unlikable than a woman doing it at twenty? And does she sense this? Does she know she is intrinsically less likable and instead of resisting, does she lean into it, as into a cold wind? Maybe (likely) she used to resist, but now she sees the futility, so each morning when she opens her mouth she is unlikable, proudly so, and each evening before sleep she is unlikable, and each day it goes on this way, she getting more unlikable by the hour, until one morning she will be so unlikable, inconveniently unlikable, that she will have to be shoved into a hole and left there.\r\n",
                    "\r\n",
                    "Lines: 3\r\n","Characters: 1797\r\n","Vowels: 528\r\n",
                    "E's: 197\r\n", "Non letters: 385\r\n", "Sentences: 17\r\n",
                    "Uppercase letters: 17"};

   @Before
    public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
      System.setErr(new PrintStream(errContent));
    }
    
    public String[] LineNTest(int n, ByteArrayInputStream in, String[] out) throws Exception {
      System.setIn(in);
      FileStatistics.main(new String[]{});
      String output = outContent.toString();
      String[] outarr = output.split("\n");
      return new String[]{outarr[n], out[n].trim(), outarr[n].trim()};
    }


   @Test
   public void aesopLine1Test() throws Exception {
      String[] lines = LineNTest(0, in1, out1);
      lines[0] = lines[0].replaceFirst("^[^1]*1", "1");
      lines[2] = lines[2].replaceFirst("^[^1]*1", "1");
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopLine2Test() throws Exception {
      String[] lines = LineNTest(1, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }   @Test
   public void aesopLine3Test() throws Exception {
      String[] lines = LineNTest(2, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopLinesTest() throws Exception {
      String[] lines = LineNTest(4, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopCharactersTest() throws Exception {
      String[] lines = LineNTest(5, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopVowelsTest() throws Exception {
      String[] lines = LineNTest(6, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopEsTest() throws Exception {
      String[] lines = LineNTest(7, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopNonLettersTest() throws Exception {
      String[] lines = LineNTest(8, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopSentencesTest() throws Exception {
      String[] lines = LineNTest(9, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void aesopUpperTest() throws Exception {
      String[] lines = LineNTest(10, in1, out1);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   
   @Test
   public void cavityLine1Test() throws Exception {
      String[] lines = LineNTest(0, in2, out2);
      lines[0] = lines[0].replaceFirst("^[^1]*1", "1");
      lines[2] = lines[2].replaceFirst("^[^1]*1", "1");
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLine2Test() throws Exception {
      String[] lines = LineNTest(1, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLine3Test() throws Exception {
      String[] lines = LineNTest(2, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLine4Test() throws Exception {
      String[] lines = LineNTest(3, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLine5Test() throws Exception {
      String[] lines = LineNTest(4, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLine6Test() throws Exception {
      String[] lines = LineNTest(5, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLine7Test() throws Exception {
      String[] lines = LineNTest(6, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityLinesTest() throws Exception {
      String[] lines = LineNTest(8, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityCharactersTest() throws Exception {
      String[] lines = LineNTest(9, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityVowelsTest() throws Exception {
      String[] lines = LineNTest(10, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityEsTest() throws Exception {
      String[] lines = LineNTest(11, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityNonLettersTest() throws Exception {
      String[] lines = LineNTest(12, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavitySentencesTest() throws Exception {
      String[] lines = LineNTest(13, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void cavityUpperTest() throws Exception {
      String[] lines = LineNTest(14, in2, out2);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   
   @Test
   public void likeLine1Test() throws Exception {
      String[] lines = LineNTest(0, in3, out3);
      lines[0] = lines[0].replaceFirst("^[^1]*1", "1");
      lines[2] = lines[2].replaceFirst("^[^1]*1", "1");
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeLine2Test() throws Exception {
      String[] lines = LineNTest(1, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }   @Test
   public void likeLine3Test() throws Exception {
      String[] lines = LineNTest(2, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeLinesTest() throws Exception {
      String[] lines = LineNTest(4, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeCharactersTest() throws Exception {
      String[] lines = LineNTest(5, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeVowelsTest() throws Exception {
      String[] lines = LineNTest(6, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeEsTest() throws Exception {
      String[] lines = LineNTest(7, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeNonLettersTest() throws Exception {
      String[] lines = LineNTest(8, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeSentencesTest() throws Exception {
      String[] lines = LineNTest(9, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }
   @Test
   public void likeUpperTest() throws Exception {
      String[] lines = LineNTest(10, in3, out3);
      assertEquals(lines[0], lines[1], lines[2]);
   }


   
   @After
   public void cleanUpStreams() {
     System.setOut(null);
     System.setErr(null);
     System.setIn(System.in);
   }
}
