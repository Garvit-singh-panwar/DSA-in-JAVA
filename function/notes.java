//  Functions 
// Let's take the example of a TV remote at home.
// We see that it has many buttons, and each button performs a specific task.
// For example, one button is used to switch the TV on or off,
// another button is used to increase or decrease the volume,
// and yet another is used to change the channel.

// Each button has a predefined function assigned to it.
// We don’t need to explain or teach the remote what to do when we press a button —
// the logic is already built-in and executed automatically.

// Similarly, in programming, we can replicate this behavior using **functions**.
// Just like each button on the remote has a specific job,
// each function in code can be written to perform a specific task when called.

// In java function is a resuable block of code which performs a perticular tasks   
// and we can make him do this work again amd again by calling it (like pressing button )


// What it the difference between functions and methods?
// functions and methods are same but when we write functions inside a class we call them methods 

// Syntax 

// Function without parameter

// returnType FunctionName(){
//       code to perform the task
//      return statement; 
// }


// Functions with Parameters

// Sometimes, functions take input data to perform their task.
// These input values are called **parameters**.

// returnType functionName(dataType parameter1 , dataType parameter2 , ...how many you wants){
//          body
//          return statement;
// }

import java.util.Scanner;
public class notes {


    // we are making a function without paremeters
    // and the task we are giving is to print hello world
    public static void printHelloWorld(){
        System.out.println("hello World");
        return;
    }


    // we are making a function with parameter
    // the the task we are giving is to add two values and return the result 
    public static int sum(int a , int b){ // variables defined in the function definition are called paremeters or formal parameters here a and b are the parameters
        return a+b;
    }


    // main is also a function  here the return type is void 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // to execute the function we have to call it 
        printHelloWorld();


        int x = sc.nextInt();
        int y = sc.nextInt();

        // Here, we are passing 'a' and 'b' as inputs (parameters) to the function.
        // The function calculates the sum of 'a' and 'b' and returns the result.
        // We store the returned value in a variable called 'sum'.
        // The purpose of the return statement is to send data back from the function,
        // which we can then use later in the program.

        int sum = sum(x, y); // arguments are the actual value we pass in the  function call ( here x and y are the arguments )
        System.out.println(sum); 

        sc.close();
        
    }
}