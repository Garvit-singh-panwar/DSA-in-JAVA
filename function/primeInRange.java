public class primeInRange {

    
     public static boolean isPrime(int n){

        if (n <= 1) return false; 

        for(int i = 2 ; i <= Math.sqrt(n); i++ ){

            if(n%i == 0){
                return false;
            }

        }

        return true;

    }

    public static void primeInRange(int n){

        for(int i = 2 ; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }

        System.out.println(" they all are the prime no");

    }


    public static void main(String[] args) {

        int range = 10;

        primeInRange(range);

        
    }


}