package pattern;

import java.util.Scanner;
public class halfPyramidPattern {

    public static void main(String[] args) {


        // here what we want to print 
        // 1. 1             1 charcter
        // 2. 12            2 characters
        // 3. 123           3 characters
        // 4. 1234          4 characters
        //  here we are printing character = numbers or(1 to 9 )

    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a pyramid : ");
        int lines = sc.nextInt();

        for(int line = 1; line <= lines ; line++){

            for(int characters = 1 ; characters <= line ; characters++){
                // here we are taking numbers as a character
                System.out.print(characters+ " ");
            }
            System.out.println();

        }

        sc.close();
        
    }

}