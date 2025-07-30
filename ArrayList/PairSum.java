import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PairSum{
    
    public static boolean bruteforce(ArrayList <Integer> list , int target){
        
        for(int i = 0 ; i < list.size()-1; i++){
            for(int j = i+1 ; j < list.size() ; j++){

                if(list.get(i) + list.get(j) == target){
                    return true;
                }

            }
        }

        return false;
    }

    // What we are doing here:
    // 1. First, we sort the array (if it's not already sorted).
    // 2. We place one pointer at the leftmost element (start of array),
    //    and one pointer at the rightmost element (end of array).
    // 3. We check if the sum of elements at left + right == target.
    //    - If yes, we return true (we found the pair).
    // 4. If the sum is greater than the target,
    //    that means the numbers are too big,
    //    so we move the right pointer one step left (towards smaller numbers).
    // 5. If the sum is less than the target,
    //    that means the numbers are too small,
    //    so we move the left pointer one step right (towards bigger numbers).
    // 6. We keep doing this until both pointers cross each other.
    //    If no pair is found, we return false.



    // if we dont find any element we return false
    public static boolean twoPointerApproach(ArrayList <Integer> list , int target){

        Collections.sort(list);
        int l =0 ;
        int r = list.size()-1;

        while(l<r){
            if(list.get(l)+list.get(r)== target){
                return true;
            }
            else if(list.get(l)+list.get(r) > target){
                r--;
            }
            else{
                l++;
            }

        }

        return false;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> array = new ArrayList<>();
        System.out.println("Enter elements of arraylist");

        System.out.println("enter 001 to exit");
        int k = 0;
        do{
            int i = sc.nextInt();
            if(i != 001){
                array.add(i);
            }
            k = i;
        }while(k != 001);

        int target = 13;

        if(twoPointerApproach(array, target)){
            System.out.println("the sum of two elements of array is equal to the target");
        }
        else{
            System.out.println("no the sum of two elements is not equal to the target");
        } 

    }

}