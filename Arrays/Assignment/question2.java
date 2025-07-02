// Question2 :  there is an integer array nums sorted in ascending order (with distinct values).
// prior to being passed to your function .
//  nums is possibly rotated at an unknown pivot index k ( 1 <= k <nums.length) 
// such that the resulting array is [nums[k] , nums[k+1], ..., nums[n-1] , nums[0] , nums[1], ... , nums[k-1]] (0-indexed).
//  for example [0,1,2,4,5,6,7] might rotated at pivot index 3 and become [4,5,6,7,0,1,2]
// Given an array nums after possible rotated and an integer target , return the index of target if it si in nums or -1 if th is not in nums.
// you must mrite an algorithm with O(log n) runtime complexity

// Example1:   input  nums= [4,5,6,7,0,1,2] target = 0
// output: 4


// Example 2:  input nums= [4,5,6,7,0,1,2] target = 3
// output : -1

// Example 3: input: nums = [1] , target = 0 
// output : -1 


package Assignment;

public class question2 {

    // basically what this question is that
    // your array is passed into a function and is rotated to an unknown pivot 
    // means if the pivot is 3 all value is shifted 3 steps so the last value is at index 2 last 3rd at index 0 and last 2nd at index 1 thats how all value is shifted 
    // so now you have to return the index of the target you  if the target is not present return -1


    // Function Working 
    // what we are doing in the function:
    // we are using binary search to find the target fast (O(log n))

    // let’s take an example: [4,5,6,7,0,1,2]
    // here, the array was sorted but rotated
    // now we start with l = 0, r = nums.length - 1
    // and find mid = (l + r) / 2

    // if nums[mid] == target -> then we found the target, so we return mid

    // if not, we check:
    // is the left part sorted? we check this by: nums[l] <= nums[mid]
    // if this is true, then it means the left half is in correct sorted order

    // now we check if target lies between nums[l] and nums[mid]
    // if yes → target is in the left side, so we move right pointer -> r = mid - 1
    // if not → target might be on the right side, so we move left pointer -> l = mid + 1

    // but what if nums[l] > nums[mid]?
    // then it means the right half is sorted

    // so now we check: is target between nums[mid] and nums[r]?
    // if yes -> target is in the right part, so we move l = mid + 1
    // else -> target is in the left unsorted part, so we move r = mid - 1



    public static int findEle(int[] nums , int target){
        int l = 0;
        int r = nums.length-1;

        while(l<=r){

            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[l] <= nums[mid]){

                if(nums[l] <= target && nums[mid] > target){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }

            }
            else {
                
                    if (nums[mid] < target && target <= nums[r]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }

            }
        }

        return -1;
    }


    public static void main(String[] args) {
     
    

        
    }
}