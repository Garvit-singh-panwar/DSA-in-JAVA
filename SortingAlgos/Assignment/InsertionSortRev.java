package Assignment;

public class InsertionSortRev {
    // p = prev ,  c = current
    //     0,1,2,3
    //     | |
    //     p c
    // c > array[0] -> swap(array[1] , array[0])  P--;  P = -1 NOW we stop the loop
    //  here p = -1    array[-1+1] = c 

    //   1,0,2,3
    //     | |
    //     P C 
    //   c > array[1]    swap(array[2] , array[1]) p--; p=0  c > array[0]  swap(array[1] ,array[0]) p--; p=-1;
    //   array[0] = c 
    // Thats how we can do the entire swap
    // 
    //     
    
    public static void insertionSortRev(int array[]){

        for(int i = 1 ; i < array.length ; i++ ){

            int prev = i-1;
            int curr = array[i];

            while(prev >= 0 && curr > array[prev]){
                array[prev+1] = array[prev];
                prev--;
            }

            array[prev+1] = curr;


        }

    }

    public static void printArr(int array[]){
        for(int arr : array){
            System.out.print(arr + "," );
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
        int array[] = {0,1,2,3,4,5};
        insertionSortRev(array);
        printArr(array);


    }
    
}