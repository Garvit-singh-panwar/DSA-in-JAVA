package Assignment;

public class bubbleSortRev {

    public static void BubbleSortrev(int array[]){

        for(int i = 0 ; i < array.length-1; i++){
            boolean sorted = true;
            for(int j = 1 ; j< array.length-i ; j++){
                if(array[j-1] < array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp; 
                    sorted = false;
                }
            }
            if(sorted)return;
        }

    }

    public static void printArr(int array[]){
        for(int arr : array){
            System.out.print(arr + "," );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        BubbleSortrev(arr);
        printArr(arr);
    }
    
}