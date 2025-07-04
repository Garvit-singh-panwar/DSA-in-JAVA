package Assignment;

public class CountSortRev {

    public static void countSortRev(int array[]){
        int max = array[0]; 
        for(int i = 1 ; i < array.length ; i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        int count[] = new int[max+1];

        for(int i = 0 ; i < array.length ; i++){
            count[array[i]]++;
        }

        int j = 0;
        for(int i = count.length-1 ; i  >= 0 ; i-- ){
             while(count[i] > 0){
                array[j] = i;
                count[i]--;
                j++;
             }
        }

    }

    public static void printArr(int array[]){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5,6};
         countSortRev(array);
         printArr(array);

    }

}