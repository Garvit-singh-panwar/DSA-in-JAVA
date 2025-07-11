public class ClearLastIBits {

  // Goal: Clear (set to 0) all bits below the i-th position in a number.
// 
// To do this, we need a mask that has 0s in the lower i bits 
// and 1s in all the higher bits. When we perform an AND operation:
// - 0 & 0 = 0     (clears the bit)
// - 1 & 0 = 0     (clears the bit)
// - 1 & 1 = 1     (preserves the bit)
//
// How to create the mask:
// - Start with -1 (which is all 1s in binary)
// - Left shift it by i positions: (-1 << i)
//   This shifts i zeros into the lower bits, resulting in:
//   111...111000...000  <- i zeros on the right
//
// Then, AND the number with this mask:
//   num & (-1 << i)
//
// This will clear all bits from position 0 up to (but not including) i.



    public static int clearLastIBits(int num , int i)
    {
        int bitMask = -1 << i;
        return num & bitMask;
    }
    
    public static void main(String[] args) {
        
        int num = 12;
        int i = 2;

        System.out.println(clearLastIBits(num, i));

    }

}