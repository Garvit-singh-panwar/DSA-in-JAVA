public class prime {

    
    public static boolean isPrime(int n){


        for(int i = 2 ; i <= Math.sqrt(n); i++ ){

            if(n%i == 0){
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        
        int num = 20;

        System.out.println(isPrime(num));

    }


}