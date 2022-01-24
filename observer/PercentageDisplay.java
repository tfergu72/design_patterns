import java.util.HashMap;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    public PercentageDisplay(Subject poll){
        if(votes.containsKey("CANDIDATE_1") ){
            numVotes += votes.get("CANDIDATE_1");
        }
        else if (votes.containsKey("CANDIDATE_2")){
            numVotes += votes.get("CANDIDATE_2");
        }
        if(votes.containsKey("CANDIDATE_1")){
            int vote1 = 0;
            vote1 = vote1/numVotes;
        } 
        if(votes.containsKey("CANDIDATE_2")) {
            int vote2 = 0;
            vote2 = vote2/numVotes;
        } 
    }
    public void update(HashMap<String, Integer> votes){
        Integer integer = numVotes;
        votes.put(String, Integer + 1);
    }
    private void display(){

    }
}
