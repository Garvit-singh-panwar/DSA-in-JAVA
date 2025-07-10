public class clearIthBit {

    // To clear (set to 0) the i-th bit of a number:
// Step 1: Create a mask using ~(1 << i)
//         - (1 << i) sets only the i-th bit to 1
//         - ~ (bitwise NOT) flips all bits: i-th becomes 0, others become 1
// Step 2: Use AND operation => num & ~(1 << i)
// Why AND?
// - At i-th position: 1 & 0 = 0 => clears the bit
// - At other positions: x & 1 = x => keeps them unchanged

    
    public static int clearIthBIt(int n , int i){
      int bitmask = ~(1 << i);
      return n&bitmask;  
    }
    public static void main(String[] args) {
        

    }


}