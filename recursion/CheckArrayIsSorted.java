package recursion;

public class CheckArrayIsSorted {

    
    public static boolean isSorted_recursive(int[] array , int i ){

        if(i == array.length-1){
            return true;
        }
        if(array[i] > array[i+1]){
            return false;
        }


        return isSorted_recursive(array , i+1);
    }



    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5};

        if(isSorted_recursive(array, 0)){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }



    }



}