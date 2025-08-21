package queues;


public class circularQueue {

    

    public static void main(String[] args){
    queue q = new queue(5);

    q.add(10);
    q.add(20);
    q.add(30);
    while(!q.isEmpty()){

        System.out.println( q.remove());
       
    }
    System.out.println(q.remove());
    q.add(10);
    q.add(20);
    q.add(30);


    q.add(40);
    q.add(50);
    q.add(60); 
}


    
}

class queue{

    int array[] = null;
    int front = -1;
    int rare = -1;



    queue(int size){
        this.array = new int[size];
    }

    public boolean isEmpty(){
        return rare == -1;
    }

    public boolean isFull(){
        return (rare+1) % array.length == front; 
    }

    public void add(int data){
        if(this.isFull()){
            System.out.println("queue is full");
            return;
        }
        if(this.isEmpty()){
            front = 0;
        }
        rare = (rare+1)%array.length;
        array[rare] = data;

    }

    public int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }
        int data = array[front];
        if(front == rare){
            front = rare = -1;
            return data;
        }else{
            front = (front+1)%array.length;
            return data;
        }

        
    }

    public int peek(){
        if(this.isEmpty()){
            System.out.println("array is empty");
            return Integer.MIN_VALUE;
        }
        else{
            return this.array[front];
        }

    }




}
