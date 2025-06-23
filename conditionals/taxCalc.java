import java.util.Scanner;
//  we are calculating tax based on a persons salary or income 

public class taxCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        int tax;
        if(income < 500000){
            tax = 0 ;
        }
        else if( income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int)(income*0.3);
        }

        System.out.println("your tax is "+ tax);

        sc.close();
    }

} 