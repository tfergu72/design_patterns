/**
 * Thomas Ferguson
 * Creates an interface: Subject which holds the following methods:
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
