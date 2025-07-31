import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
// Find if any pair in a sorted & Rotated ArrayList has a target sum. 
// list = [11,15,6,8,9,10]      target = 16


public class PairSumInSortedRotatedArray {


    public static boolean findPairSum(ArrayList<Integer> list , int target){
        int pivot = 0;
        int n = list.size();
        for(int i = 0 ; i < n-1 ; i++){
            if(list.get(i) > list.get(i+1)){
                pivot  = i;
            }
        }
                              // let say n = 6
        int l = (pivot+1)%n;  // if the array is not rotated then our pivot = 5
        // so pivot +1 = 6 which is out of bond 
        // thats why we did modulo   6 % 6 = 0; 
        int r = pivot;

        while(list.get(r) > list.get(l) ){

            int value = list.get(l)+list.get(r);
            if(value == target){
                return true;
            }
            else if(value > target){
                
                r = (n-r-1)%n;  // think if n = 6 , l = 1 
                                // (6+1-1)/6 = 0;
                                // and if l = 0;
                                // (6+0-1) % 6  = 6
                                // 6-1 = 5 and 5 % 6 = 5
            }
            else{
                l = (l+1)%n;  
                // let say l = 2 and n = 6
                //  (2+1)%6 = 3%6 = 3
                // but now n = 5 
                // 5+1 = 6 and 6%6 = 0;
            }

        }

        return false;
    }

    

    // through this function we are rotating an array at ith index
    public static void rotateAtPivotI(ArrayList<Integer> list , int indx){

        int l = 0 ;
        int r = list.size()-1;

        // we are reversing the full array
        while(l < r ){
            int temp = list.get(l);
            list.set(l , list.get(r));
            list.set(r, temp);
            l++ ;
            r--;

        }
        l = 0;
        r = indx;
        // we are reversing the array up to index
        while(l < r){
            int temp = list.get(l);
            list.set(l , list.get(r));
            list.set(r, temp);
            l++ ;
            r--;
        }
        l= indx+1;
        r = list.size()-1;
        // we are reversing the array after index
        while(l < r){
             int temp = list.get(l);
            list.set(l , list.get(r));
            list.set(r, temp);
            l++;
            r--;
        }

    }

    public static void main(String[] args){

        ArrayList <Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of array ");
        System.out.println("Enter 1101 if you want to exit");
        int k = sc.nextInt();

        while(k != 1101 ){
            list.add(k);
            k = sc.nextInt();
        }

        Collections.sort(list);

        int indx = 3;
        rotateAtPivotI(list, indx);

        int target = 12;
        if(findPairSum(list, target)){
            System.out.println("target found");
        }
        else{
            System.out.println("target not found");
        }

        
    }


}