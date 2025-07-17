package recursion;

public class XtoThePowerNoptmized {

    
    public static int xToThePowerN(int x , int n) {
        
        if(n==1){
            return x;
        }
        if(n<=0){
            return 1;
        }

        if(n%2 == 0){
            return xToThePowerN(x, n/2)*xToThePowerN(x, n/2);
        }
        else{
            return x*xToThePowerN(x, n/2)*xToThePowerN(x, n/2);
        }

    }


    public static void main(String[] args) {
        
        int x= 2;
        int n = 10;

        System.out.println("The value of " + x + "  to the power "+ n + " is :- " + xToThePowerN(x, n));


    }


}
