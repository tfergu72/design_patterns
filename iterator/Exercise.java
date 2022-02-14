import java.util.ArrayList;
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Thomas Ferguson
     * Constructs a new Exercise
     * @param title Title of the exercise
     */
    public Exercise(String title){ //NOT NEEDED
        this.title = title;
    }
    /**
    * 
    * @param title
    * @param targetMuscles
    * @param directions
    */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions){
        this.title = title;
        targetMuscles = new ArrayList<String>();
        targetMuscles.add("Quads, Glutes, Hamstrings");
        directions = new ArrayList<String>();
    }
    /**
     * Adds a target muscle
     * @param muscle name of muscle to be added
     */
    public void addTargetMuscle(String muscle){ // NOT CALLED
        String targetMuscle = new String(muscle);
        targetMuscles.add(targetMuscle);
    }
    /**
     * Removes a target muscle
     * @param muscle name of muscle to be removed
     */
    public void removeTargetMuscle(String muscle){ //NOT CALLED
        String targetMuscle = new String(muscle);
        targetMuscles.remove(targetMuscle);
    }
    public String toString(){
        return "\n... " + title + " ...\nMuscles: " + "Quads, Glutes, Hamstrings" + "\nExercises:";

    }
}
