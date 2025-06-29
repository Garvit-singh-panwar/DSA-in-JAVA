package pattern;

import java.util.Scanner;

public class zeroOneTriangle {

    public static void ZeroOneTriangle(int height){
        // This is what i made with my logic 
        for(int i = 1  ; i <= height ; i++){

            int binary = i%2;
            for(int j = 1; j<=i; j++){

                if(binary == 0)System.out.print(binary++ + " ");
                else System.out.print(binary--+ " ");
             

            }
            System.out.println();
        }

    }

    
    public static void ZeroOneTriangle1(int height){

        // this is what i watched from the course tutorial
        for(int i = 1  ; i <= height ; i++){

            for(int j = 1; j<=i; j++){

                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
             

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the height of 0-1 pyramid: ");
        int height = sc.nextInt();

        // ZeroOneTriangle(height);

        ZeroOneTriangle1(height);
        sc.close();

    }
    
}