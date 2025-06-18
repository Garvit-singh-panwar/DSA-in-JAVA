import java.util.Scanner;

public class ispalindrome {

    public static boolean isPalindrome(int num){
        int temp = num;
        int rev = 0;

        while(temp > 0){

            rev = rev* 10 + (temp % 10);
            temp = temp/10;
        }

        return rev == num;
    }
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a num");
    int num = sc.nextInt();

    if(isPalindrome(num)){
        System.out.println(num +" is a palindrome");
    }
    else{
        System.out.println(num + " is not a palindrome ");
    }


    }
}