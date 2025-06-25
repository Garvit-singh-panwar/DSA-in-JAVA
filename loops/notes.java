// Loops in Java are used to repeat a block of code multiple times, as long as a specific condition is true. This helps avoid writing the same code again and again.

// Examples

//  when we used to write the alphabet repeatedly as kids, that's actually a real-life example of a loop.
// Rolling the dice in Ludo until you get a 6 – like a do-while loop
// Filling a water bottle until it’s full → while loop
// Washing clothes one by one from a bucket → for-each loop
// Unlocking phone again and again until you type the correct password → do-while loop


// Types of loops 

// for 
// while
// do-while 

import java.util.Scanner;

public class notes {

    public static void main(String[] args) {
        
        // While loop 

        // The while loop in Java is used to execute a block of code again and again as long as the condition you give is true

        // syntax
        // while (condition) {
            // code to repeat
        // }

        int num = 0;

        while(num < 10){
            System.out.println("Hello world!");
            num++;
        }

        System.out.println();
        System.out.println();


        // write a program to print number 1 to range 

        int range = 7;
        num = 1;

        while(num <= range){
            System.out.println(num + " ");
            num++;
        }

        System.out.println();
        System.out.println();


        // A for loop in Java is used to repeat a block of code a specific number of times — usually when you know exactly how many times you want to loop.

        // syntax
        // for (initialization; condition; update) {
            // DO something
        // }

        // Initialization: set the counter (e.g. int i = 0 || i = 1 )
        // Condition: Loop runs while this is true (e.g., i < 5)
        // Update: Change the counter after every loop ex increasing or decreasing  (e.g., i++ || i-- ) 

        // Example 

        for(int i = 0 ; i < 5 ; i++){
            System.out.println(i + " ");
        }

        System.out.println();
        System.out.println();

        for(int i = 5 ; i > 0 ; i--){
            System.out.println( i + " ");
        }

        System.out.println();
        System.out.println();

        // do-While Loop 

        // do while loop is very similar to while loop but it first runs (do something) then check the condition 
        // it always runs at least 1 time
        // whether the condition is true or false

        // Syntax:
        // do{
        //    do something 
        // }while(condition);

        int i = 0;

        // it runs atleast 1 time 
        do{

            System.out.println(i); // 0

        }while(i > 1); // false condiiton 

        System.out.println("\n");

        // Break Statement
        // the break statement is used to immediately stop a loop or to exit the loop , even if the loop condition is still true
        // 
        Scanner sc = new Scanner(System.in);

        
        do{
            System.out.println(" enter number : ");
            int k = sc.nextInt();
            if(k % 10 == 0){
                break;
            }

            System.out.println( "user entered " + k  + " \n ");
            
        }while(true);
        

        System.out.println("\n");

        // Continue Statement 
        // continue statement is used to skip the current iteration and jump straight to the next cycle of the loop

         System.out.println("Enter 4 to Exit");
        do{
            System.out.println(" enter number : ");
            int k = sc.nextInt();
            if( k == 4){
                break;
            }
            if(k % 10 == 0){
                continue;
            }
            System.out.println( "user entered " + k  + " \n ");
            
        }while( true);

        sc.close();
    
    }
}

