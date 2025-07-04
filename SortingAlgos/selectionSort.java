public class selectionSort {

    public static void SelectionSort(int arr[]){
        
        for(int i = 0 ; i < arr.length-1; i++){

          int min = i;
            for(int j = i+1 ; j< arr.length ; j++){
                if(arr[j] < arr[min] ){
                    min = j;
                }
            }

            if(min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }

    }

    public static void printArr(int arr[]){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        int arr[] = {1,4,2,7,0,6,3};
        
        SelectionSort(arr);
        printArr(arr);
        


    }
    
}