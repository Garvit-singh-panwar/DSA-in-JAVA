package Assignment;

public class Ques1 {

    
    // What does XOR (^) do?
// - XOR returns 1 if the bits are different, and 0 if the bits are the same.
// - So, when we XOR a number with itself, all bits are the same -> result is 0.
//   Example: 4 ^ 4 = 0
//     4  = 100
//     4  = 100
// XOR        -> 000

// - XOR with 0 keeps the number unchanged.
//   Example: 4 ^ 0 = 4
//     4  = 100
//     0  = 000
// XOR        -> 100



    public static int ansOfXxorX(int x){

        return x^x;

    }
    public static void main(String[] args) {
       
        int X = 5;
        System.out.println("the answer of "+ X + " xor " + X +" is "+ ansOfXxorX(X));
        
    }


}