import java.util.ArrayList;

/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2006.03.30
*/
public class Notebook
{
    // Storage for an arbitrary number of notes.
   private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
   public Notebook()
   {
      notes = new ArrayList<String>();
   }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
   public void storeNote(String note)
   {
      notes.add(note);
   }
   public void storeUrgentNote(String note)
   {
      notes.add(0, "Urgent: " + note);
   }
   
   public void demoteNote(int index)
   {
      if(index < 0 || index > notes.size() - 1)
      {
      
      } else
      {
         String tempNote = notes.get(index);
         notes.remove(index);
         if(tempNote.startsWith("Urgent: "))
         {
            tempNote = tempNote.substring(8, tempNote.length());
         }
         notes.add(tempNote);
      }
   }
   public void swapNotes(int index)
   {
      if(index < 0 || index > notes.size() - 2)
      {
      
      } else
      {
         String tempNote = notes.get(index);
         String tempNote2 = notes.get(index + 1);
         if(tempNote.startsWith("Urgent: ") && tempNote2.startsWith("Urgent: "))
         {
         
         } else if(tempNote.startsWith("Urgent: "))
         {
            tempNote = tempNote.substring(8, tempNote.length());
            tempNote2 = "Urgent: " + tempNote2;
         }
         notes.set(index, tempNote2);
         notes.set( index + 1, tempNote);
      }
   }
   
    /**
     * @return The number of notes currently in the notebook.
     */
   public int numberOfNotes()
   {
      return notes.size();
   }

    /**
     * Remove a note from the notebook if it exists.
     * @param noteNumber The number of the note to be removed.
     */
   public void removeNote(int noteNumber)
   {
      if(noteNumber < 0)
      {
            // This is not a valid note number, so do nothing.
      }
      else if(noteNumber < numberOfNotes())
      {
            // This is a valid note number.
         notes.remove(noteNumber);
      }
      else {
            // This is not a valid note number, so do nothing.
      }
   }

    /**
     * List all notes in the notebook.
     */
   public void listNotes()
   {
      int counter = 0;
      for(String note : notes)
      {
         System.out.println(counter + ") " + note);
         counter++;
      }
   }
   public void listUrgentNotes()
   {
      int counter = 0;
      for(String note : notes)
      {
         if(note.startsWith("Urgent: "))
         {
            System.out.println(counter + ") " + note);
            counter++;
         }
      }
   }
}
