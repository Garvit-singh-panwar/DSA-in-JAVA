public class swapTwoNo{

    // This method swaps the values of 'a' and 'b', but only inside this method
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " is the value of a inside the method");
        System.out.println(b + " is the value of b inside the method");
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        swap(a, b);

        System.out.println("But here’s the catch: the original values of a and b do not change.");
        System.out.println("Value of a in main: " + a);
        System.out.println("Value of b in main: " + b);

        // This is called *call by value* in Java.
        // It means when we pass variables to a method, we only pass their *values*, not the original variables themselves.
        //
        // A simple analogy:
        // In ancient times, people used to exchange gold directly to buy things.
        // Later, we created money — a paper representation of value — so we no longer needed to exchange real gold each time.
        // Similarly, in Java, we don’t pass the actual variable (like gold), we pass a copy of its value (like money).
        // So any changes made to the value (money) inside the method do not affect the original variable (gold).
    }
}
