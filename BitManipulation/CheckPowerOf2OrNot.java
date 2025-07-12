public class CheckPowerOf2OrNot {

   // Goal: Check if a number is a power of 2

// Observation:
// - Power of 2 numbers in binary have only one bit set to 1.
//   Examples:
//     1  -> 0001 (2^0)
//     2  -> 0010 (2^1)
//     4  -> 0100 (2^2)
//     8  -> 1000 (2^3)
// - If a number is a power of 2, then doing (num & (num - 1)) results in 0.
//   Why?
//     - For a power of 2: only one bit is set (e.g., 1000)
//     - Subtracting 1 flips all bits after the set bit (e.g., 0111)
//     - ANDing them results in 0 (e.g., 1000 & 0111 = 0000)

// So, to check if a number is a power of 2:
// - Ensure the number is greater than 0 (since 0 is not a power of 2)
// - Then check: (num & (num - 1)) == 0

    
    public static boolean isPowerOf2(int val){
        return  (val & (val-1)) == 0;
    }

    public static void main(String[] args) {
     
        int num = 4;

        if(isPowerOf2(num)){
            System.out.println(num + " is the power of 2");
        }
        else{
            System.out.println(num + " is not the power of 2");
        }
        
    }

}
