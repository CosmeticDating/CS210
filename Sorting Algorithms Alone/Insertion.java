package Sorting;

import java.util.Arrays;

//Silly names given to aid in memorisation.  harry = array, hot = record and cold = temp
public class Insertion {
  public static void main(String args[]) {
    int[] arr = {1, 65, 8, 3, 18, 15, 53};

    // Iterate through the array beginning at element 1
    for(int i = 1; i < arr.length; i++) { 	
    	int selection = i;
    	
    	// Value held and stored outside of array temporarily
    	int temp = arr[i];
	
	    	// Loop to shift elements to make space
	    	while((selection > 0) && arr[selection - 1] >= temp) {
	    		// Shift array elements up one slot to make room for insertion
	    		arr[selection] = arr[selection - 1];
	    		
	    		// Move downwards
	    		selection--;
	    	}
        //Make the temp value the element value
    	arr[selection] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }
}
