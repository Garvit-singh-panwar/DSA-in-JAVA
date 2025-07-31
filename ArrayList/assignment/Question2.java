package assignment;
// Question 2 
// Lonely Number in Array list 
// you are given an integer arraylist nums . A number x is lonely when it appears only once , 
// and no adjacent numbers (i.e. x+1 ans x-1) appear in the arraylist.

// return all lonealy numbers in nums . you may return the answer in any order.

// sample input 1  : nums = [10,6,5,8];
// sample output: [10,8];

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question2 {


// What we are doing in this function:
// We are finding all the *lonely elements* in the array.
// A lonely element is one that has:
// - No element equal to it,
// - No element that is one less (element - 1),
// - No element that is one more (element + 1).

// To check this, we follow these steps:

// 1. Sort the original array so that all elements are in ascending order.
//    This helps us easily check the neighbors because now for any i,
//    we know that array[i-1] <= array[i] <= array[i+1].

// 2. Create a new ArrayList `lonelyNum` to store all lonely elements.

// 3. Iterate through the sorted array from index i = 0 to i < array.length.
//    For each element, we assume it is lonely by default:
//    boolean isLonely = true;

// 4. Let curr = array[i]; this is the current element we're checking.

// 5. Check the previous element (i > 0):
//    - If array[i - 1] == curr OR array[i - 1] + 1 == curr,
//      then the current element is *not* lonely.
//      => Set isLonely = false;

// 6. Check the next element (i < n - 1):
//    - If array[i + 1] == curr OR array[i + 1] - 1 == curr,
//      then the current element is *not* lonely.
//      => Set isLonely = false;

// 7. If after both checks, isLonely is still true,
//    then we add curr to our result list `lonelyNum`.

    public static ArrayList LonelyNummber(ArrayList<Integer> Array){
    Collections.sort(Array);
    ArrayList<Integer> lonelyNum = new ArrayList<>();
    int n = Array.size();    
        for(int i = 0 ; i < n ; i++){
            int curr = Array.get(i);
            boolean isLonely = true;

            if( i > 0 && Array.get(i-1)+1 == curr || Array.get(i-1) == curr ){
                isLonely = false;
            }

            if(i < n-1 && Array.get(i+1)+1 == curr || Array.get(i+1) == curr  ){
                isLonely = false;
            }

            if(isLonely){
                lonelyNum.add(i);
            }


        }
        
    


    return lonelyNum;

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> Array = new ArrayList<>();

        System.out.println("Enter elements of array");
        System.out.println("Enter 1011 to exit");
        
        int k = sc.nextInt();

        while(k != 1011 ){
            Array.add(k);
            k = sc.nextInt();
        }

        System.out.println("unique elements in our array list is " + LonelyNummber(Array));

    }
    
}




