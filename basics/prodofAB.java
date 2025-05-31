import java.util.Scanner;

//  here we take product of a and b tsking vslue from the user

public class prodofAB {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int prod = a*b;

        System.out.println(prod);
    }
    
}
