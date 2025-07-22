package Assignment;

// Question 2 : given an array nums of size n , return the majority element (medium)
// The majority element is the element that appears more than [n/2] times , you may assume that the majority element always exist in the array

// Sample Input 1 :- nums = [3,2,3];
// Sample output 1 :- 3  

// Sample Input 2 :- nums = [2,2,1,1,1,2,2];
// Sample output 2 :- 2 

// Constraints(extra Conditions):
//  n == nums.length
//  1 <= n <= 5 * 104
//  -109 <= nums[i] <= 109

public class Question2 {


// This function starts the process of finding the majority element.
// It simply calls the recursive helper function with the full array range.
public static int findMajorityElement(int[] array) {
    return helper_FindMajority(array, 0, array.length - 1);
}

// This helper function uses the Divide and Conquer approach to find the majority element.
// Parameters:
// - array: the input array
// - l: the left (starting) index
// - r: the right (ending) index
public static int helper_FindMajority(int[] array, int l, int r) {

    // Base case: if only one element is left, return it as the majority element of that segment
    if (l == r) {
        return array[l];
    }

    // Find the middle index to divide the array
    int mid = (l + r) / 2;

    // Recursively find the majority element in the left half
    int leftMajority = helper_FindMajority(array, l, mid);

    // Recursively find the majority element in the right half
    int rightMajority = helper_FindMajority(array, mid + 1, r);

    // If both halves return the same majority element, it is the majority overall
    if (leftMajority == rightMajority) {
        return leftMajority;
    }

    // Otherwise, count the frequency of both candidates in their respective halves
    int leftCount = majority(array, leftMajority, l, r);
    int rightCount = majority(array, rightMajority, l, r);

    // Return the one that appears more frequently
    return (leftCount > rightCount) ? leftMajority : rightMajority;
}

// This function counts how many times a given candidate appears in array[l...r]
public static int majority(int[] array, int candidate, int l, int r) {
    int count = 0;
    for (int i = l; i <= r; i++) {
        if (array[i] == candidate) {
            count++;
        }
    }
    return count;
}


    public static void main(String[] args) {
        
        int array[] = {2,2,1,1,1,2,2};

        int majority = findMajorityElement(array);

        System.out.println("the majority element in the array is " + majority);



    }
    
}