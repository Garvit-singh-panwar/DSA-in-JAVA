import java.util.Scanner;

public class sumOfDigit {

    public static int SumOfDigit(int n){
        
        int temp = n;
        int sum = 0;
        while(temp > 0){

            sum += temp%10;
            temp = temp/10;

        }

        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int num = sc.nextInt();

        System.out.println("sum of digit of "+ num +" is " + SumOfDigit(num));



    }
}