//  sum of a,b  taking user input 

import java.util.Scanner;
//  import scanner to take inputs

class userInpSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //  callig next int function of scanner class to take integer as input
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println(sum);

    }


}