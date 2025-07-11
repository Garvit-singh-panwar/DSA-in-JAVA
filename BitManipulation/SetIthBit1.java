public class SetIthBit1 {
    
// To set the i-th bit of a number to 1:
// Step 1: Left shift 1 by i positions => (1 << i)
//         This gives a number where only the i-th bit is set to 1.
// Step 2: Use OR operation with the original number => num | (1 << i)
// Why OR?
// - If the bit at position i is already 1: 1 | 1 = 1 (no change)
// - If the bit is 0: 0 | 1 = 1 (sets it to 1)
// So, OR ensures the i-th bit becomes 1 without changing other bits.


    
    public static int SetIthBit(int n , int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
}