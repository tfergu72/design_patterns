import java.util.HashMap;
/**
 * Thomas Ferguson
 * Creates interface Observer which hold the update method for
 * our HashMap: "vote"
 */
public interface Observer {
    public void update(HashMap<String, Integer> vote);
}
