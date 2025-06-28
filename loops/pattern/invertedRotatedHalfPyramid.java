package pattern;

import java.util.Scanner;

public class invertedRotatedHalfPyramid {


    public static void InvertedRotatedPyramid(int height){

        for(int i = 1 ; i <= height; i++){

            for(int j = 1; j<= height-i; j++ ){
                System.out.print("  ");
            }

            for(int k = 1 ;  k <=i ; k++ ){
                System.out.print("* ");
            }

            System.out.println();

        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();

        InvertedRotatedPyramid(height);


        sc.close();


    }


}