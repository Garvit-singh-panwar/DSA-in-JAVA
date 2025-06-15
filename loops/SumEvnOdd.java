import java.util.Scanner;

public class SumEvnOdd {

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number N : ");
        int num = sc.nextInt();

        int even = 0;
        int odd = 0;

        for(int i = 1 ; i <= num ; i++){
            
            if(i%2 == 0){
                even += i;
            }
            else{
                odd += i;
            }

        }
        System.out.println("Sum of even no is : " + even);
        System.out.println("Sum of odd no is : " + odd);

    }


}