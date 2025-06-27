public class FunctionOverloading {

    // Function Overloading in Java

    // Function overloading allows us to define multiple methods 
    // with the same name but different parameter lists within the same class.
    // These differences can be in:
    // 1. Number of parameters
    // 2. Type of parameters
    // 3. Order of parameters

    //  Note:
    // Function overloading is based (only on method parameters).
    // Return type alone cannot be used to distinguish overloaded methods.

        
    // For example:
    // int sum(int a, int b) { ... }
    // float sum(int a, int b) { ... }  ← This will cause a compile-time error!
    //
    // Why? Because both methods have the same parameter list (int, int),
    // and the compiler can't differentiate them just by return type.




    // Example 1: Two parameters (int)
    int sum(int a, int b) {
        return a + b;
    }

    // Example 2: Three parameters (int)
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Example 3: Two parameters (float)
    float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        FunctionOverloading fo = new FunctionOverloading();

        int a = 10;
        int b = 20;
        int c = 30;
        float d = 2.4f;
        float e = 5.6f;

        // Calling the overloaded methods
        System.out.println("Sum of two integers: " + fo.sum(a, b));
        System.out.println("Sum of three integers: " + fo.sum(a, b, c));
        System.out.println("Sum of two floats: " + fo.sum(d, e));
    }
}
