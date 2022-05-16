public class DiggingIntoInheritanceTester {
   public static void main(String[] args) {
      One var1 = new Two();
      One var2 = new Three();
      One var3 = new Four();
      Three var4 = new Four();
      Object var5 = new Three();
      Object var6 = new One();
      
      //var1.method1();
      //var2.method1();
      //var3.method1();
      //var4.method1();
      //var5.method1();//compiler error
      //var6.method1();//compiler error
      //var4.method2();
      //var4.method3();//compiler error
      //((Two)var1).method2();//compiler error
      //((Three)var1).method2();
      //((Two)var1).method3();
      //((Four)var2).method1();
      //((Four)var3).method1();
      //((Four)var4).method3();
      //((One)var5).method1();
      //((Four)var5).method2();
      //((Three)var5).method2();
      //((One)var6).method1();
      //((One)var6).method2();//compiler error
      //((Two)var6).method3();
   }
}