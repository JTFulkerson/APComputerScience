public class NotebookTester
{
   public static void main(String[] args)
   {
      Notebook book;
      book = new Notebook();
      book.storeNote("This is my first note.");
      book.storeNote("Second note.");
      book.listNotes();
      book.storeUrgentNote("This is apparently urgent.");
      book.listNotes();
   
      Notebook book1;
      book1 = new Notebook();
      book1.storeNote("one");
      book1.storeNote("two");
      book1.storeNote("three");
      book1.listNotes();
      book1.removeNote(0);
      book1.listNotes();
      System.out.println();
   
      Notebook book2;
      book2 = new Notebook();
      book2.storeNote("This is my first note.");
      book2.storeNote("Second note.");
      book2.storeUrgentNote("This is apparently urgent.");
      book2.storeUrgentNote("This is urgent too.");
      book2.listNotes();
      book2.listUrgentNotes();
      System.out.println();
   
      
      Notebook book3;
      book3 = new Notebook();
      book3.storeNote("this is a non-urgent note");
      book3.storeNote("this note is also not urgent");
      book3.storeUrgentNote("Remember to study for exam!");
      book3.listNotes();
      book3.demoteNote(0);
      book3.listNotes();
      System.out.println();
   
      Notebook book4;
      book4 = new Notebook();
      book4.storeNote("one");
      book4.storeNote("two");
      book4.storeNote("three");
      book4.listNotes();
      book4.swapNotes(1);
      book4.listNotes();
      System.out.println();
      
      Notebook book5;
      book5 = new Notebook();
      book5.storeNote("one");
      book5.storeNote("two");
      book5.storeUrgentNote("UU22");
      book5.storeNote("three");
      book5.listNotes();
      book5.swapNotes(0);
      book5.listNotes();
   }   
}