public class printRevNo {
// Print reverse of a number 
    public static void main(String[] args) {
        
        int num = 10899;

        int endNo = 0;

        System.out.println("just printing rev of num  ");
        while(num > 0 ){
            endNo = num % 10 ;
            num = num/10;
            System.out.print(endNo);
        }

        System.out.println();
        System.out.println();
        num = 10899;
        int revNo = 0;

        while(num > 0 ){

            revNo = (revNo*10) + num%10;
            num = num / 10;
            
        }

        System.out.println(" printing after storing rev of num ");
        System.out.println( revNo );

    }
}