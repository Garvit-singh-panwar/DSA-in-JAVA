public class maxSumFromSubArraysUsingKadane_sAlgo {
   
// Kadane's Algo: Drop the negative baggage and keep the max gain.
// What Kadane says: 
// If adding a negative element makes your current subarray sum go below zero, 
// there’s no need to continue with it. 
// Just leave that subarray and start fresh from the next element.
// Why? Because a negative sum can't help you reach a new maximum.
// Starting a fresh subarray gives you a chance to build a bigger sum.
// If the new subarray's sum becomes greater than the previous max, 
// we update the max. Otherwise, we keep the old one.


// Example:
// If the array has all positive elements, 
// the max subarray sum will simply be the sum of all elements.
// Example: {1, 2, 3, 4, 5} → max sum = 15
//                    \---------/
//
// But if the first number is negative and reduces the sum,
// then any subarray that includes this value will become smaller.
// So, a subarray that *excludes* this negative number can give a larger sum.
// Example: {-4, 1, 2, 3, 4} → max sum from subarray {1, 2, 3, 4}
//
// What if the second element is also negative and reduces the sum further?
// Example: {-4, -5, 1, 2, 3, 4}
// Subarrays including -4 and -5 will have a lower sum.
// So, we skip them and start fresh from 1.
// The new subarray {1, 2, 3, 4} gives the max sum.
//
// ➤ That’s what Kadane says:
// If the current subarray sum becomes negative, it won’t help you.
// Leave it, and start a new subarray from the next element.

    public static int MaxSumfromAllSubArrays_Kadane_sAlgo(int array[]){
        int max = Integer.MIN_VALUE;
        int currele = 0;
        for(int i = 0 ; i < array.length ; i++){
          
            currele += array[i];

            if(currele > max){
                max = currele;
            }

            if(currele < 0){
                currele = 0;
            }
  
        }

        return max;

    } 
    
    public static void main(String[] args) {
        
        int array[] = {-1,2,-3,5,-5};

        System.out.println(MaxSumfromAllSubArrays_Kadane_sAlgo(array));

    }

}