package Assignment;

public class SelectionSortRev {

    public static void selectionSortRev(int array[]){

        for(int i = 0 ; i < array.length-1 ; i++){
            int max = i;
            for(int j =i+1 ; j< array.length; j++){
                if(array[j] > array[max]){
                    max = j;
                }
            }
            if(max!=i){
                int temp = array[max];
                array[max]=array[i];
                array[i] = temp;
            }
        }

    }

    public static void printArr(int array[]){
        for(int arr : array){
            System.out.print(arr + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int array[] = {0,1,5,2,4,9,7,6};
        selectionSortRev(array);
        printArr(array);

    }

}