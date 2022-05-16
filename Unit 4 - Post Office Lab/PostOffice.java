public class PostOffice {

   private Letter pobox[];
   
   public PostOffice(int size){
      pobox = new Letter[size];
   }

   public boolean placeLetter(Letter mail, int boxNum){
      if(boxNum < 0 || boxNum >= pobox.length || pobox[boxNum] != null){
         return false;
      }
      pobox[boxNum] = mail;
      return true;
   }
   public String retrieveMsg(int boxNum){
      if(boxNum >= pobox.length || boxNum < 0){
         return "Box does not exist!";
      }
      if(pobox[boxNum] == null){
         return "Empty!";
      }
      return pobox[boxNum].getMsg();
   }
  
   public Letter findSender(String name){
      for(int i = 0; i < pobox.length; i++){
         if(pobox[i] == null){
            
         } else if((pobox[i].getSender()).equals(name)){
            return pobox[i];
         }
      }
      return null;
   }
}
