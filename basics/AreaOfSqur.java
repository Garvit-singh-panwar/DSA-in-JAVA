import java.util.Scanner;
// :In a program, input the side of a square . You have to output the area of the square.

public class AreaOfSqur {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of side of a Square : ");
        float side = sc.nextFloat();

        float area = (float)side * side;

        System.out.println("Area of Square : " + area);



    }

}
