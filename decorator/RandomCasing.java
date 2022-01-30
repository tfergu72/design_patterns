import java.util.Random;

public class RandomCasing extends PasswordDecorator {
    
    private Password passwordBeginning;
    private int upB = 101;
    Random random = new Random();
    int randomNum=random.nextInt(upB);
    
    public RandomCasing(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }

    public String getPassword()
    {
     String String1=passwordBeginning.getPassword();
     String String2= "";
     for(int i=0; i<String1.length(); i++){
        int randomNum=random.nextInt(upB);
        if(randomNum < 50)
            String1 = String1.toUpperCase();
            else
            String1 = String1.toLowerCase();
            String2 += String1.charAt(i);
     }
     return String2;   
    }
}


