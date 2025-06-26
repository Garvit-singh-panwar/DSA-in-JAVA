

package pattern;

import java.util.Scanner;
public class CharacterPattern {

    
    public static void main(String[] args) {
        
        // 1. A     1 character
        // 2. BC    2 characters
        // 3. DEF   3 characters
        // 4. GHIJ  4 characters




        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the pyramid : ");
        int lines = sc.nextInt();


        char alphabets = 'A';

        for(int line = 1; line <= lines ; line ++  ){

            for(int character = 1 ; character <= line ; character++){

                System.out.print(  alphabets++ );

            }
            System.out.println();

        }

        sc.close();
    }


}