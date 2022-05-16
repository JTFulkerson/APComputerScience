public class Sale extends Transaction{
private boolean isCash;
public static final double DISCOUNT = 0.1;
public Sale(String d, int n, double i, boolean c) {
   super(d, n, i);
   isCash = c;
}

public boolean getIsCash() {
   return isCash;
}

public double getTotal() {
   if(isCash == false) {
      return super.getTotal();
   } else {
      double cost = super.getNumItems() * super.getItemCost();
      double newCost = cost - (cost * DISCOUNT);
      double tax = newCost * TAX_RATE;
      return newCost + tax;
   }
}
}