public class SpiralMatrix {

    public static void printSpirally(int array[][]){

        int startingRow = 0;
        int startingColumn  = 0;
        int endingRow = array.length;
        int endingColumn = array[0].length;

        while (startingRow < endingRow && startingColumn < endingColumn) {
            // Left to Right (Top Row)
            for (int j = startingColumn; j < endingColumn; j++) {
                System.out.print(array[startingRow][j] + " ");
            }
            startingRow++;
            
            // Top to Bottom (Right Column)
            for (int i = startingRow; i < endingRow; i++) {
                System.out.print(array[i][endingColumn - 1] + " ");
            }
            endingColumn--;

            // Right to Left (Bottom Row), if there's still a row left
            if (startingRow < endingRow) {
                for (int j = endingColumn - 1; j >= startingColumn; j--) {
                    System.out.print(array[endingRow - 1][j] + " ");
                }
                endingRow--;
            }

            // Bottom to Top (Left Column), if there's still a column left
            if (startingColumn < endingColumn) {
                for (int i = endingRow - 1; i >= startingRow; i--) {
                    System.out.print(array[i][startingColumn] + " ");
                }
                startingColumn++;
            }
        }
    }

    public static void main(String[] args) {
        
        int Array2D[][] = {
                            {1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}
                          }; 

        printSpirally(Array2D);


    }
    
}