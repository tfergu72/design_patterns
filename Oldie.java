/**
 * @author Thomas Ferguson
 */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Constructor for oldie
     * @param artistName first name and last name separated by a space
     * @param songTitle song title separated by spaces (if need be)
     * @param recordTitle record title separated by spaces (if need be)
     * @param category category of music (string with spaces)
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category){
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }
    /**
     * Getter that returns artist name
     */
    public String getArtistName(){
        return artistName;
    }
    /**
     * Getter that returns "title : album"
     */
    public String getDisplayTitle(){
        return songTitle + recordTitle;
    }
    /**
     * Getter that returns the category of music
     * oof
     */
    public String getCategory(){
        return category;
    }
}
