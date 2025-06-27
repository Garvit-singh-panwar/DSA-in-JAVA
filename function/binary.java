public class binary {


    // function to convert binary no to decimal
    public static int convertDecimal(int binary){
 

        int decimalNo = 0;
        int pwr = 0;

        while( binary > 0 ){

            int num = binary%10;
            binary = binary /10;

            decimalNo +=  num * Math.pow(2,pwr);
            pwr++;

        }

        return decimalNo;
    }


    public static void main(String[] args) {
        
        int binary = 101010;

        System.out.println(convertDecimal(binary));

    }
}