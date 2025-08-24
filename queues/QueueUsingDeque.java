package queues;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("Is queue empty? " + q.isEmpty());

        // Adding elements
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Queue size after adding elements: " + q.size());
        System.out.println("Peek (front element): " + q.peek());

        // Removing elements
        System.out.println("Removed: " + q.remove());
        System.out.println("Peek after remove: " + q.peek());

        q.add(40);
        q.add(50);
        System.out.println("Queue size now: " + q.size());

        // Removing all elements
        while (!q.isEmpty()) {
            System.out.println("Removed: " + q.remove());
        }

        // Trying to remove/peek from empty queue
        System.out.println("Remove from empty queue: " + q.remove());
        System.out.println("Peek from empty queue: " + q.peek());
    }

    
}

class Queue{

    Deque <Integer> dq = new LinkedList<>();

    public boolean isEmpty(){
        return dq.isEmpty();
    }

    public int size(){
        return dq.size();
    }

    public void add(int data){
        dq.addLast(data);
    }

    public int remove(){
        if(dq.isEmpty()){
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        else return dq.removeFirst();
    }

    public int peek(){

        if(dq.isEmpty()){
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        else return dq.peekFirst();
    }


}