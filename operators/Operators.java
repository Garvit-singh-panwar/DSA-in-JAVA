public class Operators {

    public static void main(String[] args){

        System.out.println(2 + "2" + 2); // 222 addition operator works as a concatination operator in string 
        System.out.println(2 + 2 + "2"); // addition operator adds two intiger then works as  a concatination operator for string
        // 2 + 2 + "2" = 4 + "2" = "42"

        System.out.println((2 + 2 + "2" + 2 + 2)); // first addition operator works as a addition operator then works as a concatination operator for string 
        //  2 + 2 + "2" + 2 + 2 =>  4 + "2" + 2 + 2 = "42" + 2 + 2 => "422" + 2 => "4222"



        System.out.println();
        System.out.println();


        //  when you perform arithmetic operations between two different data types, the result is automatically promoted to the "larger" or "higher-ranked" data type . This process is called type promotion or type conversion.

        System.out.println(10 / 5); // 2 (int/int) => int 
        System.out.println(10.0 / 5.0) ; // 2.0 (double/double) => double
        System.out.println(10 / 5.0); // 2.0 (int / double) => double 
        System.out.println(10.0 / 5); // 2.0 (double / int) => int   

        System.out.println();
        System.out.println();


        // average of 2 values 
        // the operators with higher precidence evaluated first
        // if the operators have save precedence then it follows left to right associativity 
        int left = 5 , right = 10;
        int mid = left + right / 2 ;
        System.out.println(mid);
        mid = (left + right) / 2 ;
        System.out.println( mid );


        System.out.println( 5 - (10 * 15/2 - (7+4)));  // -59 
        


        // assignment 

         int x = 2 ;
         int y = 5 ;
        // When we assign a value to a variable (e.g., variable = value),
        // the right-hand side (the value or expression) is evaluated first.
        // After evaluating the right-hand side, the result is assigned to the variable on the left.
        x = x + y ;
        
        System.out.println();
        System.out.println();

        // pre increment and post increment 
        // in pre increment the we first increment the value then use it
        // in post increment we first  assign the value then increment it 


        x = y++ ;  // its like int temp = y;
        //  y= y+1;
        // return temp;

        x = ++y ;
        // its like y = y+1 ;
        // return y;
        System.out.println();





    }
}