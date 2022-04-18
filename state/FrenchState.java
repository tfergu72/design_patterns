/**
 * @author Thomas Ferguson
 */
import java.util.*;

public class FrenchState implements State {
    private MusicBox box;

    public FrenchState(MusicBox box){
        this.box = box;
    }
    /**
     * Creates arraylist of French twinkle twinkle little star
     */
    @Override
    public void pressStarButton(){
        ArrayList<String> twinkleFrench = new ArrayList<String>();
        twinkleFrench.add("Jouer: petite etoile scintillante scintillante");
        twinkleFrench.add("petite etoile scintillante scintillante"); 
        twinkleFrench.add("comment je me demande ce que vous etes"); 
        twinkleFrench.add("audessus du monde si haut"); 
        twinkleFrench.add("comme un diamant dans le ciel");
        twinkleFrench.add("petite etoile scintillante scintillante");
        twinkleFrench.add("comment je me demande ce que vous êtes");
        this.box.playSong("French", twinkleFrench);
    }
    /**
     * Creates an arraylist for the if you're happy and you know it
     * in French
     */
    @Override
    public void pressHappyButton(){
        ArrayList<String> happyFrench = new ArrayList<String>();
        happyFrench.add("Jouer: si vous etes heureux et que vous le savez");
        happyFrench.add("si vous etes heureux et que vous le savez, tapez dans vos mains"); 
        happyFrench.add("si vous etes heureux et que vous le savez, tapez dans vos mains"); 
        happyFrench.add("si vous etes heureux et que vous le savez, tapez dans vos mains"); 
        happyFrench.add("si vous etes heureux et que vous le savez, tapez dans vos mains");
        this.box.playSong("French", happyFrench);
    }
    /**
     * Switches state to English
     */
    public void pressEnglishButton(){
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }
    /**
     * States that the state is already in french
     */
    public void pressFrenchButton(){
        System.out.println("Already in French");
    }
    /**
     * Switches state to Spanish
     */
    public void pressSpanishButton(){
        System.out.println("Switching to Spanish");
        box.setState(box.getSpanishState());
    }
}
