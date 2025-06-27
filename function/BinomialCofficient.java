public class BinomialCofficient {

    
     public static int fact(int n){
       int fact = 1;

        for(int i = 2 ; i <= n ; i++ ){
            fact *= i;
        }
        return fact;
    }

    public static float binomialCofficient(int a ,int b){

        

        int nfact = fact(a);
        int rfact = fact(b);
        int NMinRfact = fact(a-b);

        return nfact / (rfact * NMinRfact ) ;
    }

    public static void main(String[] args) {
        
        int n = 5;
        int r  = 2;

       System.out.println("the binomial cofficient of n! and r! is : " + binomialCofficient( n ,r )); 

    }


}