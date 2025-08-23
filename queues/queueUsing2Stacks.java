package queues;
import java.util.Stack;

public class queueUsing2Stacks {

    public static void main(String[] args) {
        queue q = new queue();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Remove: " + q.remove()); // 10
        System.out.println("Peek after remove: " + q.peek()); // 20
        System.out.println("Size: " + q.size()); // 2
    }

    
}

// here we are using 2 stacks to make a queue 
class queue{

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();


    // if s1 is empty then our queue is empty
    public boolean isEmpty()
    {
        return s1.isEmpty();
    }

    // to add data 
    // we first shift all the element of s1 in s2 
    // then add the new data in s1 
    // and add all data back from s2 to s1
    public void add(int data){
        while(!s1.isEmpty()){
            s2.add(s1.pop());
        }
        s1.add(data);
        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
    }


    // if the s1 is empty then we return integer min value
    // if not we remove the top from s1
    public int remove(){
        if(this.isEmpty()){
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;

        }

        return s1.pop();
    }


    // we just see the top value of s1
    public int peek(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return s1.peek();
    }


    // if the s1 is empty means array is empty we return 0
    // if not the we return the size of s1
    public int size(){
        if(this.isEmpty()){
            return 0;
        }
        return s1.size();
    }

}