import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import java.io.*;
import java.util.*;


public class ElectricBillTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();


   @Before
    public void setUpStreams() {
      System.setOut(new PrintStream(outContent));
      System.setErr(new PrintStream(errContent));
    }
    
    public void writeData(String filename) throws Exception {
    
        Scanner oldFile = new Scanner(new File(filename));
        BufferedWriter newFile = new BufferedWriter(new FileWriter("billdata.txt"));
        while (oldFile.hasNext()) {
            newFile.write(oldFile.nextLine()+"\n");
        }
        oldFile.close();
        newFile.close();
        
    }
    
    public String getNthLine(int n) throws Exception {
      ElectricBill.main(new String[]{});
      String output = outContent.toString();
      String[] outarr = output.split("\n");
      return outarr[n].trim();
    }

    @Test
    public void largestBillTest19() throws Exception {
      writeData("frewelec19.txt");
      String outline = getNthLine(0);
      assertEquals("Largest bill: $144.53 (August)", outline);
    }
    
    @Test
    public void totalTest19() throws Exception {
      writeData("frewelec19.txt");
      String outline = getNthLine(1);
      assertEquals("Total for year: $910.33", outline);
    }
    
    //https://www.georgiapower.com/residential/manage-your-account/my-power-usage.html
    @Test
    public void largestBillTestGA() throws Exception {
      writeData("elecgeorgia.txt");
      String outline = getNthLine(0);
      assertEquals("Largest bill: $352.18 (July)", outline);
    }
    
    @Test
    public void totalTestGA() throws Exception {
      writeData("elecgeorgia.txt");
      String outline = getNthLine(1);
      assertEquals("Total for year: $2,546.59", outline);
    }
    
    @Test
    public void errorTest() throws Exception {
      writeData("elec-oops.txt");
      String outline = getNthLine(0);
      boolean err = outline.toLowerCase().contains("error");
      assertTrue("Expecting error but was " + outline, err);
    }
    
    @After
    public void cleanUpStreams() {
      System.setOut(null);
      System.setErr(null);
    }
}
