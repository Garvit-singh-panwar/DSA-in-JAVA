public class DiagonalSum {

    public static int diagonalSum(int array[][]){
       
        int n = array.length;
        if(n != array[0].length){
            
            System.out.println("we cant find because its not a nxn matrix");
            return -1;

        }

        int sum = 0;

        for(int i = 0 ; i < n ; i++){

            sum += array[i][i];

            if(i != n-i-1){
                sum += array[i][n-1-i]; 
            }

        }


        return sum;
    }
    public static void main(String[] args) {
        
        int array[][] = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {8,9,10,11},
                            {13,14,15,16}
                        };

        System.out.println("the diagnol sum of this matrix is : " + diagonalSum(array) );
    }
    
}