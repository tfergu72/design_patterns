package strategy;
import java.util.ArrayList;
/*
* code referenced from: https://www.javatpoint.com/insertion-sort-in-java
* and: https://www.ccs.neu.edu/home/vkp/csu213-sp05/Lectures/InsertionSort.java
*/

public class InsertionSort implements SortBehavior{
    public ArrayList<String> sort(ArrayList<String> data){
        int index = 1;
		
		while (index < data.size()){
			insertSorted((String)(data.get(index)), data, index);
			index = index + 1;
		}
		return data;
	}	
	
	// insert the given (City) object into the given list
	// assuming elements 0 through index - 1 are sorted
	// use comp for comparison
    public ArrayList<String> insertSorted(String s, ArrayList<String> data, int index){
    		int loc = index - 1;
    		while ((loc >= 0) &&
    			  // c is smaller that the next highest element	
    			  (s.compareTo((String) data.get(loc)) <= 0)){
    			// move element to the right
    			data.set(loc + 1, data.get(loc));
    			loc = loc - 1;
    		}
    		data.set(loc+1, s);
    		return data;
    }
    // public static void insertionSort(int array[]) {  
    //     int n = array.length;  
    //     for (int j = 1; j < n; j++) {  
    //         int key = array[j];  
    //         int i = j-1;  
    //         while ( (i > -1) && ( array [i] > key ) ) {  
    //             array [i+1] = array [i];  
    //             i--;  
    //         }  
    //         array[i+1] = key;  
    //     }  
    // }

}