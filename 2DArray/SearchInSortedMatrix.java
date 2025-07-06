public class SearchInSortedMatrix {

    // here time complexity is O(n^2)
    public static int[] bruteforceSolution(int array[][] , int key){
        int keys[] = {-1,-1};
        for(int i = 0 ; i < array.length ; i++){

            for(int j = 0 ;  j < array[0].length; j++){

                if(array[i][j] == key){
                    System.out.println("key is at position ");
                    keys[0] = i;
                    keys[1] = j;
                    return keys;
                }

            }

        }
        return keys;
    }

// we are already familear with this in this timeComplexity is O{nlogn}
    public static int[] binarySearchApproachRowWise(int array[][] , int key){
        int index[] = {-1,-1};

        for(int i = 0 ; i < array.length; i++){

            int l = 0;
            int r = array[i].length -1;

            while(l<=r){
                int mid = (l+r)/2;

                if(array[i][mid] ==  key){
                  
                    index[0] = i;
                    index[1] = mid;
                    return index;
                }
                else if(array[i][mid] > key){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }

            }


        }


        return index;
    }


    // Both fastest approaches are known as "staircase search" in a sorted 2D array.

// Here's what we are doing:
// We are given a 2D matrix where each row is sorted from left to right,
// and each column is sorted from top to bottom.

// To efficiently search for a key, we use two pointers:
// One for rows and one for columns.

// We can start from one of two corners:
// 1. The last element of the first row (top-right corner) — used in fastestApproach()
// 2. The first element of the last row (bottom-left corner) — used in fastestApproach2()

// Why start here?
// Because both these positions hold values that are neither the smallest nor the largest in the entire matrix,
// but they are the largest in their row or column — which gives us a clear decision path.

// ---- First case: Top-Right Corner ----
// Start at array[0][last_col]
// - If the key equals this element → return its coordinates.
// - If the key is smaller → move left (column--), because elements on the left are smaller.
// - If the key is larger → move down (row++), because elements below are larger.

// ---- Second case: Bottom-Left Corner ----
// Start at array[last_row][0]
// - If the key equals this element → return its coordinates.
// - If the key is smaller → move right (column++), because elements on the right are larger.
// - If the key is larger → move up (row--), because elements above are smaller.

// This way, we reduce the search space in each step, and either find the key or
// reach out of bounds — which means the key is not present.

// Time Complexity: O(n + m) where n = rows, m = columns.
// It's more efficient than searching each row or column individually.

// lets take 1st case and here key is 29
// r is pointer for row and c is a pointer for column

// Let's take the 1st case (top-right approach) with key = 29
// 'r' is the row pointer, and 'c' is the column pointer

//   10    20    30    40  <- (r=0, c=3)
//                          40 is greater than 29 → move left → c--
//
//   15    27    35    45
// 
//   27    29    37    48
// 
//   32    33    39    50


//   30 is still greater than 29 → move left → c--
//               (r=0, c=2)
//
//   10    20    30    40
//
//   15    27    35    45
// 
//   27    29    37    48
// 
//   32    33    39    50


//   20 is smaller than 29 → move down → r++
//         (r=1, c=1)
//
//   10    20    30    40
//
//   15    27    35    45
//
//   27    29    37    48
//
//   32    33    39    50


//   27 is still smaller than 29 → move down → r++
//         (r=2, c=1)
//
//   10    20    30    40
//
//   15    27    35    45
//
//   27    29    37    48
//             ↑ r,c (match found)
//
//   32    33    39    50

// Found 29 → return position {2, 1}


// ----------------------------

// Now let's take the 2nd case (bottom-left approach) with key = 29
// 'r' is the row pointer, and 'c' is the column pointer

//   10    20    30    40
//
//   15    27    35    45
//
//   27    29    37    48
//
//   32    33    39    50
//   ↑
//   | (r=3, c=0), value = 32 → 32 > 29 → move up → r--


//   10    20    30    40
//
//   15    27    35    45
//
//-> 27    29    37    48
// |
// |  32    33    39    50
// |
// | (r=2, c=0), value = 27 → 27 < 29 → move right → c++


//   10    20    30    40
//
//   15    27    35    45
//
//   27 -> 29    37    48
//        ↑ r,c (match found)
//
//   32    33    39    50

// Found 29 → return position {2, 1}


    public static int[] fastestApproach(int array[][] , int key){
        int index[] = {-1,-1};

        int rowStart = 0;
        int colEnd = array[0].length-1; 

        while(rowStart < array.length && colEnd >= 0){

            if(array[rowStart][colEnd] == key){
                index[0] = rowStart;
                index[1] = colEnd;
                return index;
            }
            else if(array[rowStart][colEnd] < key){
                rowStart++;
            }
            else{
                colEnd--;
            }

        }

        return index;
    }

    // here time complexity is O(n)
    public static int[] fastestApproach2(int array[][] , int key){
        int index[] = {-1,-1};

        int startCol = 0;
        int endRow = array.length-1;

        while(startCol < array[0].length  && endRow >= 0){
            if(array[endRow][startCol] == key){
                index[0] = endRow;
                index[1] = startCol;

                return index;
            }
            else if(array[endRow][startCol] < key){
                startCol++;
            }
            else{
                endRow--;
            }


        }

        return index;
    }

    public static void main(String[] args) {
        int array[][] = {
            {10,20,30,40},
            {15,27,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        System.out.println("going through brute force approach");
        for(int key : bruteforceSolution(array, 35)){
            System.out.print("[" + key + "],"  );
        }
        System.out.println();

        System.out.println("going through binary search approach");
        for(int key : binarySearchApproachRowWise(array, 35)){
            System.out.print("[" + key + "],"  );
        }

        System.out.println();
        System.out.println("going through fastest approach");
        for(int key : fastestApproach(array, 35)){
            System.out.print("[" + key + "],"  );
        }

        System.out.println();
        System.err.println("going through fastest approach 2");
        for(int key : fastestApproach2(array, 35)){
            System.out.print("[" + key + "],"  );
        }

    }
}