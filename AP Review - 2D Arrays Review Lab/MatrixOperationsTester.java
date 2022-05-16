public class MatrixOperationsTester {
   public static void main(String[] args) {
      MatrixOperations g1  = new MatrixOperations(); 
      double[][] aa = {{1,2,3},{7,8,4,},{2,7,11}};                 
      double[][] bb = {{1,-2,9},{7,8,-6},{21,17,9}};
      double[][] cc = {{7,8},{21,17}};
   
      double [][]hold = g1.scalarMultiplication(aa,-5);		
      g1.printMatrix (hold);
      System.out.println();
   
      hold =  g1.scalarMultiplication(aa,2.0/3);
      g1.printMatrix (hold);					
      System.out.println(); 
      
      hold=  g1.addMatrix(aa,bb);
      g1.printMatrix (hold);
      System.out.println();  
   
      hold=  g1.addMatrix(aa,cc); // not possible
      g1.printMatrix (hold); // outputs: Operation cannot be performed
      System.out.println();
   
      hold=  g1.subtractMatrix(aa,bb);
      g1.printMatrix (hold);
      System.out.println();
      
      double [][] m1 =  {{1, 2, -2,0},{-3, 4, 7, 2,},{6, 0, 3, 1}};                
      double [][] m2 ={{-1,3},{0,9},{1, -11},{4, -5}};
      double [][] m3 ={{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
      double [][] m4 ={{-1.5,3.4},{0,9.8},{1.1,-11.5},{4.7,-5.6}};
      hold=  g1.multiplyMatrix(m1, bb); // not possible
      g1.printMatrix (hold); // outputs: Operation cannot be performed
      System.out.println();
   
      hold=  g1.multiplyMatrix(m1, m2);                 
      g1.printMatrix (hold);
      System.out.println();  
      
      hold=  g1.multiplyMatrix(m3, m4);                 
      g1.printMatrix (hold);
      System.out.println();  
   
   }
}