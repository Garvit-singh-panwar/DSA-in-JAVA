// Question 3: write a program to find transpose of a matrix
// what is a transpose ?
// transpose of a matrix is the process of swapping the row to the columns. for 2x3 matrix
 
// matrix 
// a11 a12 a13
// a21 a22 a23

// Transposed matrix
// a11 a21
// a12 a22
// a13 a23

package Assignment;

public class Question3 {

    public static void printTransposeOfmatrix(int array[][]){

        for(int i = 0  ; i < array[0].length ; i++){
             System.out.print("         ");
            for(int j = 0 ; j < array.length ;j++){
                System.out.print(array[j][i]+ " ");
            }
            System.out.println();
        } 

    }
    
    public static void main(String[] args) {
        
        int array[][] = {
                            {1,2,3,4},
                            {4,5,6,7}
                        };

        printTransposeOfmatrix(array);

    }


}