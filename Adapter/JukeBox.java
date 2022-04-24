/**
 * @author Thomas Ferguson
 */
import java.util.*;
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;
    
    /**
     * contains hashmap of song titles to song objects
     */
    public JukeBox(){
        HashMap<String, Song> songs = new HashMap<String, Song>();
    }
    /**
     * method for adding song to hashmap (title is key)
     * @param song the value passed as a parameter
     */
    public void addSong(Song song){
        songs.put(song.getTitle(), song);
    }
    /**
     * method that displays the strings toString, 
     * only if the songName,is within the the hashmap of songs.
     * @param songName the name of a song 
     */
    public void play(String songName){
        //TODO
        if(songs.containsValue(songName) ){
            System.out.println(songs.toString());
        }else{
            System.out.println("Sorry");
        }
    }
}
