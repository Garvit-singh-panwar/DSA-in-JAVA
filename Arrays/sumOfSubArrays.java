public class sumOfSubArrays {

    public static int SumOfSubArrays(int array[]){
        int max =Integer.MIN_VALUE;
        for(int i= 0 ; i < array.length; i++){
            for(int j =i ; j< array.length ; j++){
                int sum = 0;
                for(int k = i ; k <= j ; k++){
                   sum += array[k];  
                }
                if(sum > max){
                    max = sum;
                }
                System.out.println(sum);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        
        int array[] = {10,11,12,13};
        int max = SumOfSubArrays(array);

        System.out.println("max sum from all the sub array : " + max);

    }
    
}