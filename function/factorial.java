public class factorial {

    // factorial using for loop 
    // 1 *2 *3 *4 *...*n 
    public static int fact(int n){
       int fact = 1;

        for(int i = 2 ; i <= n ; i++ ){
            fact *= i;
        }
        return fact;
    }


  // This method calculates the factorial of a number using recursion.
// We call this method repeatedly, reducing the value of 'n' by 1 each time.
// When 'n' becomes 1 (or less), we return 1 — this is our base case.
// Then, on each return, we multiply 'n' with the result of factorialUsingRecursion(n - 1).
// This way, we build the result step by step as the recursive calls resolve.
    public static int factorialUsingRecursion(int n){
        if( n <= 1){
            return 1;
        }
        return n*factorialUsingRecursion(n-1);
    } 
    public static void main(String[] args){

        int n = 5;

        int factorial = fact(n);

        System.out.println("factorial of " + n + " is  = " + factorial);

        System.out.println("I am calculating factorial using recursion and the ans is : " + factorialUsingRecursion(n));
    }
    
}