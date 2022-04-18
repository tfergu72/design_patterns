/**
 * @author Thomas Ferguson
 */
import java.util.*;

public class Spanish implements State {
    private MusicBox box;
    /**
     * initializes the MusicBox as box
    * @param box
    */
    public Spanish(MusicBox box){
        this.box = box;
    }
    /**
     * Creates/fills arraylist conaining twinkle twinkle little star in Spanish
     */
    public void pressStarButton(){
        ArrayList<String> twinkleSpanish = new ArrayList<String>();
        twinkleSpanish.add("Jugando: brilla brilla pequena estrella");
        twinkleSpanish.add("Brilla brilla pequena estrella"); 
        twinkleSpanish.add("Como me pregunto lo que eres"); 
        twinkleSpanish.add("Por encima de los mundos tan alto"); 
        twinkleSpanish.add("Como un diamante en el cielo");
        twinkleSpanish.add("BRILLA CENTELLEANTE PEQUENA ESTRELLA");
        twinkleSpanish.add("Como me pregunto lo que eres");
        this.box.playSong("Jugando: brilla brilla pequena estrella", twinkleSpanish);
    }
    /**
     * Creates/fills arraylist containing twinkle twinkle little star in Spanish
     */
    public void pressHappyButton(){
        ArrayList<String> happySpanish = new ArrayList<String>();
        happySpanish.add("Jugando: Si eres feliz y lo sabes");
        happySpanish.add("Si eres feliz y lo sabes, aplaude"); 
        happySpanish.add("Si eres feliz y lo sabes, aplaude"); 
        happySpanish.add("Si eres feliz y lo sabes, aplaude"); 
        happySpanish.add("Si eres feliz y lo sabes, aplaude");
        box.playSong("Jugando: Si eres feliz y lo sabes", happySpanish);
    }
    /**
     * Switches state to English
     */
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    /**
     * Switches state to french
     */
    public void pressFrenchButton(){
        System.out.println("Switching to French");
        box.setState(box.getFrenchState());
    }
    /**
     * States that the state is already in Spanish
     */
    public void pressSpanishButton(){
        System.out.println("Already in Spanish");
    }
}
