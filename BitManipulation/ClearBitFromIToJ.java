public class ClearBitFromIToJ {

    // here what we have to do 
// we wants all the bits from i to j in a num become 0

// to do that we have to make a bitmask where all the value from i to j = 0 and remaining will be 1
// then we have to do the and operation of num with that bit mask 

// for ex i = 5 and j = 3 
// so the bitmask is -> 1111000111;

// to make that bit mask we can make two masks 
// 1st is a where all the bits from 0 to 1+1 is 0   1111000000;
// 2nd is where all the bit upto j is 1 0000000111
// then we do Or operation of both of them and our final mask is now ready 1111000111;

// then to get all 0 from i to j we can do and operation of the num with final bitmask 
// then we get the result

    public static int clearBitFromItoJ(int n , int i , int j){
        int a = (-1)<<(i+1); // get all 0 upto i+1
        int b = (1<<j)-1;   // get all 1 upto j
        int bitmask = a | b; // get our final bit mask where all 0 from i to j
        return n & bitmask;  // then we return our final value
    }

    public static void main(String[] args) {
    int n = 1023; // binary: 1111111111
    int i = 5;
    int j = 3;

    int result = clearBitFromItoJ(n, i, j);
    System.out.println("Result: " + result);                   // Should be 961
    System.out.println("Binary: " + Integer.toBinaryString(result)); // 1111000001
    }

}