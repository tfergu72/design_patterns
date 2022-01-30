import java.util.Random;
/**
 * Special Characters class which extends PasswordDecorator
 * @author Thomas F
 */
public class SpecialChars extends PasswordDecorator{
    
    private static final int upperB = 101;
    Random random = new Random();
    private static final char[] Characters = {'*','!','%','+','.','{','}'};
    private Password passwordBeginning;
/**
 * Creates the variable passwordBeginning and passes it to Password instance
 * to allow for changing.
 */
    public SpecialChars(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }
/**
 * creates as well as assigns the return string to passwordBeginning
 * randomly appends symbols after all characters within string.
 * @return A string of the passwordBeginning variable's .getPassword()
 * with symbols.
 */
    public String getPassword(){
        String String1 = passwordBeginning.getPassword();
        String String2 = "";
        for(int i=0;i<String1.length();i++){
            int ran = random.nextInt(upperB);
            if(ran<30)
            {
                String2 += (String1.charAt(i));
                String2 += Characters[random.nextInt(Characters.length)];
            }
            else
                String2 += String1.charAt(i);
        }
        
        return String2;
    }
}
