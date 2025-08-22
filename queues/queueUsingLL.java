package queues;

public class queueUsingLL {

     public static void main(String[] args) {
        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Removed: " + q.remove()); // 10
        System.out.println("Peek: " + q.peek()); // 20
        System.out.println("Queue size: " + q.getSize()); // 2
    }
    
}
class Queue {

    // Node structure
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front = null; // first element
    private Node rear = null;  // last element
    private int size = 0;      // number of elements

    // check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // add element to rear
    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // remove element from front
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int data = front.data;
        front = front.next;

        if (front == null) { // if queue became empty
            rear = null;
        }
        size--;
        return data;
    }

    // get front element without removing
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    // get size
    public int getSize() {
        return size;
    }
}
