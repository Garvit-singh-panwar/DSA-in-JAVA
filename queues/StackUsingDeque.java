package queues;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Top element after pops: " + stack.peek());
        System.out.println("Stack size after pops: " + stack.size());

        // Final pop
        System.out.println("Popped: " + stack.pop());

        // Now stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
    
}

class Stack{

    private Deque<Integer> Dq = new LinkedList<>();

    public boolean isEmpty(){
        return Dq.isEmpty();
    }

    public int size(){
        return Dq.size();
    }

    public void push(int data){
        Dq.addLast(data);
    }

    public int pop(){
        if(Dq.isEmpty()){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return Dq.removeLast();
    }

    public int peek(){
        if(Dq.isEmpty()){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else return Dq.peekLast();
    }
}