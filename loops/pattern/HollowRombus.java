package pattern;

import java.util.Scanner;


public class HollowRombus {


    public static void hollowPyramid(int size){
// this logic is made by me 
        for(int i = 1 ; i<=size; i++){
            for(int j = size; j>i ; j-- ){
                System.out.print("  ");
            }
            for(int j = 1 ; j<= size; j++){

                if(j == 1 || j == size || i == 1 || i == size){
                     System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }


    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the hollow rombus : ");
        int size = sc.nextInt();

        hollowPyramid(size);
        sc.close();

    }


}