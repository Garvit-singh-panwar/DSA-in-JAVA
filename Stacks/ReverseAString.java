package Stacks;

import java.util.Stack;

public class ReverseAString {

    public static void main(String[] args) {
        String s = "garvit";
        String result = reverseString(s);

        System.out.println(result);
        
    }
    
    public static String reverseString(String s){

        Stack <Character> rev = new Stack<>();
        int  i = 0;

        while(i != s.length()-1){
            rev.push(s.charAt(i));
            i++;
        }

        StringBuilder  newStr = new StringBuilder();
        while(!rev.empty()){
            newStr.append(rev.pop());
        }

        return newStr.toString();
    }
    


}