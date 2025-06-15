import java.util.Scanner;

public class fizzBuzz2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int size = sc.nextInt();
        int cntr3 = 0;
        int cntr5 = 0;
        for(int i = 1 ; i <= size ; i++ ){

            cntr3++; cntr5++;
            if(cntr3 != 3 && cntr5 != 5){
                System.out.print(i);
            }

             if( cntr3 == 3 ){
                System.out.print("Fizz");
                cntr3 = 0;
            }

            if(cntr5 == 5 ){
                System.out.print("Buzz");
                cntr5 = 0;
            }
            
            System.out.println();

        }
    }

}