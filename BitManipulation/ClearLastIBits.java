public class ClearLastIBits {

    // here what we want to do  
    // we want to make all the bits up to ith post 0
    // so have to do and operation fo num with 0 up to its ith pos after that all bits should be 1
    // so when we do 0 & 0 it will give 0 and  0 &1  also give 1
    // and when we do 1 & 1 it will give 1 and when we do 1 & 0 it will give 0

    // so to make all the bit up to i 0

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