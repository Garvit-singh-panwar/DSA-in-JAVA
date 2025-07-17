package recursion;

public class XToThePowerN {

    
    public static int xToThePowerN(int x , int n){
        if(n == 1){
            return x;
        }
        if(n <= 0){
            return 1;
        }

        return x*xToThePowerN(x, n-1);


    }


    public static void main(String[] args){

        int x = 2;
        int n = 10;

        System.out.println("The value of " + x + "  to the power "+ n + " is :- " + xToThePowerN(x, n));

    }


}