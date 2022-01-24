import java.util.HashMap;

public class TallyDisplay implements Observer{
    private Subject poll;
    private HashMap<String, Integer> votes;

    public TallyDisplay(Subject poll){
        this.poll = poll;
    }

    public void update(HashMap<String, Integer> votes){
        if(this.votes.size() < 4){
            this.votes.update(votes);
        }
    }
    private void display(){
        this.votes.update();
    }
}
