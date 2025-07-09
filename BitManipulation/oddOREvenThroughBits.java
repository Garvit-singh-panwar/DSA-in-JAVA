// Binary representation of some integers:
// 0 = 000
// 1 = 001
// 2 = 010
// 3 = 011
// 4 = 100
// 5 = 101

// Notice the Least Significant Bit (LSB):
// - For (odd numbers), the LSB is always 1
// - For (even numbers), the LSB is always 0

// This means we can use a bitwise AND with 1 to check if a number is even or odd:
// - If (number & 1) == 1 -> the number is odd
// - If (number & 1) == 0 -> the number is even

// Why does this work?
// - AND with 1 keeps only the LSB (all other bits become 0)
// - So it effectively checks whether the LSB is 1 (odd) or 0 (even)

public class oddOREvenThroughBits {

    
    public static boolean isEven(int num){
        return  ( num & 1) == 0;
    }

    public static void main(String[] args) {
        
        int num = 6;
        if(isEven(num)){
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd num");
        }

    }

}
