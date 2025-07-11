public class UpdateIthBit {

    public static int clearIthBIt(int n , int i){
      int bitmask = ~(1 << i);
      return n&bitmask;  
    }

    // what we are doing in this function 
    // we are setting the bit at ith pos to 0 by clear bit function 
    // then aftetr updating ith bit to 0 we are lefshifting the new bit to the ith position 
    // so the new bit goes to the ith position where the bit is 0
    // then we are taking the or of new bit ant bit at ith position which is 0
    // if the new bit is 1 we the bit is set to 1 
    // if the bit is 0 the bit is set to 0
    // because 0 or 0 = 0 or 0 Or 1 = 1

    public static int updateIthBit(int num, int i , int newBit){

        num = clearIthBIt(num, i);
        int bitMask = newBit<<i;
        return num | bitMask;
         
    }
    
    public static void main(String[] args) {
      
        int num = 4 ;
        int newBit = 1;
        int ithpos = 2;
        System.out.println("the new value after updating " + ithpos  +" bit is " + updateIthBit(num,ithpos,newBit));
        
    }


}