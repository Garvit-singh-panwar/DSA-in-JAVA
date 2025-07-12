public class CountSetBitsInANum {

// What we want to do:
// We want to count the number of set bits (1s) in the binary representation of a number.
//
// How we do it:
// - We'll use bitwise AND (&) between the number and 1 to check the last bit.
//   - If the result is 1, that means the last bit is set, so we increment the count.
// - Then, we right shift the number by 1 (n = n >> 1) to move to the next bit.
// - We repeat this process until the number becomes 0.
//
// Why stop at 0?
// Because once the number becomes 0, all remaining bits are 0 and there's nothing left to count.


    public static int countSetBits(int num){
        
        int count = 0;

        while(num > 0){
           if( (num & 1)== 1){
                count++;
           }       
           num = num >>1;
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
    
}