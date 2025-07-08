import java.util.Scanner;

public class notes {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String is used to store text in java
    // its like a character array
    char variableName[] = {'a','b','c','d'};
    String VariableName = "abcd";
    // they looks same but there are many properties associated with string 
    // 

    // there are two methords to declare string 
    // 1st is 
    String str = "abcd";
    // 2nd is 
    String str2 = new String("abcd");

    // Strings are immutable in java
    // means they can not be changed in java 

    

    // we can take string as input in java using scanner class 
    // using a function .next() it takes a word as input 
    System.out.println("Enter something in the str  whith space ");
    str = sc.next();

    // one more function ,next line it takes a full para a full line with spaces as a input 
    System.out.println("enter some thing in the str1 with space ");
    str2 = sc.nextLine();


    System.out.println("this is the line you entered in str :- \n " + str);

    System.out.println( "this is the line you entered in str2 :-\n" + str2);

    System.out.println("\n");
    // string provides us various functionalities 

    // for example .length gives length of a string
    System.out.println("length of str is : - " + str.length());

    System.out.println("\n");

    // concatination
    // concatination used to merge two string '+' operator used to add two string
    String firstName = "Garvit";
    String lastName = "Panwar";
    
    String fullName = firstName + " " + lastName;
    System.out.println(fullName);

    // .charAt() function is used to find character at perticular index
    System.out.println("\n  charAt(0) of full name : - " + fullName.charAt(0));

     // .equals(str); is used to check value of two strings are equal or not

    if(str.equals(str2)){
        System.out.println( "\n \n" + str +  " " + str2 + " " + "are same");
    }
    else{
        System.out.println( "\n \n"+ str + " "+ str2 + " " + "are not same \n" );
    }

    // ei = ending index , si = starting index
    // .subString(si,ei) is used to find substring from si to ei of any string in this ei is exculded

    System.out.println(" \n \nsubstring from 0 to 6 is " + fullName.substring(0,6));

    //.compareTo() method compares two strings lexicographically, which means it compares them character by character using Unicode values.

    // If we want to make frequent small changes to a string, we use StringBuilder instead of String.
    // StringBuilder is a different type (class) provided in Java that works like a mutable version of String.
    // To use StringBuilder, we need to create a new object of the class like this:
    // StringBuilder sb = new StringBuilder("hw");

    // StringBuilder is not the same as String — it's a separate class used for creating and modifying strings efficiently.
    // However, we can convert a StringBuilder object into a String using the toString() method.

    // Example:
    StringBuilder sb = new StringBuilder("Hello");
    String SBstring = sb.toString(); // Now 'str' is a String


    // .toUpperCase() function is used to make srting to uppercase  
    // 


    }

   
    
}