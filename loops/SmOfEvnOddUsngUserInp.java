import java.util.Scanner;
public class SmOfEvnOddUsngUserInp {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many elements you want to enter : ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;

        System.out.println("Enter element : ");
        for(int i = 0 ; i < num ; i++){
            int ele = sc.nextInt();
            if(ele%2 == 0) even += ele;
            else odd += ele;
        }

        System.out.println("Sum of even no is : " + even + " Sum of odd no is : " + odd);
    }

}