package recursion;

public class PrintNumInIncreasingOrder {


    public static void printInIncreasingOrder_recursion(int num){
        if(num == 0){
            return;
        }

        printInIncreasingOrder_recursion(num-1);
        System.out.print(num + " ");

    }

    
    public static void main(String[] args){

        int n = 10;
        printInIncreasingOrder_recursion(n);
        System.out.println();


    }


}