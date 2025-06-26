package pattern;
import java.util.Scanner;
public class invertedStarPattern {

    public static void main(String[] args) {
        // 1 * * * *   print 4 characters   =  lines(4) - currentline( i = 1)  + 1 = 4
        // 2 * * *     print 3 characters   =  lines(4) - currentline( i = 2)  + 1 = 3
        // 3 * *       print 2 characters   =  lines(4) - currentline( i = 3)  + 1 = 2
        // 4 *         print 1 characters   =  lines(4) - currentline( i = 4)  + 1 = 1
        // Character " * "

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of a inverted pyramid ");
        int lines = sc.nextInt() ;
        
        for(int i = 1 ; i<= lines ; i++){

            for(int characters = 1 ; characters <= lines-i+1  ; characters++){
                System.out.print(" *");
            }
            System.out.println();

        }


        sc.close();


    }
}