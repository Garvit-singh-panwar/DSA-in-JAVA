

import java.util.Scanner;

public class notes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays are a group of homogeneous items which are stored in memory contiguously.

        // Arrays are of two types: 
        // 1. Unidimensional 
        // 2. Multidimensional

        // -------- Multidimensional: --------
        // A multidimensional array is nothing but an array of arrays.
        // Syntax: datatype arrayName[size1][size2].....[sizeN];

        // For 2D arrays, our dimension = 2
        // Syntax: datatype arrayName[row][column];
        // If you want to imagine a 2D array, imagine it in the form of a table.

        // For example:
        int[][] array = new int[4][3];
        // Here, we have 4 rows and 3 columns.
        // That means we are making 4 one-dimensional arrays of size 3 each.

        // If we create a 3D array like this:
        int[][][] array3D = new int[3][2][4];
        // It means we are making 3 2D arrays of size 2x4,
        // which means 2 rows and 4 columns in each 2D array.

        // -------- How to take inputs in a 2D Array --------
 
        // In 1D array, we take input through a single loop.
        int[] array1D = new int[9];
        int arraySize = 9;
        for (int i = 0; i < arraySize; i++) {
            array1D[i] = sc.nextInt();
        }
        // It is one-dimensional, so we are using only one loop.

        // But in 2D array, we have 2 dimensions,
        // so we use nested loops — one for rows and one for columns.
        int[][] array2D = new int[4][3];
        int row = 4;
        int column = 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array2D[i][j] = sc.nextInt();
            }
        }

        // -------- Why are multidimensional arrays important? --------
        // - They are used for representing grids
        // - Faster and simpler access to structured data
        // - Predefined size makes it easy to organize data

        // Example: 
        // If I am selling apples and I want to store the data 
        // of how many kg of apples I sold for up to 7 weeks,
        // I can make a 2D array like this:
        int[][] appleSales = new int[7][7];
        // Here I store how many apples I sold every day of each week.

        // Now suppose I sell apples for 5 hours daily,
        // and I want to track the hourly sales data as well.
        // For example, I want to store how many apples I sold in hour 1, hour 2... up to hour 5.
        // And I want this for every day of every week.
        // Then I can make a 3D array:
        int[][][] appleSellsDetailed = new int[7][7][5];
        // This is because:
        // - In 1 week, we have 7 days
        // - Each day has 5 tracked hours of sales
        // So the data structure is: [week][day][hour]


        // How array data is stored in memory

        // There are two common ways of storing 2D arrays in memory:
        // 1. Row-Major Order   -> This means elements are stored row by row. First the 1st row, then 2nd row, and so on.
        // 2. Column-Major Order -> This means elements are stored column by column. First the 1st column, then 2nd, and so on.

        // But in Java, things work a bit differently.
        // Java doesn't store 2D arrays in a flat memory block like C/C++.

        // In Java:
        // When you write int[][] arr = new int[3][4];
        // -> Java first creates a 1D array of references (of size 3 in this case) -> this is the first dimension: arr[0], arr[1], arr[2]
        // Then it creates 3 separate 1D arrays of size 4 (the second dimension)
        // Finally, each reference in the main array points to one of these 1D arrays.

        // So essentially, Java stores an **array of arrays**.
        // Each element of the first array holds the **reference/address** to another 1D array.


         sc.close();
    }
}
