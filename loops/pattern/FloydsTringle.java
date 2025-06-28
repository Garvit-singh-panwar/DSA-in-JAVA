package pattern;

import java.util.Scanner;

public class FloydsTringle {

    
    public static void  floydsTringle(int height){

        int count = 1;

        for(int i = 1 ; i <= height ;  i++ ){

            for(int j=1 ; j <= i; j++){

                if(count < 10)System.out.print(count++ + "  ");
                else System.out.print(count++ + " ");


            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the Floyd's Pyramid");
        int height = sc.nextInt();

        floydsTringle(height);


        sc.close();

    }


}