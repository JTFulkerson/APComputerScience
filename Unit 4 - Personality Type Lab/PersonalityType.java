public class PersonalityType{
   public static int numberOfBs (Person h, int category){
      int answer = 0;
      char[] answers = h.getAnswers();
      for(int i = 1; i <= 70; i++){
         if(category == 1){
            if(i == 1 || i == 8 || i == 15 || i == 22 || i == 29 || i == 36 || i == 43 || i == 50 || i == 57 || i == 64){
               if(answers[i-1] == 'B'){
                  answer++;
               }
            }
         }
         if(category == 2){
            if(i == 2 || i == 3 || i == 9 || i == 10 || i == 16 || i == 17 || i == 23 || i == 24 || i == 30 || i == 31 || i == 37 || i == 38 || i == 44 || i == 45 || i == 51 || i == 52 || i == 58 || i == 59 || i == 65 || i == 66){
               if(answers[i-1] == 'B'){
                  answer++;
               }
            }
         }
         if(category == 3){
            if(i == 4 || i == 5 || i == 11 || i == 12 || i == 18 || i == 19 || i == 25 || i == 26 || i == 32 || i == 33 || i == 39 || i == 40 || i == 46 || i == 47 || i == 53 || i == 54 || i == 60 || i == 61 || i == 67 || i == 68){
               if(answers[i-1] == 'B'){
                  answer++;
               }
            }
         }
         if(category == 4){
            if(i == 6 || i == 7 || i == 13 || i == 14 || i == 20 || i == 21 || i == 27 || i == 28 || i == 34 || i == 35 || i == 41 || i == 42 || i == 48 || i == 49 || i == 55 || i == 56 || i == 62 || i == 63 || i == 69 || i == 70){
               if(answers[i-1] == 'B'){
                  answer++;
               }
            } 
         }
      }
      return answer;
   }
   public static int percentOfBs (Person h, int category){
      double answer = 0.0;
      if(category == 1){
         answer =  (numberOfBs(h, category) / 10.0) * 100;
      } else {
         answer = (numberOfBs(h, category) / 20.0) * 100;
      }
      return (int) answer;
   }
   public static String type (Person h){
      String personType = "";
      if(numberOfBs(h,1) < 5){
         personType += "I";
      } else {
         personType += "E";
      }
      if(numberOfBs(h,2) < 10){
         personType += "S";
      } else {
         personType += "N";
      }
      if(numberOfBs(h,3) < 10){
         personType += "T";
      } else {
         personType += "F";
      }
      if(numberOfBs(h,4) < 10){
         personType += "J";
      } else {
         personType += "P";
      }
      return personType;
   }
   public static void main(String[] args){
      char [] a5 = {'A','A','B','B','A','A','B','B','B','B','B','A','B','A','B','A','A','A','A','A','B','A','B','B','A','A','B','B','A','A','A','A','B','B','B','A','A','A','B','A','A','B','A','A','B','A','B','A','A','A','A','B','A','A','B','B','B','B','A','A','A','B','B','A','A','B','A','B','B','B'};
      Person snoopy= new Person("Snoopy",a5);
      System.out.println(numberOfBs(snoopy, 4));
      System.out.println(percentOfBs(snoopy, 4));
   }
}