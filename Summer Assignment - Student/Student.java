public class Student {
   private int id;
   private String name;
   private double gpa;
   public Student(int i, String n, double g) {
      id = i;
      name = n;
      gpa = g;
   }
   public String toString() {
      return name + "'s ID number is " + id + " and he has a " + gpa + " GPA.";
   }
   public int getID() {
      return id;
   }
   public String getName() {
      return name;
   }
   public double getGPA() {
      return gpa;
   }
   public void setID(int i) {
      id = i;
   }
   public void setName(String n) {
      name = n;
   }
      public void setGPA(double g) {
      gpa = g;
   }
}