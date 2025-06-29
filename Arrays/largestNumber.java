public class largestNumber {

    public static int findMaximum(int array[]){

        // integer.min value is -inifnity or the smallest num in the int 
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < array.length ; i++){

            if(array[i] > max){
                max = array[i];
            }

        }

        return max;
    }

    public static void main(String[] args) {
        
        int array[] = {1,2,6,3,5};

        int maxNum = findMaximum(array);
        System.out.println("Maximum number in array is : " + maxNum);

    }
    
}