public class HorseBarn {
   private Horse[] spaces;
   public HorseBarn (Horse [] hh) {
      spaces = hh;
   }
   public Horse getHorseAt(int index) {
      if(index > spaces.length - 1 || index < 0) {
         return null;
      }
      return spaces[index];
   }
   
   public  int findHorseSpace(String name) {
      int index = -1;
      for(int i = 0; i < spaces.length; i++) {
         if(spaces[i] == null) {
         
         } else if(name.equals(spaces[i].getName())) {
            return i;
         }
      }
      return index;
   }
                        
   public void consolidate() {
      Horse[] newBarn = new Horse[spaces.length];
      int index = 0;
      for(int i = 0; i < spaces.length; i++) {
         if(spaces[i] != null) {
            newBarn[index] = spaces[i];
            index++;
         }
      }
      spaces = newBarn;
   }
}