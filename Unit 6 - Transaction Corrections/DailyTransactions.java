import java.util.*;

public class DailyTransactions {
   private ArrayList<Transaction> trans;

   public DailyTransactions() {
      trans = new ArrayList<Transaction>();
   }

   public ArrayList<Transaction> getTransactions() {
      return trans;
   }

   public void addTransaction(Transaction t) {
      trans.add(t);
   }

   public double findTransactionAverage() {
      double total = 0;
      for(int i = 0; i < trans.size(); i++) {
         total += trans.get(i).getTotal();
      }
      return total / ((trans.size() - 1) * 1.0);
   }
}