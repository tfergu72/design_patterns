import java.util.*;

public class MathGame {
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands = {"+","-","*","/"};

    /**
     * Written by: Thomas Ferguson
     * Constructs math game, only once.
     */
    private MathGame(){
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
        play();
    }
    /**
     * Constructs instance of a Math Game.
     * @return instance of a Math Game.
     */
    public static MathGame getInstance(){
        if(mathGame == null){
            mathGame = new MathGame();
        }
        return mathGame;
    }
    /**
     * Allows user to decide if they want to play another math game.
     */
    public void play(){
        System.out.println("(P)lay or (Q)uit:");
        String play = reader.nextLine();
        if(play.equalsIgnoreCase("p")) {
            playRound();
        }
        else if(play.equalsIgnoreCase("q")){
            System.out.println("You won "+score+" games\nGoodbye!");
            System.exit(0);
        }
        else{
            System.out.println("Sorry, you must enter p or q");
            play();
        }
    }
    /**
     * Plays a Math Game round.
     * @return True if correct and false if wrong.
     */
    private boolean playRound(){
        int min = 1;
        int max = 100;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        int random_int1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        this.rand = new Random();
        int randomChar = rand.nextInt(this.operands.length);
        System.out.print(random_int + " " + this.operands[randomChar] + " " + random_int1 +" =\n");
        double answer = reader.nextDouble();
        if(this.operands[randomChar] == "+"){
            double addition = random_int + random_int1;
            if(answer == addition){
                score++;
                System.out.println("Well done! This is true! :)");
                play();
                return true;
            }
            else
            {
                System.out.println("Sorry, this is incorrect! :(\nThe correct answer is: "+addition);
                return false;
            }
        }
        if(this.operands[randomChar] == "-"){
            double subtraction = random_int - random_int1;
            if(answer == subtraction){
                score++;
                System.out.println("Well done! This is true! :)");
                play();
                return true;
            }
            else
            {
                System.out.println("Sorry, this is incorrect! :(\nThe correct answer is: "+subtraction);
                return false;
            }
        }
        if(this.operands[randomChar] == "*"){
            double multi = random_int * random_int1;
            if(answer == multi){
                score++;
                System.out.println("Well done! This is true! :)");
                play();
                return true;
            }
            else
            {
                System.out.println("Sorry, this is incorrect! :(\nThe correct answer is: "+multi);
                return false;
            }
        }
        if(this.operands[randomChar] == "/"){
            double div = random_int / random_int1;
            if(answer == div){
                score++;
                System.out.println("Well done! This is true! :)");
                play();
                return true;
            }
            else
            {
                System.out.println("Sorry, this is incorrect! :(\nThe correct answer is: "+div);
                return false;
            }
        }  
        return false;      
    }
}
