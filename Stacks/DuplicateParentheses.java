package Stacks;

// Find duplicate parentheses
// Our goal is to detect unnecessary (duplicate) parentheses in an expression.
//
// Rule:
// - If a pair of parentheses directly contains an expression (like "(a+b)"), it's valid.
// - But if a pair of parentheses only surrounds another pair of parentheses with an expression 
//   (like "((a+b))"), then the outer parentheses are unnecessary.
//   This is because they don't wrap an expression directly, 
//   they just wrap another set of parentheses.


import java.util.Stack;

public class DuplicateParentheses {


    // to check this is not a duplicate parentheses 
    // we take parentheses sequence as an argument
    public static boolean checkDuplicateParenthesis(String parentheses){

        // then we make a stack name expression  in which we store expression up to ending parentheses 
        Stack<Character> expression = new Stack<>();

        // here we make a loop which traverse for full parentheses sequence 
        for(int i = 0 ; i < parentheses.length() ; i++){
         
            // we take current parentheses character in ch 
            char ch = parentheses.charAt(i);

            // then we check if current ch in parentheses sequence is not a ending parentheses then we push it into a expression  
            if(ch != ')' && ch != ']' && ch != '}'){
                expression.push(ch);
            }
            else{

                // if its a ending parentheses  we check before its there any expression or parenthesis available 
                // if not then its not a valid parentheses so no point to check further return false 
                if(expression.isEmpty()){
                    return false;
                }

                // if there is a expression or parentheses available we 
                // then check is the last thing available before closing parentheses is opening parentheses  
                // if yes then it is unnecessary or duplicate so return true 
                // means there is a duplicacy
                if(expression.peek() == '(' || expression.peek() == '[' || expression.peek() == '{' ){
                    return true;
                }

                // if not then we remove all the expression comes after opening bracket or until the expression becomes empty
               while(!expression.isEmpty() && expression.peek() != '(' && expression.peek() != '[' && expression.peek() != '{'){
                    expression.pop();
                }

                // then we check is the expression empty 
                // if yes then we return false means the expression is not valid 
                if(expression.isEmpty()){
                    return false;
                }

                // if the expression is not empty then we check the parentheses in available in the expression is correct or not if it is correct then we remove it 
                // if not then the parentheses sequence is not correct we return false

                if(expression.peek() =='(' && ch == ')' || expression.peek() == '[' && ch == ']' || expression.peek() == '{' && ch == '}'){
                    expression.pop();
                }
                else{
                    return false;
                }



            }
            
        }

        // if the parentheses sequence is correct and there is no duplicacy then it is not a duplicate parentheses we return false means it is not duplicate
        return false;

    }
    
    public static void main(String[] args){

        String expression = "{8+(6-7)()}";
        if(checkDuplicateParenthesis(expression)){
            System.out.println(expression +" is a duplicate parentheses sequence ");
        }
        else{
            System.out.println(expression +" is not a duplicate parentheses sequence ");
        }

        expression = "[(79) * (4-5)+(6)]";

        if(checkDuplicateParenthesis(expression)){
            System.out.println(expression +" is a duplicate parentheses sequence ");
        }
        else{
            System.out.println(expression +" is not a duplicate parentheses sequence ");
        }

    }

}