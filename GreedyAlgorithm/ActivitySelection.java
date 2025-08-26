package GreedyAlgorithm;

// you have given n activities with their start and end times
// Select the maximum number of activities that can be performed by a single person 
// Accuming that a person can only work on a single activity at a time .
// Activities are sorted according to end time 

// Start = [10,12,20];
// end = [20,25,30];

// Ans = 2(A0 & A2)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {


    public static void main(String args[]){

        int start[] = {10,12,20};
        int end[] = {20,25,30};

        int n = start.length;

        // Step 1: Store activities as {start, end, index}
        int activities[][] = new int[n][3];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];  // start
            activities[i][1] = end[i];    // end
            activities[i][2] = i;         // index (to identify original activity)
        }

        // Step 2: Sort by end time using Comparator
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        // Step 3: Greedy selection
        ArrayList<Integer> selected = new ArrayList<>();

        selected.add(activities[0][2]); // select first activity

        int lastEnd = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEnd) {
                selected.add(activities[i][2]);
                lastEnd = activities[i][1];
            }
        }

        // Step 4: Print result
        
        System.out.println("Selected activity indices: " + selected);
        System.out.println("Maximum number of activities: " + selected.size());
        

    }
    
    
}