package GreedyAlgorithm;

import java.util.Arrays;
public class MinSumOfAbsoluteDifferencePair {

   public static void main(String args[]) {
        // Two input arrays
        int arr1[] = {1, 2, 3};
        int arr2[] = {3, 1, 2};

        // Step 1: Sort both arrays
        // This ensures we always pair smallest with smallest, 2nd smallest with 2nd smallest, etc.
        // This strategy minimizes the total absolute difference.
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Variable to store the sum of absolute differences
        int minAbsoluteDifference = 0;

        // Step 2: Pair elements at the same index and add their absolute difference
        for (int i = 0; i < arr1.length; i++) {
            // Math.abs ensures we always get a non-negative difference
            minAbsoluteDifference += Math.abs(arr1[i] - arr2[i]);
        }

        
        System.out.println("Minimum absolute difference of all pairs = " + minAbsoluteDifference);
    }
    



}