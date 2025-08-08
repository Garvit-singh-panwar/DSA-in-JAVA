package Stacks;

import java.util.Stack;

public class ReverseAStack {

    
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st = reverse(st);

        while(!st.isEmpty()){
            System.out.println(st.pop() + " ");
        }
        System.out.println();

        Stack<Integer> st2 = new Stack<>();
        st2.push(1);
        st2.push(2);
        st2.push(3);
        st2.push(4);
        st2.push(5);

        reverse2(st2);

        while(!st2.isEmpty()){

            System.out.println(st2.pop() + " ");
        }
        System.out.println();

    }


    // here we are using a stack to reverse a whole 
    // we are just adding the value in the new stack and then return it  
    // this will result in a reverse stack
    public static Stack<Integer> reverse(Stack <Integer> st){
        Stack<Integer> rev = new Stack<>();

        while(!st.isEmpty()){
            rev.push(st.pop());
        }

        return rev;

    }

    // in this function we are removing the elements until it become null using recursion
    // before recursive call we store the prev data in prevtop var
    // while returning back we push that data in the bottom of the stack by calling push at bottom function
    public static  void reverse2(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int top = st.pop();
        reverse2(st);
        pushAt_Bottom(st , top);

    }


    public static void pushAt_Bottom(Stack<Integer> st ,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }

        int prevTop = st.pop();
        pushAt_Bottom(st,data);
        st.push(prevTop);

    }
}