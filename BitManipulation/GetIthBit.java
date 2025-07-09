// we are making the function to get the ith bit of a number how can we get that 

// method to get the i-th bit of a number:

// Approach:
// 1. Right shift the number by i positions: (num >> i).
//    This moves the i-th bit to the least significant bit (0-th position).
// 2. Perform a bitwise AND with 1: ((num >> i) & 1).
//    - If the result is 1 -> the i-th bit is 1
//    - If the result is 0 -> the i-th bit is 0

// This is a simple and intuitive way to check the value of the i-th bit in a number.

// we can also do this by left shift the one to its ith position without making any changes in the num it will also give us the same result 

public class GetIthBit {

    public static int binaryAtPos(int num ,int i){
    
        if(((num >> i ) & 1)==0){
            return 0;
        } 
        else{
            return 1;
        }
        
    }

    public static int binaryAtPos2(int num ,int i){
    
        if((num  & ( 1 << i)) == 0){
            return 0;
        } 
        else{
            return 1;
        }
        
    }

    public static void main(String[] args) {
        int  iThPos = 2;
        int num = 2;

        System.out.println("the answer we get from 1st approach is :- " + binaryAtPos(num,iThPos));

        System.out.println("the answer we get from 2nd approach is :- " + binaryAtPos2(num,iThPos));

    }

}