// Write a Program that takes a year from the user and print whether that year is leap or not 
import java.util.Scanner;

public class checkLeapYear {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = sc.nextInt();

        String check = ((year %2) == 0) ? " is a leap year " : " is not a leap year ";

        System.out.println(year + check );



        sc.close();


    }
    
}