public class sumOfSubArraysUSingPrefixSum {

    // a = array  , p = prefixSumArray
    // index      0         1            2            3            4  
    // int a =   [1]       [2]          [3]          [4]          [5]
    // int p = [a[0]]  [p[0]+a[1]]  [p[1]+a[2]]  [p[2]+a[3]]  [p[3]+a[4]] 
    //  p    =   [1]       [3]          [6]          [10]        [15]           

    // if we want to find sum of values from array[1] to array[5]   
    // instead of calculating array a[1]+a[2]+a[3]+a[4]+a[5]
    // we just calculate p[5] - p[1-1] = p[5] - p[0]  
    //  because  p[5] = a[0]+a[1]+a[2]+a[3]+a[4]+a[5]  
    // and we want sum of elements from a[1] to a[5] thats why we are subtracting p[0] form p[5]
    // because p[0] = a[0] and when we subtract p[0] from p[5] it will give us the sum a[1]+a[2]+a[3]+a[4]+a[5] 
    // 






    public static int maxFromSumOfSubArrays(int array[]){
        int prefixSum[] = new int[array.length];

        int max =Integer.MIN_VALUE;
        prefixSum[0] = array[0];
        for(int i = 1 ; i < array.length; i++){
           prefixSum[i] = prefixSum[i-1]+array[i];
        }

        for(int i = 0 ; i < prefixSum.length; i++ ){

            for(int j = i; j < prefixSum.length ; j++){
                int currSum = ( i == 0 ) ? prefixSum[j] : prefixSum[j] - prefixSum[i-1]; 
                if(currSum > max){
                    max = currSum;
                }
                System.out.println(currSum);

            }

        }
            return max;
    }
    
    public static void main(String[] args) {
        
        int array[] = {10,-2,-3,14,-5};
        int max =  maxFromSumOfSubArrays(array);

        System.out.println("maximum sum of sub arrays : " + max);


    }


}