package BackTracking;

public class GridWays {

    // we have to count in how many ways we can reach to the target (ending index array )

    // to do that we have to pass three agrument 
    // 1. 2DArray:  whose target we have to reach 
    // 2. row: its the initial row from where we   have to start
    // 3. column: its the initial column from where we have to start 

    public static int numOfWaysToReachTarget(int array[][] , int row , int column  ){

        // if we reach the target we return 1 which represent 1 way
        if(row == array.length-1 &&  column == array[0].length-1 ){
            return 1;
        } // if the row or column is end before reaching the target we return 0 means target not found yet
        else if(row == array.length || column == array[row].length){
            return 0;
        }


        // we constantly go to the forward direction and store the value after returning in the rightways 
        // (value :- is that the target is found or not)
        int rightWays = numOfWaysToReachTarget(array, row, column+1);

        // if the there is no path left to go forward 
        // we start to move in the downward direction and after returning we store the value in the downways
        // (value is that the target is found or not yet)
        
        int downWays = numOfWaysToReachTarget(array, row+1, column);

        // then we return while going forward we find the target or not + while going downward we find the target or not

        return rightWays + downWays;

    }


    // the time complexity of grid ways is (2^(m+n)) 
    // why because we have a NxM matrix 
    // and at every point while moving upward or while moving downward we have two choices 
    // thats why the time complexity is (2^(m+n))
    
    public static void main(String[] args){

        int array[][] = new int[5][4];

        int initialRow = 0;
        int initailColumn = 0;

        int noOfWays = numOfWaysToReachTarget(array, initialRow, initailColumn);

        System.out.println("the no of ways to reach the target is " + noOfWays);

    }

}