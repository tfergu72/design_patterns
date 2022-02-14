public class ExerciseIterator implements Iterator{
    
    private Exercise[] exercise;
    private int position;
    /**
     * Thomas Ferguson
     * Creates exercise iterator
     * @param exercises The array of exercises that will be iterated through
     */
    public ExerciseIterator(Exercise[] exercise){
        this.exercise = exercise;
    }
    /**
     * Checks whether the array has next element.
     */
    public boolean hasNext(){
        if(position >= exercise.length || exercise[position] == null){
            return false;
        } else {
            return true;
        }
    }
    /**
     * Returns the next element that is in the exercises array
     */
    public Exercise next(){
        Exercise next = exercise[position];
        position++;
        return next;
        
    }
    
}
