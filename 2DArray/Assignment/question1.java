package Assignment;
// Question1 : Print the number of 7's that are in 2D array

// Example : 
// input :- int[][] array {{4,7,8} , {8,8,7}}
// output :- 2
public class question1 {


    public static int countNInArray(int array[][] , int n){

        int count = 0;

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j++){
                if(array[i][j] == n){
                    count++;
                }
            }
        }

        return count;

    }


    public static void main(String[] args){

        int array[][] = {
                            {1,3,7,8},
                            {3,4,6,7},
                            {8,7,6,3}
                        };
        int n = 7;

        System.out.println("the no of " + n + " in the array is : " + countNInArray(array, n));
        

    } 
    
}
