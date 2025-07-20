// write a program to find length of string using recursion

package recursion.Assignment;


public class question3 {


    public static int lengthOfString(String str){
        
        if(str.equals("")){
            return 0;
        }

        return 1 + lengthOfString(str.substring(1));

    }

    public static void main(String[] args){

        String str = "hello world";

        System.out.println("the length of the string " + str + " is " + lengthOfString(str));

    }
    
}