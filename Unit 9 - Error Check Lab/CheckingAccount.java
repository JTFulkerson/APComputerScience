public class CheckingAccount{ 
   private double myBalance; 
   private int myAccountNumber; 

   public CheckingAccount(){ 
      myBalance = 0.0; 
      myAccountNumber = 0; 
   } 
   public CheckingAccount(double initialBalance, int acctNum){ 
      if(initialBalance >= 0) {
         myBalance = initialBalance; 
         myAccountNumber = acctNum; 
      } else {
         throw new IllegalArgumentException("Error CheckingAccount: negative initial balance");
      }
   } 

   public double getBalance(){ 
      return myBalance; 
   } 

   public void deposit(double amount){
      if(amount >= 0) {
         myBalance += amount; 
      } else {
         throw new IllegalArgumentException("Error deposit: negative amount");
      }
   } 
   public void withdraw(double amount){ 
      if(amount >= 0 && amount <= myBalance) {
         myBalance -= amount; 
      } else {
         throw new IllegalArgumentException("Error withdraw: illegal amount");
      }
   } 
}