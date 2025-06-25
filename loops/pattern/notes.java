// Nested loops in Java mean putting one loop inside another loop. You can nest:

// for loops inside for loops

// while loops inside for loops

// for inside while, etc.

// syntax: 

// for(initilization; condition; updation ){   //outer loop

//      for(initilization ; condiiton ; updation){   // inner loop
                // do something
//       }

// }

package pattern;

public class notes {

    public static void main(String[] args) {
        //     Real-Life Analogy
        // Imagine a school:

        // Outer loop: for each classroom

        // Inner loop: for each student in that classroom

        // You're checking every student in every classroom — that's a nested loop!

        int classroom = 5 ;
        int studentInClassRoom = 10 ;

        for(int i = 1 ; i <= classroom ; i++){

            for(int j = 1 ; j <= studentInClassRoom ; j++){
                System.out.println("classroom" + i + " Student" + j);
            }

        }

        System.out.println();
        // If you Want to Print Pattern you have to understand 3 steps
        // 1. How many lines you want to print -> outer loop 
        // 2. How many character we want to print in every line
        // 3. What we want to print -> Character ex "x" , "*" , "A to Z" , " 0 to 9 " , " @ "

        // Example  : -  here character is " * "
        // 1. *             1-character in 1st line
        // 2. * *           2-character in 2nd line
        // 3. * * *         3-character in 3rd line
        // 4. * * * *       4-character in 4th line
        // 5. * * * * *     5-character in 5th line

        System.out.println("here we are printing pattern \n ");

        for(int line = 1; line <= 5 ; line++){

            for(int characters = 1; characters <= line ; characters++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Example 2 : -   here character is " * "
        // 1. * * * *      4-character in 1st line
        // 2. * * * *      4-character in 2nd line
        // 3. * * * *      4-character in 3rd line
        // 4. * * * *      4-character in 4th line

        
        System.out.println(" \nHere we are printing 2nd pattern \n ");

        for(int line = 1 ; line <= 4 ; line ++){
            for(int characters = 1 ; characters <= 4 ; characters++){
                System.out.print("* ");
            }
            System.out.println(); // it is to jump to the next line 
        }
    }

}