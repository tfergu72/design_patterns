/**
 * @author Thomas Ferguson
 */
public class Track extends Song{
    
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;
    /**
    * constructor for a track
    * @param title
    * @param album
    * @param firstName
    * @param lastName
    * @param genre
    */
    public Track(String title, String album, 
    String firstName, String lastName, Genre genre){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }
    /**
     * accessor for getting title
     */
    public String getTitle(){
        return title;
    }
    /**
     * accessor for getting album
     */
    public String getAlbum(){
        return album;
    }
    /**
     * accessor for getting the artists first name
     */
    public String getArtistFirstName(){
        return firstName;
    }
    /**
     * accessor for getting the artists last name
     */
    public String getArtistLastName(){
        return lastName;
    }
    /**
     * accessor for getting the genre
     */
    public String getGenre(){
        //TODO
        return null;
    }
}
