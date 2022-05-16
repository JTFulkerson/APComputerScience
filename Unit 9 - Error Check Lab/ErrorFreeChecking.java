import java.util.Scanner;

public class ErrorFreeChecking {
   public static void main(String[] args) {
      CheckingAccount a1 = null;
      Scanner input = new Scanner(System.in);
      System.out.println("ErrorFreeChecking Test\n");
      boolean flag = false;
      while(flag == false) {
         System.out.print("Please enter the starting balance --> ");
         try {
            a1 = new CheckingAccount(input.nextDouble(), 1663276);
            flag = true;
            System.out.println("");
            System.out.println("Account opened with balance of " + a1.getBalance() + "\n");
         }
         catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
         }
       
      }
      flag = false;
      
      while(flag == false) {
         System.out.print("Please enter the amount to deposit --> ");
         try {
            a1.deposit(input.nextDouble());
            flag = true;
            System.out.println("");
            System.out.println("Deposit made. Current account balance = " + a1.getBalance() + "\n");
         }
         catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
         }
      }
      flag = false;
      
      while(flag == false) {
         System.out.print("Please enter the amount to withdraw --> ");
         try {
            a1.withdraw(input.nextDouble());
            flag = true;
            System.out.println("");
            System.out.println("Withdrawal made. Current account balance = " + a1.getBalance() + "\n");
         }
         catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
         }
      }
      System.out.print("Thank you for using ErrorFreeChecking...goodbye!");
   }
}