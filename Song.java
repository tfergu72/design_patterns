/**
 * @author Thomas Ferguson
 */
public abstract class Song {
    
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();
    
    /**
     * returns a string representation of a song
     */
    public String toString(){
        //TODO
        /*
        System.out.println(getTitle() + "\nAlbum" + getAlbum() + 
        "\nBy: " + getArtistFirstName() + " " + getArtistLastName()
        + "\nGenre: " + getGenre());
        return null;
        */
        return getTitle() + "\nAlbum: " + getAlbum() + "\nBy: " +
        getArtistFirstName() + " " + getArtistLastName() + "\nGenre: "
        + getGenre();
    }
}
