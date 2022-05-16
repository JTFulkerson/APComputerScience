import java.util.*;  
public class Playlist {
   //Instance variable
   private List<Song> songs;  //arraylist of songs
   private String name; //Playlist name
   
   public Playlist(String name) { 
      songs = new ArrayList<Song>();  //initalize Arraylist to hold Song type
      this.name = name;
   }

  //Returns the playlist name
   public String playlistName() {
      return name;   
   }

   //adds Song s to Playlist
   public boolean addSong(Song s) {
      return songs.add(s); 
   }
   
   //return list. Note return is List<Song>.
   public List<Song> getList() {
      return songs;
   }
   
   //remove Song s from Playlist
   public boolean removeSong(Song s) {
      for(int i = 0; i < songs.size(); i++) {
         if((songs.get(i)).getSongName().equals(s.getSongName())) {
            songs.remove(i);
            return true;
         }
      }
      return false;
   }
   
   //return number of songs in Playlist
   public int totalSongs() {
      return songs.size();
   }
   
   //return total duration of Playlist
   public double playlistTime() {
      double duration = 0.0;
      for(int i = 0; i < songs.size(); i++) {
         duration = duration + (songs.get(i)).getPlayTime();
      }
      return duration;
   }
   
   //Searches for particular song in Playlist
   public boolean isSongInPlaylist(String name) {
      for(int i = 0; i < songs.size(); i++) {
         if((songs.get(i)).getSongName().equals(name)) {
            return true;
         }
      }
      return false;
   }
   
   //Prints all songs by the artist in Playlist
   public void songsByArtist(String name) {
      for(int i = 0; i < songs.size(); i++) {
         if((songs.get(i)).getArtist().equals(name)) {
            System.out.println((songs.get(i)).toString());
         }
      }
   }
   
   //Ummmmm
   public boolean addSongsFrom(Playlist p) {
      List<Song> playlist = p.getList();
      if(playlist.size() == 0) {
         return false;
      }
      songs.addAll(playlist);
      return true;
   }
}//end of class Playlist
