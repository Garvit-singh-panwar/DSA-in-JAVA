// Array is a list of elements of the same data type,
// stored in contiguous memory locations
// Arrays follow zero-based indexing

// Example:
// Indexes    -> [0][1][2][3][4][5][6]
// MemoryAddr ->  0  4  8 12 16 20 24   (for int type, as it takes 4 bytes)

//  Think of an array like a section in a library:
// Each section contains books of only one subject.
// For example, the Computer Science section holds only CS books.
// Similarly, an array stores only one type of data (int, String, etc.).
// Just like books are arranged by shelf number, array elements are accessed using index numbers.

import java.util.Scanner;

public class notes {

    public static void UPdateArray(int array[]) {
        // array.length gives the total number of elements the array can hold
        // Since arrays follow 0-based indexing, valid indices go from 0 to array.length - 1
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Creating an Array
        // Syntax: dataType[] arrayName = new dataType[size];
        // 'new' keyword allocates memory in the heap
        // You must specify the size of the array in square brackets
        int array[] = new int[50]; // Array declaration and memory allocation

        // Arrays in Java are statically sized
        // If we define the size as 50, we cannot store more than 50 elements

        //  Initializing an array with values
        int num[] = {1, 2, 3}; // Automatically creates an array of size 3

        //  Inputting values into an array
        System.out.println("Enter 3 numbers to store them in an array:");

        // Using indexes to store values at specific positions
        num[0] = sc.nextInt(); // 1st position (index 0)
        num[1] = sc.nextInt(); // 2nd position (index 1)
        num[2] = sc.nextInt(); // 3rd position (index 2)

        //  Printing values from the array using index
        System.out.println("Number at position 0: " + num[0]);
        System.out.println("Number at position 1: " + num[1]);
        System.out.println("Number at position 2: " + num[2]);

        // Passing array as an argument to a method
        UPdateArray(array); // Arrays are passed by reference, not by value

        //  Printing the updated array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
