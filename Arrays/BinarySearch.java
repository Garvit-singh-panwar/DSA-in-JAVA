// Binary search is always applied on a sorted array,
// whether it's sorted in increasing or decreasing order.

// To find a target element, we divide the array into two parts
// and access the middle value of the current search range.

// If the array is sorted in increasing order:
//   - The first half of the array contains elements smaller than the middle element.
//   - The second half contains elements greater than the middle element.

// We compare the middle value with the target:
//   - If it matches the target, we return its position.
//   - If the target is smaller than the middle value,
//     we discard the second half and continue searching in the first half.
//     (Because all elements in the second half are greater than mid, and so is the target.)
//   - If the target is greater than the middle value,
//     we discard the first half and search in the second half.
//     (Since the target is larger than mid, and all elements before mid are smaller.)

// This process is repeated (using loop or recursion) until the target is found or the search range is exhausted.

public class BinarySearch {

    public static int binarySearch(int array[] , int key){

        int l = 0 ;
        int r = array.length-1;
        while(l <= r){
            int mid = (l+r)/2; 

            if(array[mid] == key){
                return mid;
            }
            else if( array[mid] > key){
                r = mid -1;
            }
            else{
                l = mid+1;
            }

        }

        return -1;
        
    }

    public static void main(String[] args) {
        
        int array[] = { 1, 2, 3, 4, 5, 6 ,7,8 };

        int key = 6;

        int position = binarySearch(array, key);

        System.out.println("the position of " + key + " is : " + position);

    }
    
}