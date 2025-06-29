package pattern;

import java.util.Scanner;

public class ButterflyPattern {


    // this logic is made by me 
    public static void makeButterfly(int height){

        if(height%2 != 0) height++;

        for(int i = 1; i <= height/2 ; i++){

            for(int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            for(int k = 1 ; k <= height - i*2; k++ )
            {
                System.out.print("  ");
            }
            for(int l = 1; l <= i ; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = height/2; i >= 1 ; i--){

            for(int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            for(int k = 1 ; k <= height - i*2; k++ )
            {
                System.out.print("  ");
            }
            for(int l = 1; l <= i ; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }



    // I watched this in my tutorial
    public static void butterfly(int n){
        // 1st Half
        for(int i = 1; i<=n; i++){

            // print stars
            for(int j=1 ; j<=i; j++){
                System.out.print("* ");
            }

            // print spaces
            for(int j=1 ; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            // print stars
             for(int j=1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        // 2nd Half
        for(int i = n; i>=1; i--){

            // print stars 
            for(int j=1 ; j<=i; j++){
                System.out.print("* ");
            }

            // print spaces
            for(int j=1 ; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            // print stars
             for(int j=1 ; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the Butterfly : ");
        int heightOfButterfly = sc.nextInt();


        makeButterfly(heightOfButterfly);
        butterfly(heightOfButterfly);

        sc.close();

    }


}