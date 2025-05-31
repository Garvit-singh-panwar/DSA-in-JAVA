import java.util.Scanner;

public class circleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of a circle : ");
        float radius = sc.nextFloat();

        float area = (float)3.14 * radius * radius ;

        System.out.println("area of circle = " + area);

    }
}
