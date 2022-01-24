import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
    
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    public StudentGovPoll(String school){
        this.school = new String();
        
    }
    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    public void notifyObserver(){
        this.observers.notifyAll();
    }
    public void addCandidate(String president){
        this.addCandidate(president);
    }
    public void enterVotes(String president, int num){
        
    }
    public String getSchool(){
        return school;
    }
}
