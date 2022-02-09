import java.text.DecimalFormat;
import java.util.HashMap;
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> vote;
    private int nVotes;
/**
 * Thomas Ferguson
 * Initializes variables/objects for changing
 * @param poll
 */
    public PercentageDisplay(Subject poll){
        this.poll = poll;
        this.poll.registerObserver(this);
        this.vote = new HashMap<String,Integer>();
        this.nVotes = 0;
    }
/**
 * Contains the total num of votes from hashmap
 */
    public void update(HashMap<String, Integer> vote){
        for(String k : vote.keySet()){
            this.nVotes += vote.get(k);
        }
        for(String k: vote.keySet())
            this.vote.put(k, vote.get(k));
            display();
            return;
    }
/**
 * Calculates the percentage of votes for each candidate
 * and displays them
 */
    private void display(){
       DecimalFormat df = new DecimalFormat("###.#");
        System.out.println("\nCurrent Percent of Votes:");
        for(String k: this.vote.keySet()){
            double ret = this.vote.get(k);
            System.out.println(k + ": " + df.format((ret/nVotes)+100)+"%");
        }
    }
}
