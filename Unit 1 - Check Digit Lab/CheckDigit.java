public class CheckDigit {
   public static void main(String args[]){
      //System.out.println(getDigit(283415,1));//Done
      //System.out.println(getDigit(283415,5));//Done
      //System.out.println(getNumberOfDigits(283415));//Done
      //System.out.println(getCheck(283415));
      //System.out.println(getCheck(2183));
      //System.out.println(getCheck(159));
      System.out.println(isValid(1592));
      System.out.println(isValid(1593));
   }
/** Returns the number of digits in num.
    Precondition: num>=0
 */ 
   public static int getNumberOfDigits(int num){
      int i = 1;
      num = num/10;
      while(num>0) {
         num = num/10;
         i++;
      }
      return i;
   } 
  /** Returns the nth digit of num. 
  * Precondition: n >= 1 and n <= the number of digits in num 
  */
   public static int getDigit(int num, int n){
      return (num / (int) Math.pow(10,getNumberOfDigits(num) - n)) % 10; 
   } 
/** Returns the check digit for num, as described below. 
  * Precondition: The number of digits in num is between one and 
  * six, inclusive. 
  * num >= 0 
  */
   public static int getCheck(int num){
      int sum = 0;
      int i = 7;
      for(int counter = 1; counter <= getNumberOfDigits(num); counter++) {
         sum = sum + (getDigit(num,counter)*i);
         i--;
      }
      return sum % 10;
   } 
/** Returns true if numWithCheckDigit is valid, or false 
  * otherwise, as described in part 3). 
  * Precondition: The number of digits in numWithCheckDigit 
  * is between two and seven, inclusive.
  * numWithCheckDigit >= 0 
  */ 
   public static boolean isValid(int numWithCheckDigit) {
      return numWithCheckDigit % 10 == getCheck(numWithCheckDigit / 10);
   } 
}