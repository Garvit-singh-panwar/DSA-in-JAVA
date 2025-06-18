import java.util.Scanner;
public class isEven {

    public static boolean iseven(int num){
        return num%2 == 0;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int num = sc.nextInt();

        if(iseven(num)){
            System.out.println(num + " is a even number");
        }else{
            System.out.println(num + " is a odd number");
        }



    }
}