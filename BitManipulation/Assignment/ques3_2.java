package Assignment;

public class ques3_2 {

    // How this function works:
    // ~num → Gives the 1's complement of num (flips all bits)
    //     Example: ~5 → 11111010 (which is -6 in 2's complement)
    // -num → Gives the 2's complement of num, which is equal to (~num + 1)
    // So: -5 = ~5 + 1 = 11111010 + 1 = 11111011

    // Therefore, -~num means: 
    //     -(~num) = (~(~num) + 1) → This results in (num + 1)

    // Final result: 
    //     -~5 = 6 → Same as 5 + 1


    public static int add1UsingBit(int num){

     return -~num;

    }
    public static void main(String[] args) {
        
        int num = 14;
        System.out.println("adding 1 in num after bit manipulation -> " +add1UsingBit(num));

    }
    
}