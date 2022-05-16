public class StudentTester {
   public static void main(String[] args) {
      Student s1 = new Student(1234, "James Smith", 3.6);
      Student s2 = new Student(5831, "John Fulkerson", 3.8);
      Student s3 = new Student(5156, "Claire Smith", 4.0);
      Student s4 = new Student(6425, "Sam Johnson", 3.2);
      Student s5 = new Student(4268, "Ellie Williams", 3.5);
      System.out.println(s1);
      System.out.println(s2.getID());
      System.out.println(s3.getName());
      System.out.println(s4.getGPA());
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
      System.out.println(s5);
   }
}