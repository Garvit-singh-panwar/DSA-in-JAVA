public class reverseArray {

    // here is how we can reverse an array 
    // {1}[2][3][4][5]
    //  |           |
    //  V           V
    //  L           R   swap array[l] with array[r]
    //  |-----------|   L++ R--
    // [5][2][3][4][1]
    //     |     |  
    //     V     V  
    //     L     R      swap array[l] with array[r]
    //     |-----|      L++ R--
    // [5][4][3][2][1]
    //        ||
    //        VV
    //        LR    both is pointing on same value so there is not need to swap

    
    public static void reverse(int array[]){
        int l = 0 ;
        int r = array.length - 1;

        while(l < r){
            array[l] += array[r];
            array[r] = array[l] - array[r];
            array[l] = array[l] - array[r];

            l++;
            r--;

        }


    }

    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5};

        reverse(array);

        for(int arr : array){
            System.out.print( arr + " ");
        }

    }

}