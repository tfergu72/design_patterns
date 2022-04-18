/**
 * @author Thomas Ferguson
 */
import java.util.*;

public class EnglishState implements State{
    
    private MusicBox box;
    

    public EnglishState(MusicBox box){
        this.box = box;
    }
    /**
     * Create array list with lyrics to twinkle twinkle little star
     * in english
     */
    @Override
    public void pressStarButton(){
        ArrayList<String> twinkleEnglish = new ArrayList<String>();
        twinkleEnglish.add("Playing: Twinkle Twinkle Little Star");
        twinkleEnglish.add("Twinkle Twinkle little star"); 
        twinkleEnglish.add("how I wonder what you are"); 
        twinkleEnglish.add("up above the world so high"); 
        twinkleEnglish.add("like a diamond in the sky");
        twinkleEnglish.add("Twinkle twinkle little star");
        twinkleEnglish.add("How I wonder what you are");
        box.playSong("Spanish", twinkleEnglish);
    }
    /**
     * Create array list with lyrics to twinkle twinkle little star
     * in english
     */
    @Override
    public void pressHappyButton(){
        ArrayList<String> happyAnd = new ArrayList<String>();
        happyAnd.add("Playing: If You're Happy And You Know It");
        happyAnd.add("If You're Happy And You Know It, Clap You're Hands"); 
        happyAnd.add("If You're Happy And You Know It, Clap You're Hands"); 
        happyAnd.add("If You're Happy And You Know It, Clap You're Hands"); 
        
        this.box.playSong("Spanish", happyAnd);
    }
    /**
     * Print a line telling user its already in english
     */
    public void pressEnglishButton(){
        System.out.println("You are already in English mode");
    }
    /**
     * Print a line stating that the program will switch to french
     * switches state to french
     */
    public void pressFrenchButton(){
        System.out.println("Switching to french");
        box.setState(box.getFrenchState());
    }
    /**
     * not done yt Print that the program is switching to 
     * spanish. switches state to Spanish
     */
    public void pressSpanishButton(){
        System.out.println("Switching to spanish");
        box.setState(box.getSpanishState());
    }
}
