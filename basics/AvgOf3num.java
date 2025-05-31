import java.util.Scanner;
//  Practice ques 1
// find avg of 3 num

public class AvgOf3num {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter value of c : ");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;

        System.out.println("Avg of a , b , c is : " + avg);


    }
}
