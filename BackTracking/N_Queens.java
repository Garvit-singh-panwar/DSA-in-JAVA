package BackTracking;

public class N_Queens {

    /// This function checks if it's safe to place a queen at board[row][column]
    // It verifies 3 directions above the current cell (because we place queens row by row from top to bottom):
    // 1. Upward (same column)
    // 2. Upper-left diagonal
    // 3. Upper-right diagonal

    public static boolean isSafeToPlace(char[][] board, int row, int column) {

        // 1. Check upward in the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q') {
                return false; // Another queen found above
            }
        }

        // 2. Check upper-left diagonal
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false; // Queen found on upper-left diagonal
            }
        }

        // 3. Check upper-right diagonal
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false; // Queen found on upper-right diagonal
            }
        }

        // Safe to place queen
        return true;
    }


    // Function to solve the N-Queens problem
    // Parameters:
    // 1. board: A 2D character array representing the NxN chessboard
    // 2. row: The current row to place the queen in

    public static void n_QueenS(char[][] board, int row) {

        // Base case: if all queens are placed
        if (row == board.length) {
            System.out.println("\n--------- Next Board ---------\n");
            PrintBoard(board);
            return;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < board[row].length; col++) {

            // Check if it's safe to place the queen at (row, col)
            if (isSafeToPlace(board, row, col)) {

                // Place the queen
                board[row][col] = 'Q';

                // Recur to place the rest of the queens
                n_QueenS(board, row + 1);

                // Backtrack: Remove the queen and try next column
                board[row][col] = 'X';
            }
        }
    }


    // it the function to print chess board 
    // just two simple for loops for printing every element
    public static void PrintBoard(char board[][]){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){

        int n = 4;
         
        char board[][] = new char[n][n];

        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++ ){
                board[i][j] = 'X';
            }
        }

        n_QueenS(board , 0);

        // the time complexity of n_queens is nFactorial
        
        // why because in first row we have n choices to place a queen but when we go to to the next row we have (n-1) to place 
        // n*(n-1)*(n-2)...  thats how the time complexity is n!   

    }

}