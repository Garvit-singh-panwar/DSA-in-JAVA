package Assignment;

import java.util.Arrays;

// Question 1. GIven an integer array nums.
//  return true if any value appears at least twice in the array  
// and return false if every elements is distinct

// Example 1: input nums = [1,2,3,1]
// output : true

// Example 2: input nums=[1,2,3,4]
// output: false

// Example 3: nums = [ 1,1,1,3,3,4,3,2,4,2]
// output: true

public class question1 {

   // In this method, we first sort the array.
    // Sorting means putting the numbers in order like 1,1,2,3.
    // means arranging them in order (ascending or descending order)
    // After sorting, if any number is repeated, it will be next to each other.
    // So, we just check if nums[i] is equal to nums[i+1].
    // If we find two same numbers next to each other, return true.
    // If we reach the end and find no same numbers, return false.
    

    public static boolean appearTwice(int[] nums){
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length-2 ; i++ ){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int nums[] = {1,2,3,1};

        if(appearTwice(nums)){
            System.out.println("yes a value is appearing twice ");
        }
        else{
            System.out.println("no nothing is appearing twice ");
        }
    }
    
}