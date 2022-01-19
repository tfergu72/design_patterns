package strategy;
import java.util.ArrayList;

public class Listing {
    private String Title;
    private ArrayList<String> items = new ArrayList<>();
    private SortBehavior sortBehavior; 
    
    public Listing(String Title) {
        this.Title = Title;
    }

    public String getTitle() {
        return Title;
    }


    public void add(String item){
        items.add(item);
    }


    public void remove(String item){
        items.remove(item);
    }

    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }
    public ArrayList<String> getUnSortedList(){
        return items;
    }

    public ArrayList<String> getSortedList(){
        return sortBehavior.sort(items);
    }
}