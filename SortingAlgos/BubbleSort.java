public class BubbleSort {

    public static void BubbleSort(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){

            boolean sorted = true;
            for(int j = 0 ; j< arr.length -i-1 ; j++){
             
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }

            }
            if(sorted)return;
            

        }


    }

    public static void printArr(int arr[]){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[ ] = {0,4,1,3,5,2,9};

        BubbleSort(arr);
        printArr(arr);

    }
    
}