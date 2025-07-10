public class SetIthBit1 {

    // to set the ith bit = 1 we left shift the 1
    // to the ith position where we then we do the or operation of num with number
    //  

    
    public static int SetIthBit(int n , int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
}