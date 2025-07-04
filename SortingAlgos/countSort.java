public class countSort {

    public static void CountSort(int arr[]){

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int Count[] = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++){
                Count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0 ; i < Count.length ; i++){
            
            while(Count[i] > 0){

                arr[j] = i;
                Count[i]--;
                j++;
            }

        }

    }

    
    public static void printArr(int arr[]){
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = {9,2,6,3,1,7,5,4};

        CountSort(arr);
        printArr(arr);

    }
    
}