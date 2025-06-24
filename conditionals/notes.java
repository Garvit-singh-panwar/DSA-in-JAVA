// What are Conditional Statements in Java?
// Conditional statements in Java allow your program to make decisions and execute certain blocks of code based on whether a condition is true or false.

// types
// if else 
// else-if
// ternary operator
// Switch Statement


public class notes {

    
    public static void main(String[] args){

// if-else
// if else in java allows your program to make decisions 
// it checks the condition and if the condition is true it execute the code written inside if block 
//  else it execute the code written inside else block
        // Example
        int age = 20; // make age < 18 to execute code inside else block
        if(age >= 18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you can not drive");
        }


// else-if
// The else if statement is used when you want to check multiple conditions, one after another.
// It helps you run different blocks of code depending on which condition is true.


        int marks = 80;  // change marks to check multiple conditions
                                                        // note ** Java checks conditions from top to bottom, one by one.
        if(marks >= 80){                                // As soon as one condition is true, the remaining conditions are ignored, even if they are also true.
            System.out.println("A grade ");           // Write the most specific or highest-priority condition in the if         
           }                                               
        else if(marks >= 60 ){
            System.out.println("B grade ");           // Then, the second important in else if
        }
        else if(marks >= 30){
            System.out.println("C grade ");           // Continue downward
        }
        else{
            System.out.println(" fail ");
        }

// Ternary Operator 
// The ternary operator is a shortcut for if-else statements.
// It lets you write simple conditional logic in one line.

// variable = condition ? value_if_true : value_if_false;

        // Example
        int number = 4; // change number to test it
        String type = ((number%2) == 0 ) ? "even " : "false";
        System.out.println("number is " + type);


// Switch case 

// A switch statement is used to check one variable against multiple possible values and run code based on which value matches.

// It’s a cleaner alternative to many else if conditions when comparing the same variable.

// switch (expression) {
//     case value1:
//         // code block
//         break;
//     case value2:
//         // code block
//         break;
//     // more cases...
//     default:
//         // code if no cases match
// }

        // Example
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }




}


}