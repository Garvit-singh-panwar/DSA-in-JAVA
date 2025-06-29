package pattern;

import java.util.Scanner;

public class DiamondPattern {

// I made the logic of this function  
    public static void diamondPtrn(int size){
        for(int i = 1; i< size; i++){
            for(int j = size ; j > i ; j--){
                System.out.print("  ");
            }
            for(int  j = 1 ; j <= i*2-1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = size ; i >= 1; i--){
            for(int j = size ; j > i ; j--){
                System.out.print("  ");
            }
            for(int  j = 1 ; j <= i*2-1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the  diamond : ");
        diamondPtrn(sc.nextInt());

        sc.close();
    }


}