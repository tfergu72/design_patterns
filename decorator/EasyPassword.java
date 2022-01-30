import java.util.*;
/**
 * Creates class EasyPassword which extends abstract base class:
 * Password
 * @author Thomas F
 */
public class EasyPassword extends Password{
    public EasyPassword(String phrase){
        this.password = phrase;
    }
/**
 * Creates String method getPassword()
 * Compresses white space, uses int min and max to initialize the range
 * uses range to create a randomly generated number between 0 and 100
 * adds this number to the end
 * @return password with randomly generated number added to the end
 */
    public String getPassword(){
        password.replaceAll(" ", "");
        int min = 0, max = 100;
        int Rando = (int)Math.floor(Math.random()* (max-min+1)+min);
        String rand = Integer.toString(Rando);
        password = password + rand;
        return this.password;
    }
}
