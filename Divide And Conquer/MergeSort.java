public class MergeSort {
    
    // Merge Sort using Divide and Conquer

    // We're sorting an array using the divide and conquer approach.
    // The function takes three arguments:
    // 1. array - the array to be sorted
    // 2. l - the starting index (left side)
    // 3. r - the ending index (right side)

    // First, we calculate the middle index as (l + r) / 2
    // Using the mid, we divide the array into two halves:
    // - Left half: from l to mid
    // - Right half: from mid+1 to r

    // We keep recursively calling the function on both halves
    // until each part contains only one element.
    // A single element is always sorted by itself.

    // Once we reach the base case, we start merging the sorted parts.
    // We create a new temporary array of size (r - l + 1)
    // This new array will hold the merged result of both sorted halves.

    // We compare elements from both halves (since both are sorted),
    // and place the smaller one into the temporary array,
    // repeating this until all elements are processed.

    // Finally, we copy the sorted elements back to the original array.
    // This process continues until the whole array is sorted.




    public static void mergeSort(int array[] , int l , int r ){

        if(l >= r){
            return;
        }

        int mid = (l+r)/2;

        mergeSort(array, l, mid); // dividing into first half
        mergeSort(array, mid+1, r); // dividing into second half


        int arr[] = new int[(r-l+1)]; // a temporary array whosse size is equal to the both halfs

        int first = l; // first half of array
        int second = mid+1; // second half of array
        int i = 0; // iterator for new temporary array

        
        // we are keep storing the smallest element by checking the smallest element form both halfs
        //if any one of the half exceed there size the loop ends
        while(first <= mid && second <= r ){

            if(array[first] < array[second]){
                arr[i] = array[first];
                first++;
                i++;
            }
            else{
                arr[i] = array[second];
                i++;
                second++;
            }

        }

        // if the element in the first half are left we store them in the temp array (new array) 
        while(first <= mid){
            arr[i] = array[first];
            i++;
            first++;
        }
         // if the element in the second half are left we store them in the temp array (new array) 
        while(second <= r){
            arr[i] = array[second];
            second++;
            i++;
        }

        // now we are copying the elements from temporary array into original array  
        for(int j = 0 ; j < arr.length ; j++){
            array[l+j] = arr[j];
        }

    }


    public static void main(String[] args) {
        
        int array[] = {5,1,8,2,0,3,9,6};

        System.out.println("array before sorting ");
        for(int i : array){
            System.out.print(i+ " ");
        }
        System.out.println("\n");

        // calling mergeSort
        mergeSort(array, 0, array.length-1);
        System.out.println("array after sorting ");
        for(int i : array){
            System.out.print(i + " ");
        }

        System.out.println();

    }
     



}