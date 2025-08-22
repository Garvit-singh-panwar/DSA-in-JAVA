package queues;
import java.util.Queue;
import java.util.LinkedList;

public class stackUsing2Queue {
    public static void main(String[] args) {
        stack s = new stack();

        System.out.println("Is stack empty? " + s.isEmpty());

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        System.out.println("Stack size: " + s.size());     // 4
        System.out.println("Stack top (peek): " + s.peek()); // 40

        System.out.println("Pop: " + s.remove()); // 40
        System.out.println("Pop: " + s.remove()); // 30

        System.out.println("Stack top after pops: " + s.peek()); // 20
        System.out.println("Stack size: " + s.size());   // 2
        System.out.println("Is stack empty? " + s.isEmpty());

        System.out.println("Pop: " + s.remove()); // 20
        System.out.println("Pop: " + s.remove()); // 10
        System.out.println("Is stack empty? " + s.isEmpty()); // true
    }

    
}

class stack{

Queue <Integer> q1 = new LinkedList<>();
Queue <Integer> q2 = new LinkedList<>();

public boolean isEmpty(){
    return q1.isEmpty() && q2.isEmpty();
}

public  void add(int data){
    if(q2.isEmpty()){
        q1.add(data);

    }
    else{
        q2.add(data);
    }
}

public int remove(){
    if(this.isEmpty()){
        System.out.println("queue is Empty");
        return Integer.MIN_VALUE;
    }
    int data ;

    if(q1.isEmpty()){

        while(q2.size() != 1){
            q1.add( q2.remove());
        }
        data = q2.remove();
        return data;
    }
    else{
         while(q1.size() != 1){
            q2.add( q1.remove());
        }
        data = q1.remove();
        return data;

    }

}


public int peek(){
    if(this.isEmpty()){
        System.out.println("Queue is Empty");
        return Integer.MIN_VALUE;
    }
    int data;
    if(q1.isEmpty()){
        while(q2.size() != 1){
            q1.add(q2.remove());
        }
        data = q2.peek(); 
        q1.add(q2.remove()); 
    } else {
        while(q1.size() != 1){
            q2.add(q1.remove());
        }
        data = q1.peek();
        q2.add(q1.remove());
    }
    return data;
}



public int size(){
    if(this.isEmpty()){
        System.out.println("queue is empty");
        return 0;
    }
    if(q1.isEmpty()){
        return q2.size();

    }
    else{
        return q1.size();
    }
}
    
}