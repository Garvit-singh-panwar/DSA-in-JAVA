public class InsertionSor {

    public static void insertionSort(int arr[]){


        for(int i = 1 ; i < arr.length; i++){

            int currEle  = arr[i];
            int prev = i-1;
            while(prev >= 0 && currEle < arr[prev] ){
                 arr[prev+1] = arr[prev];
                 prev--;
            }

            arr[prev + 1] = currEle;
        }


    }

    public static void printArr(int arr[]){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int array[] = {5,1,4,3,8,6};
        insertionSort(array);
        printArr(array);
    }
    
}