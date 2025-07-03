package Assignment;

// Given an integer array nums, find a subarray that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

public class question6 {

// What are we doing here?
//
// We want to find the maximum product of any subarray.
//
// To do this, we use three variables:
// - maxPos: the maximum positive product ending at the current index
// - maxNeg: the minimum (most negative) product ending at the current index
// - max: the overall maximum product found so far
//
// As we go through the array:
// - If the current number (array[i]) is negative, we swap maxPos and maxNeg.
//   Why? Because multiplying a negative number with the current maxNeg (which is negative)
//   can give a large positive result.
//   Also, if maxNeg was positive, it's still smaller than maxPos. So if we multiply it
//   with a negative number (without swapping), we would lose a potentially better negative product.
//   That's why we swap maxPos and maxNeg first.
//
// - Then, we update maxPos to be the maximum of:
//     - the current number itself
//     - current number * maxPos (i.e., extending the product subarray)
//
// - Similarly, we update maxNeg to be the minimum of:
//     - the current number itself
//     - current number * maxNeg
//   This way, we always track both the best and worst products ending at each index.
//
// - After that, we update the global max if maxPos is greater than the current max.
//
// We repeat this for each element in the array.

// ---------------------------------XXXXXXXX-----------------------------------------

// Example: Let's say the current number array[i] = -10
//
// Case 1:
// Suppose maxPos = 9, and maxNeg = -9
// If we multiply maxPos with -10 -> 9 * -10 = -90 (becomes negative)
// But if we swap maxPos and maxNeg first, then:
// maxPos = -9 -> -9 * -10 = 90 (positive and large)
//
// So swapping helps in cases where a negative number turns a negative product into a positive one.
//
// Case 2:
// Suppose maxPos = 9 and maxNeg = 4 (positive, but smaller than maxPos)
// Multiplying maxPos with -10 -> 9 * -10 = -90
// Multiplying maxNeg with -10 -> 4 * -10 = -40
//
// In this case, even after swapping, the result isn’t positive, but
// we still want to pick the **bigger** of:
// - the current number (-10)
// - maxPos * current number
//
// So we compare:
// Case 1: max(90, -10) = 90 -> maxPos = 90
// Case 2: max(-40, -10) = -10 -> maxPos = -10
//
// We do the same with maxNeg, but here we look for the **smallest** value:
// Case 1: min(-90, -10) = -90 -> maxNeg = -90
// Case 2: min(-40, -10) = -40 -> maxNeg = -40
//
// After updating maxPos and maxNeg,
// we check if maxPos is greater than the current global max,
// and update max accordingly:
//
// Case 1: max = max(9, 90) = 90
// Case 2: max = max(9, -10) = 9
//
// We repeat this process for every element (i < array.length),
// and finally return the value of max —
// which holds the maximum product of any subarray.

    public static int maxProductSubArray(int array[]){
        int maxNeg = array[0];
        int maxPos = array[0];
        int max = array[0];
        for(int i = 1 ; i< array.length; i++){

            if(array[i] < 0){
                int temp = maxNeg;
                maxNeg = maxPos;
                maxPos = temp;
            }

            maxPos = Math.max( maxPos*array[i] , array[i]);
            maxNeg = Math.min(maxNeg * array[i] , array[i]);
            max = Math.max(max, maxPos);
            
        }

        return max;
    }
    public static void main(String[] args)
    {

        int array[] = {-2,1,3,-1,5,6};

        System.out.println("max Product of subarray is : " + maxProductSubArray(array));

    }
}