import java.util.*;
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercise;
    private int numExercises;

    /**
     * Thomas Ferguson
     * Constructs a new exercise array
     * @param firstName the first name of the pt
     * @param lastName the last name of the pt
     * @param bio the bio of the pt
     */
    public PT(String firstName, String lastName, String bio){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        exercise = new Exercise[2];
    }
    /**
     * Adds an exercise to the array
     * @param title The name of the exercise
     * @param muscleGroups The muscle group that is focused on
     * @param directions The directions of the exercise
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions)
    {
        if(numExercises != exercise.length) {
            Exercise newExercise = new Exercise(title, muscleGroups, directions);
            exercise[numExercises] = newExercise;
            numExercises++;
        } else
        {
            growArray(exercise);
        }
    }
    /**
     * Returns the first name of the pt
     * @return firstName
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     * Returns the last name of the pt
     * @return lastName
     */
    public String getLastName(){
        return this.lastName;
    }
    /**
     * Returns the bio of the pt
     * @return bio
     */
    public String getBio(){
        return this.bio;
    }
    /**
     * Grows the array
     * @param exercise the exercise array
     * @return Returns longer array
     */
    private Exercise[] growArray(Exercise[] exercise){
        Exercise[] tempExercises = new Exercise[exercise.length*2];
        for(int i=0; i<exercise.length; i++){
            tempExercises[i] = exercise[i];
        }
        return tempExercises;
    }
    /**
     * Creates an exercise iterator
     * @return Returns new exercise iterator
     */
    public ExerciseIterator createIterator(){
        ExerciseIterator exerciseIterator = new ExerciseIterator(exercise);
        return exerciseIterator;
    }
    /**
     * Formats a return statement for the pt's first name
     * last name and bio
     */
    public String toString(){
        return firstName + " " + lastName + "\n" + bio + "\n";
    }

}
