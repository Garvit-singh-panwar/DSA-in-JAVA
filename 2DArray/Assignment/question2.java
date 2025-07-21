package Assignment;
// Print the sum of the numbers in the second row of the "nums" array

// Example: 
// input :- int[][] nums = {{1,4,9} , {11,4,3} , { 2,2,3}};

// OUTPUT:- 18
public class question2 {

    public static int sumOfElementsInTheSecondRow(int array[][] ){
        if(array.length < 2){
            return 0;
        }

        int sum = 0;

        for(int i = 0 ; i < array[1].length; i++){
            sum += array[1][i];
        }

        return sum;
    }

    public static void main(String[] args){

        int array[][] = {
            {1,2,3,5},
            {6,7,8,9},
            {10,11,12,13}
        };

        System.out.println("the sum of elements in the second row of the array is " + sumOfElementsInTheSecondRow(array));

    }  
}