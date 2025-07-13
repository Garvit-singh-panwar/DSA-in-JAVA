package Assignment;

public class swapTwoNum {

    public static void swapTwoNum(int a , int b){

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("values after swaping ");
        System.out.println("the value of a is " +  a);
        System.out.println("the value of b is " +  b);


    }

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println("values before swapping");
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
        swapTwoNum(a, b);
    }

}