package recursion;

public class SumOfNNaturalNum {

    
    public static int sumOfNNaturalNum_recursive(int n){
        if(n <= 1 ){
            return 1; 
        
        }

        return n+sumOfNNaturalNum_recursive(n-1);

    }

    public static void main(String[] args) {
        

        int num = 5;
        System.out.println("sum of natural num from 1 to " + num + " is :- " +sumOfNNaturalNum_recursive(num));


    }

}