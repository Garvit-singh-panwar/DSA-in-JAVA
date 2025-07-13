// add 1 to an integer using bit manipulation

package Assignment;

public class ques3 {

// | Decimal | Binary |
// | ------- | ------ |
// | 1       | 0001   |
// | 2       | 0010   |
// | 3       | 0011   |
// | 4       | 0100   |
// | 5       | 0101   |
// | 6       | 0110   |
// | 7       | 0111   |
// | 8       | 1000   |
// | 9       | 1001   |
// | 10      | 1010   |

// as we can analize from every num if we want to add 1 we can make the bit at 0th pos 1 or if the bits at 0 is 1 then we can traverse to bit which is  0 then we can make that 1 and all the previous 1 bits 0 thats how we can add 1 using bit manipulation

    public static int add1UsingBIts(int num){

        int ans = num;
        int i = 0;

    if((ans&1)== 0){
        return num|1;
    }    
        
     while((ans & 1) != 0){
        ans = ans>>1;
        i++;
     }
     i++;
     return (num ^ ((1<<i)-1));
     

    }

    public static void main(String[] args) {
        
        int num = 7;
        System.out.println("number after adding 1 using bits " + add1UsingBIts(num));

    }

}