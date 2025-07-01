package Assignment;

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

    public static boolean appearTwice(int[] nums){
        for(int i = 0 ; i< nums.length ; i++){
            for(int j = i+1 ; j< nums.length ; j++ ){
                if(nums[i] == nums[j]){
                    return true;
                }
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