import java.util.Scanner;

public class prime {

    // ANALOGY:
    // You want to check if a number is prime or not (meaning: is it only divisible by 1 and itself?).
    // Instead of checking all numbers up to the number itself, we check only from 2 to the square root of the number (√n).
    // Let's look at the pairs of numbers that multiply to give 36:
    // 1 × 36
    // 2 × 18
    // 3 × 12
    // 4 × 9
    // 6 × 6
    // 9 × 4   same as above, just reversed
    // 12 × 3
    // 18 × 2
    // 36 × 1

    // See something?
    // After 6 (which is √36), the same factors repeat in reverse!

    // So, if no smaller number (up to square root) divides the number,
    // then no larger number will either.

    // That’s why we only need to check divisibility up to √n.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // We are using a boolean flag. If the number is prime, 'prime' remains true.
        // If it's not a prime number, we set it to false.
        boolean prime = true;

        for(int i  = 2; i <= Math.sqrt(num); i++){

            // We are checking:
            // If any number i (from 2 to √num) divides num, we know it's not a prime number.
            // So, we print a message and set 'prime' to false.
            if(num % i == 0){
                System.out.println("It's not a prime number.");
                prime = false;
                break;
            }
        }

        // If no number (i) divides num, then 'prime' remains true,
        // and we print that it's a prime number.
        if(prime){
            System.out.println("It's a prime number.");
        }

        sc.close();   
    }
}
