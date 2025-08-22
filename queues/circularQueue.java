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

// here we made a circular queue
class queue{

    // we made this queue using array here we are initializing the array as null
    int array[] = null;
    // here we made rare or front to store element
    int front = -1;
    int rare = -1;



    // here we are making constructor which initialize array of size we pass in the argument
    queue(int size){
        this.array = new int[size];
    }

    // it checks queue is empty or not
    public boolean isEmpty(){
        return rare == -1;
    }

    // it checks queue is full or not
    public boolean isFull(){
        return (rare+1) % array.length == front; 
    }

    // this function add elements in the queue
    public void add(int data){
        //if the queue is full we return 
        if(this.isFull()){
            System.out.println("queue is full");
            return;
        }
        // if the quque is empty we make front 0
        if(this.isEmpty()){
            front = 0;
        }

        // we make rear as the rare+1%array.length 
        // so when our rare exceed the last index we make it 0 and store element at that index
        rare = (rare+1)%array.length;
        array[rare] = data;

    }

    // here we remove elements from queue
    public int remove(){
        // if its empty then we print its empty and return min value of integer
        if(isEmpty()){
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }
        // other wise we sore the value present at array at front in the data
        int data = array[front];

        // then we check if front == rear we make them both -1 and return the data
        if(front == rare){
            front = rare = -1;
            return data;
        }else{
            // if not then we increment the front 
            front = (front+1)%array.length;
            return data;
        }

        
    }

    // here we check which element is at the front 
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
