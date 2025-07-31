// Question1
// Monotonic ArrayList(Easy)
// An array list is monotonic if it is either monotone increasing or monotone decreasing.

// An Array list is monotone increasing if gor all i<= j , nums.get(i) <= nums.get(j).
// An ArrayList  nums is monotone decreasing if for all i<=j, nums.get(i) >= nums.get(j);

// gets an integer array nums , return true if the given list is monotonic , or false otherwise

package assignment;
import java.util.Scanner;
import java.util.ArrayList; 

public class question1 {
    public static boolean monotonic(ArrayList<Integer> list){

        boolean monotonicInc = true;
        boolean monotonicDec = true;

        int i = 0 ;
         int j = i+1;
        while(j< list.size()){
            if(list.get(i) > list.get(j) ){
                monotonicInc = false;
            }
            if(list.get(i) < list.get(j)){
                monotonicDec = false;
            }
            i++;
            j++;
        }

        if(monotonicInc||monotonicDec){
            return true;
        }
        return false;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> monotonic = new ArrayList<>();

        System.out.println("Enter elements of array");
        System.out.println("Enter 1011 to exit");
        
        int k = sc.nextInt();

        while(k != 1011 ){
            monotonic.add(k);
            k = sc.nextInt();
        }

        if(monotonic(monotonic)){
            System.out.println("array list monotonic ");
        }
        else{
            System.out.println("Array list is not monotonic ");
        }

    }
    
}