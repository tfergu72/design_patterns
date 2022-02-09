import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
    
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> vote;
    private String school;
    private int numUpdates;

/**
 * Thomas Ferguson
 * Creates instance variables with placeholders allowing us
 * to change them later
 * @param school passes String school for initialization
 */
    public StudentGovPoll(String school){
        this.school = school;
        this.vote = new HashMap<String, Integer>();
        this.observers = new ArrayList<Observer>();
        this.numUpdates = 0;
        
    }
/**
 * Creates method which adds instances of the Observer type to 
 * ArrayList: "observers"
 */
    public void registerObserver(Observer observer){
        this.observers.add(observer);
        return;
    }
/**
 * Removes instances of Observer type from 
 * ArrayList: "observers"
 */
    public void removeObserver(Observer observer){
       for(int i = 0; i < observers.size(); i++){
           if(observers.get(i) == observer)
           observers.remove(i);
       }
       return;
    }
/**
 * Method for notifying observers
 */
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(vote);
        }
        this.numUpdates = 0;
        return;
    }
/**
 * Adds presidential candidates to vote HashMap
 * @param president the variable holding presidential candidates
 * of type String
 */
    public void addCandidate(String president){
        this.vote.put(president, 0);
        return;
    }
/**
 * Updates the vote totals for candidates
 * @param president variable of type string holding presidential
 * candidate
 * @param num variable of type int holding the number of votes
 */
    public void enterVotes(String president, int num){
    vote.replace(president, vote.get(president)+ num);
    this.numUpdates++;
    if(numUpdates == 4){
        notifyObservers();
    }
    return;
}
/**
 * Creates method of type String
 * @return name of the school which the poll corresponds to
 */
    public String getSchool(){
        return this.school;
    }
}
