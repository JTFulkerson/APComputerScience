public class MyListTester{
   public static void main(String[] args){
      String [] ar1 ={"ham","anchovies","zzz","extra cheese","zzz","zzz","ground beef","zzz","mushrooms","onions","pepperoni","zzz","zzz","peppers","sausage"};
      String [] ar2={"ham",null, "anchovies","zzz", null, null, "apple", null, "zzz", "zzz", null, "beef", "grapes", "candy", null};
      String [] full={"11","12","9","15","5","7","1","2","14","4","3","6","8","10","13"};
      String [] thisIsShort = {"bbq", "chicken", "cheese", "pinapple", "onion"};
      Pizza pizza1 = new Pizza (ar1);
      Pizza pizza2 = new Pizza (ar2);
      Pizza pizza3 = new Pizza(full);
      Pizza pizza4 = new Pizza(thisIsShort);
      System.out.println(pizza1.getNumTopping()); //9
      System.out.println(pizza3.getNumTopping()); //15
      System.out.println(pizza2.getNumTopping()); //6
      pizza1.printTopping();
      System.out.println(pizza1.binarySearch("ham")); //3
      System.out.println(pizza3.binarySearch("9")); //14
      System.out.println(pizza3.binarySearch("ground beef")); //-1
      System.out.println(pizza1.binarySearch("sausage")); //8
      System.out.println(pizza1.binarySearch("milk")); //-1
      System.out.println(pizza2.binarySearch("coca-cola")); //-1
      System.out.println(pizza2.binarySearch("ham")); //5
      System.out.println(pizza2.binarySearch("beef")); //2
      System.out.println(pizza1.addTopping("pineapple")); //true
      System.out.println(pizza3.addTopping("pineapple")); //false
      //System.out.println(pizza3.addTopping("apple"));
      //System.out.println(pizza3.addTopping("orange"));
      //System.out.println(pizza3.addTopping("grape"));
      //System.out.println(pizza3.getNumTopping()); //15
      //pizza1.addTopping("pineapple");
      //pizza1.addTopping("tomato");
      /*System.out.println(pizza1.getNumTopping()); //11
      pizza2.addTopping("aaaa");
      Assert.assertEquals(0, pizza2.binarySearch("aaaa"));
   */
      System.out.println(pizza1.addTopping("avocado"));        
      System.out.println(pizza1.addTopping("pineapple"));    
      //pizza1.addTopping("tomato");
      //pizza1.addTopping("eggs");
      //pizza1.addTopping("green peppers");
      //pizza1.addTopping("olives");
      //pizza1.addTopping("dog food");
      //pizza1.addTopping("more dog food");
   /*
      pizza1.addTopping("avocado");        
      pizza1.addTopping("pineapple");    
      pizza1.addTopping("tomato");
      pizza1.addTopping("eggs");
      pizza1.addTopping("green peppers");
      pizza1.addTopping("olives");
      pizza1.addTopping("dog food");  
      pizza1.addTopping("more dog food"); 
      Assert.assertEquals(14, pizza1.binarySearch("tomato"));
   //
      pizza1.addTopping("avocado");        
      pizza1.addTopping("pineapple");    
      pizza1.addTopping("tomato");
      pizza1.addTopping("eggs");
      pizza1.addTopping("green peppers");
      pizza1.addTopping("olives");
      pizza1.addTopping("dog food");  
      pizza1.addTopping("more dog food"); 
      Assert.assertEquals(9, pizza1.binarySearch("onions"));
   
   
   //
      pizza2.addTopping("avocado");        
      pizza2.addTopping("pineapple");    
      pizza2.addTopping("tomato");
      pizza2.addTopping("eggs");
      pizza2.addTopping("green peppers");
      pizza2.addTopping("olives");
      pizza2.addTopping("dog food");  
      pizza2.addTopping("more dog food"); 
      Assert.assertEquals(14, pizza2.getNumTopping());
   }
   
   
   */
   }
}