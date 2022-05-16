import java.util.Arrays;

public class SimpleDate{
   private int day;
   private int month;
   private int year;
   
   //Construct a new SimpleDate object with the day=1, month=1 and year=initYear.
   public SimpleDate (int initYear){
      day = 1;
      month = 1;
      year = initYear;
   }
   
   //Construct a new SimpleDate object with the day=1, month=initMonth and year=initYear.
   public SimpleDate (int initMonth, int initYear){
      day = 1;
      if (initMonth <= 0 || initMonth > 12){
         month = 1;
      } else{
         month = initMonth;
      }
      year = initYear;
   }
   
   //Construct a new SimpleDate object with the day=initDay, month=initMonth and year=initYear.
   public SimpleDate (int initDay, int initMonth, int initYear){
      SimpleDate temp = new SimpleDate(initMonth, initYear);
      if (initDay <= 0 || initDay > temp.daysInMonth()){
         day = 1;
      } else{
         day = initDay;
      }
      if (initMonth <= 0 || initMonth > 12){
         month = 1;
      } else{
         month = initMonth;
      }
      year = initYear;
   }
   
   //Advance this SimpleDate to the next day. 
   public void advanceDay (){
      if (this.day == this.daysInMonth() && this.month == 12){
         this.day = 1;
         this.advanceMonth();
      } else if (this.day == this.daysInMonth()){
         day = 1;
         month++;
      } else if(this.day < this.daysInMonth()){
         this.day += 1;
      }
   }
   
   //Advance this SimpleDate to the same day next month.
   public void advanceMonth (){
      if (this.month == 12){
         this.month = 1;
         this.year++;
      } else{
         this.month += 1;
      }
      if(this.day > this.daysInMonth()){
         this.day = this.daysInMonth();
      }
   }
   
   //Advance this SimpleDate to the same day next year.
   public void advanceYear (){
      this.year += 1;
      if(this.day > this.daysInMonth()){
         this.day = this.daysInMonth();
      }
   }
   
   //Return the number of days in the month represented by this SimpleDate.
   public int daysInMonth (){
      int[] days = {31, -1, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      if (days[this.month - 1] != -1){
         return days[this.month - 1];
      } else if(this.isLeapYear() == true){
         return 29;
      } else{
         return 28;
      }
   }
   
   //Return the day represented by this SimpleDate.
   public int getDay (){
      return day;
   }
   
   //Return a long string representation of the SimpleDate object.
   public String getLongDate (){
      String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      return months[this.month - 1] + " " + this.day + ", " + this.year;
   }
   
   //Return the month represented by this SimpleDate.
   public int getMonth (){
      return month;
   }
   
   //Return a short string representation of this SimpleDate object.
   public String getShortDate (){
      return month + "/" + day + "/" + year;
   }
   
   //Return the year represented by this SimpleDate.
   public int getYear (){
      return year;
   }
   
   //Return true if the year represented by this SimpleDate is a leap year, otherwise return false.
   public boolean isLeapYear(){
      if(year % 400 == 0){
         return true;
      }
      if(year % 100 == 0){
         return false;
      }
      if(year % 4 == 0){
         return true;
      }
      return false;
   }
}