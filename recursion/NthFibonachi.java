package recursion;

public class NthFibonachi {

    

    public static int fibonachi(int n){
        
        if(n <= 0 ){
            return 0;
        }else if(n == 1){
            return 1;
        }

        return fibonachi(n-1)+fibonachi(n-2);

    }

    public static void main(String[] args){

        int num = 20;

        System.out.println("the fibonachi of " + num + " is : " + fibonachi(num) );

    }


}