// Enter cost of 3 items from the user (using float data type) - a pencil , a pen and a eraser. You have to output the total cost of the items back to the user as their bill

import java.util.Scanner;

public class CalcCost{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter value of a pencil : ");
    float pencil = sc.nextFloat();
    System.out.print("Enter value of a pen : ");
    float pen  = sc.nextFloat();
    System.out.print("Enter value of a ereaser : ");
    float ereaser = sc.nextFloat();


    System.out.println("generated bill : totalcost: " + (pencil + pen + ereaser) );

    }
}