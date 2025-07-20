// Question 1 . For a given integer array of size N. you have to find all the occurences (indices) of a given element (key) and print them. use a recursive function to solve this problem.

// Sample Input: arr[] = {3,2,4,5,6,2,7,2,2} , key = 2
// Sample output: 1,3,5,8

package recursion.Assignment;

public class question1 {

    public static void allOccurenceOfKey(int array[], int i , int key){
        if(i == array.length){
            return;
        }

        if(array[i] == key){
            System.out.print( i + " ");
        }
        
        allOccurenceOfKey(array, i+1, key);
    }


    public static void main(String[] args) {
        
        int key = 2;
        int arr[] = {3,2,4,5,6,2,7,2,2} ;

        allOccurenceOfKey(arr, 0 , key);


    }

}