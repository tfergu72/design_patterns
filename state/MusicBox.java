/**
 * @author Thomas Ferguson
 */
import java.util.ArrayList;

public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    
    private State state;

/**
 * Constructor for MusicBox class
 */
public MusicBox(){
    englishState = new EnglishState(this);
    frenchState = new FrenchState(this);
    spanishState = new Spanish(this);
    this.state = englishState;
    
}
/**
 * Method for calling the press star button on state
 */
public void pressStarButton(){
    state.pressStarButton();
}
/**
 * Method for calling the press happy button on state
 */
public void pressHappyButton(){
    state.pressHappyButton();
}
/**
 * Method for calling the press english button on state
 */
public void pressEnglishButton(){
    state.pressEnglishButton();
}
/**
 * Method for calling the press french button on state
 */
public void pressFrenchButton(){
    state.pressFrenchButton();
}
/**
 * Method for calling the press spanish button on state
 */
public void pressSpanishButton(){
    state.pressSpanishButton();
}
/**
 * Method for changing the state
 * @param state the state variable being changed
 */
public void setState(State state){
    this.state = state;
}
/**
 * getter for english state
 * @return the english state
 */
public State getEnglishState(){
    return englishState;
    
}
/**
 * getter for french state
 * @return the french state
 */
public State getFrenchState(){
    return frenchState;

}
/**
 * getter for spanish state
 * @return the spanish state
 */
public State getSpanishState(){
    return spanishState;
    
}
/**
 * Method for displaying the lyrics from the arraylist of a song.
 * @param songName parameter for the name of the song
 * @param lyrics parameter for the lyrics of the song
 */
public void playSong(String songName, ArrayList<String> lyrics){
 System.out.println("ArrayList: ");
for(String twinkleEnglish  : lyrics){
    System.out.print(songName);
}
}

}
