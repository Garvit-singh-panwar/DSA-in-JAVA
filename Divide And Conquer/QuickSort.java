public class QuickSort {

   // What are we doing here?
    // We are sorting our array using the Quick Sort algorithm.

    // quickSort takes three arguments:
    // 1. array: The array to be sorted.
    // 2. l: The starting index (leftmost element).
    // 3. r: The ending index (rightmost element).

    // We choose a pivot — in this implementation, we are using the last element as the pivot.
    // The goal is to place the pivot in its correct sorted position:
    // - All elements smaller than the pivot go to the left.
    // - All elements greater than the pivot go to the right.

    // After placing the pivot at its correct position,
    // we get the pivot's index (pivotPos).
    // Then, we recursively call quickSort on the elements before the pivot,
    // and on the elements after the pivot.


     public static void quickSort(int array[], int l, int r) {

        // If the starting index is greater than or equal to the ending index,
        // the array has 0 or 1 elements, so it's already sorted.
        if (l >= r) {
            return;
        }

        // Find the correct position of the pivot element.
        int pivotPos = pivotPos(array, l, r);

        // Recursively sort all elements before the pivot.
        quickSort(array, l, pivotPos - 1);

        // Recursively sort all elements after the pivot.
        quickSort(array, pivotPos + 1, r);
    }

    // This method places the pivot at its correct position in the sorted array
    // and returns the index of the pivot.
    public static int pivotPos(int array[], int l, int r) {

        int pivot = r; // We are choosing the last element as the pivot.

        int i = l; // Iterator to traverse the array.
        int j = l; // Tracks the position where the next element smaller-than-pivot  should go.

        // Loop until the element just before the pivot.
        while (i < r) {

            // If the current element is smaller than the pivot, we swap it with the element at index j,
            // ensuring all smaller elements are on the left.
            if (array[i] < array[pivot]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }

            i++; // Move to the next element.
        }

        // Place the pivot element in its correct sorted position by swapping it with the first bigger element.
        if(j != pivot){
            int temp = array[j];
            array[j] = array[pivot];
            array[pivot] = temp;
        }

        return j; // Return the final position of the pivot.
    }


    public static void main(String[] args){

        int array[] = { 8,1,9,4,5,2,3,6};

        System.out.println("Array before sorting : ");

        for(int i : array){
            System.out.print(i + " ");

        }

        quickSort(array, 0 ,array.length-1);

        System.out.println("\n");
        System.out.println("Array After sorting : ");

        for(int i : array){
             System.out.print(i + " ");
        }


    }
    
}