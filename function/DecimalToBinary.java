import java.util.Scanner;

public class DecimalToBinary { 


    public static int toBinary(int decimal){

        int binary = 0;
        int pwr = 1;

        while(decimal > 0){
            int num = decimal % 2;
            decimal = decimal/2;
            binary += num * pwr;
            pwr *= 10;
        }

        return binary;


    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number : ");

        int decimalValue = sc.nextInt();
        
        System.out.println("the binary no of " + decimalValue + " = " + toBinary(decimalValue));




        

            sc.close();

    }


}