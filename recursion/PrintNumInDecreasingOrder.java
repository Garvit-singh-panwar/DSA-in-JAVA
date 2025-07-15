package recursion;

public class PrintNumInDecreasingOrder {

    public static void printNumInDecOrder(int num){

        if(num == 0){
            return ;
        }

        System.out.print(num + " ");
        printNumInDecOrder(num-1);
    }

    public static void main(String[] args) {
        
        printNumInDecOrder(10);
        System.out.println();
    }
    
}