public class FastExpo {

    // We want to calculate n^pow efficiently using fast exponentiation.
// The normal way takes O(n) time, but using bit manipulation, we can do it in O(log n) time.

// Here's the idea:

// 1. Convert the power into its binary form.
//    For example, 13 in binary is 1101 → which means:
//    n^13 = n^(8) * n^(4) * n^(1)

// 2. We'll iterate through each bit of the power:
//    - If the current bit is 1 → we multiply the result with the current base.
//    - Then, we square the base (because we're moving to the next power of 2).
//    - We right shift the power to move to the next bit.

// 3. We repeat this until the power becomes 0.

// This process ensures we multiply only when needed, drastically reducing the number of operations.


    public static int fastExponintation(int n , int pow){
        int ans = 1;

        while(pow > 0){

            if((pow & 1 ) == 1){
                ans = ans * n;
            }

            n = n*n;
            pow = pow >> 1;
        }

        return ans;
    }
}