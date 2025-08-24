package queues;


import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class queueReversal {

    // here we want to reverse the linked list 
    public static void reverseQueue(Queue<Integer> q){
        // we use stack to reverse the linked list
        Stack <Integer> s = new Stack<>();

        // for queue Reversal first
        // we add all the elements of q in the stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }

        // then we add back all the elements from stack to queue

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }


    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println("the front of queue before reversing is "+q.peek());
        reverseQueue(q);
        System.out.println("the front of queue after reversing is " + q.peek());

    }
}