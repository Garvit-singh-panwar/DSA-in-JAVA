package recursion;

public class factorial {

    

    public static int factorial_recursive(int num){
        

        if(num <= 1){
            return 1;
        }

        return (num * factorial_recursive(num-1));

    }

    public static void main(String[] args){

        int num = 10;
        int fact = factorial_recursive(num);

        System.out.println("the factorial of num " + num + " is " + fact);


    }



}