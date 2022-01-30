/**
 * A symbols class
 * @author Thomas F
 */
public class Symbols extends PasswordDecorator 
{
    private Password passwordBeginning;
    char[] CharArray={'a','b','e','g','i','o','s','t'};
    char[] SymbolArr={'@','8','3','9','!','0','$','7'};
    /**
     * Creates a Symbols method which holds the
     * @param passwordBeginning
     */
    public Symbols(Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
    }
    /**
     * Creates a String method which uses a for loop to 
     * check the range of the password characters and replaces them
     * depending on the letters within the string.
     */
    public String getPassword()
    {
        String String1 = this.passwordBeginning.password;
        String String2 = "";
        for(int i=0; i<String1.length(); i++)
        {
            boolean replace = false;
            for(int j=0; j<CharArray.length; j++)
            {
                if (String1.charAt(i) == CharArray[j]) 
                {
                    String2 += SymbolArr[j];
                    replace = true;
                }                    
            }
            if(!replace)
            {
                String2 += String1.charAt(i);
            }

        }
        return String2;
    }
}
