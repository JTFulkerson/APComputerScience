public class Name{
   private String first;
   private String middle;
   private String last;
   public Name (){
      first = "";
      middle = "";
      last = "";
   }
   public Name (String f, String m, String l){
      first = f;
      middle = m;
      last = l;
   }
   public String getFirst (){
      return first;
   }
   public String getMiddle (){
      return middle;
   }
   public String getLast (){
      return last;
   }
   public void setMiddle (String m){
      middle = m;
   }
   public boolean equals (Name n){
      return this.first.equals(n.first) && this.middle.equals(n.middle) && this.last.equals(n.last);
   }
   public String formalName (String title){
      return title + " " + this.last;
   }
   public boolean needsNickname (){
      return this.first.length() > 6;
   }
   public Name marries (Name wife){
      return new Name (wife.first, wife.last, this.last);
   }
}