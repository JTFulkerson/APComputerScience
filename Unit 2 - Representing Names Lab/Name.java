public class Name{
   private String First;
   private String Middle;
   private String Last;
   public Name(String first, String middle, String last){
      First = first;
      Middle = middle;
      Last = last;
   }
   public Name(){
      First = "";
      Middle = "";
      Last = "";
   }
   public String getFirst(){
      return First;
   }
   public String getMiddle(){
      return Middle;
   }
   public String getLast(){
      return Last;
   }
   public String firstMiddleLast(){
      return First + " " + Middle + " " + Last;
   }
   public String lastFirstMiddle(){
      return Last + ", " + First + " " + Middle;
   }
   public boolean equals(Name otherName){
   return otherName.getFirst().equalsIgnoreCase(this.First) && otherName.getMiddle().equalsIgnoreCase(this.Middle) && otherName.getLast().equalsIgnoreCase(this.Last);
   }
   public String initials(){
   String tempName = "";
   if(First != ""){
   tempName += (First.substring(0,1)).toUpperCase();
   }
   if(Middle != ""){
   tempName += (Middle.substring(0,1)).toUpperCase();
   }
   if(Last != ""){
   tempName += (Last.substring(0,1)).toUpperCase();
   }
   return tempName;
   }
   public int length(){
      String fullName = First + Middle + Last;
      return fullName.length();
   }
   public static void main(String[] args) {
      Name n1 = new Name("Michelle", "Suzanne", "Reaves Taylor");
      Name n2 = new Name("Michelle Suzanne", "Reaves", "Taylor");
      Name n3 = new Name("MiCHelle", "suzanNE", "reaves Taylor");
      System.out.println(n1.equals(n3));
      System.out.println(n1.equals(n2));
   }
}