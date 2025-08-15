package Stacks;
import java.util.Stack;

public class validParanthesis {

    public static boolean checkParanthesis(String paranthesis) {
    Stack<Character> s = new Stack<>();

        for (int i = 0; i < paranthesis.length(); i++) {
            char ch = paranthesis.charAt(i);

            // If opening bracket, push into stack
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                // If stack is empty, there's no matching opening bracket
                if (s.isEmpty()) {
                    return false;
                }

                // Check matching pairs
                if ((ch == ')' && s.peek() == '(') ||
                    (ch == ']' && s.peek() == '[') ||
                    (ch == '}' && s.peek() == '{')) {
                    s.pop();
                } else {
                    return false; // Mismatched bracket
                }
            }
        }

        // If stack is empty, all brackets matched
        return s.isEmpty();
    }


    public static void main(String[] args){

        String parenthesis = "[({})]";

        if(checkParanthesis(parenthesis)){
            System.out.println(parenthesis + " is a valid parenthesis sequence ");
        }
        else{
            System.out.println(parenthesis + " is not a valid parenthesis sequence ");
        }
    }
    
}






