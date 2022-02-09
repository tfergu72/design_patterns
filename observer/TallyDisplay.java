import java.util.HashMap;
public class TallyDisplay implements Observer{
    private HashMap<String, Integer> vote;
    private Subject poll;
/**
 * Thomas Ferguson 
 * 
 * Initializes the subject poll and other objects for modification
 * @param poll passes the subject poll for initialization
 */
    public TallyDisplay(Subject poll){
        this.poll = poll;
        this.poll.registerObserver(this);
        this.vote = new HashMap<String,Integer>();
    }
/**
 * Creates a public void update method that updates the votes
 * hashmap in order to match
 */
    public void update(HashMap<String, Integer> vote){
        if(this.vote.size() < 4){
            this.vote.putAll(vote);
            display();
            return;
        }
    }

/**
 * Display method that prints the output of current tallies
 */
    private void display(){
        System.out.println("\nCurrent Tallies:");
        for(String k: this.vote.keySet()){
            System.out.println(k+": " + this.vote.get(k));
        }
        return;
    }
}
