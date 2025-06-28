package pattern;

import java.util.Scanner;

public class hollowRectPtrn {

    // Analogy:
    //  1. * * * * *    → 5 characters
    //  2. *       *    → 2 characters (stars only on both ends)
    //  3. *       *    → 2 characters
    //  4. * * * * *    → 5 characters
    // Character used: ("*")
    
    // We can understand this pattern as a matrix.
    // It's a 5x4 matrix (columns x rows).
    // From the pattern, we can clearly see that:
    // the first row, the last row, the first column, and the last column 
    // are completely filled with stars.
    // All the remaining positions are filled with blank spaces.
    
    // In this program, we are going to print a rectangle
    // with 4 rows and 5 columns.
    // We will apply a condition:
    // if the row counter is 1 or equal to the last row
    // or if the column counter is 1 or equal to the last column,
    // we will print "*".
    // Otherwise, we will print a blank space " ".

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width of the Hollow rectangle ");
        int width = sc.nextInt();

        System.out.println("Enter height of the hollow rectangle");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j == 1 || i == 1 || j == width || i == height) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
