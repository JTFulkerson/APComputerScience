import java.io.*;
import java.util.*;
import java.text.*;

public class ElectricBill {
   public static void main(String[] args) throws FileNotFoundException {
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); 
      double largestBill = 0;
      String largestBillMonth = null;
      String MONTHS[] = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      double total = 0;
      int currentMonth = -1;
      Scanner input = new Scanner(new File("billdata.txt"));
      while(input.hasNext()) {
         double temp = input.nextDouble();
         currentMonth++;
         total += temp;
         if(temp > largestBill) {
            largestBill = temp;
            largestBillMonth = MONTHS[currentMonth];
         }
      }
      if(currentMonth >= 11) {    
         System.out.println("Largest bill: $" + Math.round(largestBill * 100.0) / 100.0 + " (" + largestBillMonth + ")");
         System.out.println("Total for year: " + n.format(total)); //Math.round(total * 100.0) / 100.0)
      } else {
         System.out.println("error billdata: Does not contain 12 months of bills");
      }
   }
}