package Assignment;

public class swapTwoNum {

    // what xor does 
    // when we take xor two same bits it will make it 0
    // when we take xor of two different bits it will make it 1 
    // so when we take xor of two different num it makes a different num 
    // ex 10 xor 20 -> 10^20
    //      01010
    //      10100
    // xor  11110 -> 30 
    // 
    // then we do xor of the one prevoius num with the new num we get after xor we will the other previous num
    // ex 10 xor 30 
    // 
    //       01010
    //       11110
    // xor   10100 -> 20
    // 
    // XOR gives us the difference between two numbers.
    // If we XOR one of the original numbers with that difference,
    // we get the other number back.


    // XOR explained with a simple real-life story:

    // Me and my friend made a rule:
    // - If both of us have no money -> we do nothing. (0)
    // - If both of us have money -> we save it. (0)
    // - If only one of us has money -> we give it to a beggar. (1)

    // Now, I made two calendars:
    // 1. A "We Gave" calendar -> it shows all the days we (together) gave money to the beggar.
    // 2. An "I Gave" calendar -> it shows all the days I gave money to the beggar.

    // If I take the "We Gave" calendar and remove the days I gave,
    // I’ll know the days (my friend gave) money to the beggar.

    // That’s exactly how XOR works:
    // -> It shows 1 when only one value has 1 (just me or just my friend).
    // -> If I XOR the total with my own value, I get the other person's value.



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