// checking the largest of three no using conditionals else-if 
import java.util.Scanner;
public class largestOf3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from user

        System.out.print("Enter value of a ");
        int a = sc.nextInt();
        System.out.print("Enter value of b ");
        int b = sc.nextInt();
        System.out.print("Enter value of c ");
        int c = sc.nextInt();


        //  checking or printing who is the largest among 3 
       

        if(a >= b &&  a >= c ){
            System.out.println( a + " a is the largest ");
        }
        else if(b > c ){
            System.out.println(b + " b is the largest ");
        }
        else {
            System.out.println(c + " C is the largest ");
        }


        // we can also write this in  nested if 
        //  if(a >= b ){
        //     if(a >= c){
        //          sout(" A is bigger");
        //      }
        //      else{
        //          sout(" C is bigger");
        //      }
        //  }
        //  else {
        //      if(b >= c){
        //          sout(" B is bigger");
        //      }
        //      else{
        //          sout(" C is bIgger");
        //      }
        //  }


        sc.close();

    }
    
}