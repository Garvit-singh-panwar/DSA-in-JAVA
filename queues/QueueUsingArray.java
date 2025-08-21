package queues;

public class QueueUsingArray {


    public static void main(String Args[]){
        queue q1 = new queue(4);
        q1.add(4);
        System.out.println(q1.peek());
        q1.add(12);
        System.out.println(q1.peek());
        q1.remove();
        System.out.println(q1.peek());
        q1.remove();
        q1.remove();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        while(!q1.isEmpty()){
            System.out.println(q1.remove() + " ");
        }System.out.println();

    }
}

// here we made a queue using array

class queue{
    // here we initialized a array of length size
    int array[] = null;

    
    // here we made the constructor
    // in which we take size of the array
    queue(int size){
        this.array = new int[size];
    }

    // here we made front or rare used to store data
    int rare = -1;
    int front = -1;

    // here we made a function isEmpty which gives true if the array is empty and false if not
    public boolean isEmpty(){
        return rare == -1;
    }

    // here we made a function isFull which gives true if the array is full and false if not
    public boolean isFull(){
        return rare >= this.array.length-1;
    }


    // here we a function to add element in our queue 
    public void add(int data){

        if( this.isFull()){ 
            // if the array is full we return we print queue is full in the console and then return 
            System.out.println("Queue is full ");
            return;
        }

        if(this.isEmpty()){
            // if the array is empty we first increment the rare and front and then store element in them 
            front = 0;
        }
        
        
        array[++rare] = data;
        // after storing the data in the index we increment rare
        
    }

    // here we made a function to remove the element from the queue 
    public int remove(){

        if(isEmpty()){
            // if the array is empty then we just print array is empty and return 
            System.out.println("queue is empty");
            return Integer.MAX_VALUE;
        }

        // here we are storing the previous element in data
        int data = array[front];

        // if rare == front means rare is at 0 index 
        // means we have to make them both -1 and return previous data
        if(rare == front){
            rare = front = -1;
            return data;
        }
        else{
            // if not then we have to shift all the elements backward and decrement rare 
            for(int i = 0; i < rare ; i++){
                this.array[i] = this.array[i+1]; 
            }
            rare--;
            return data;
        }

        
    }

    // here is the peek function in which we 

    public int peek(){
        if(this.isEmpty()){
            System.out.println("queue is Empty");
            return Integer.MIN_VALUE;   
        }
        return this.array[front];
    }
    

}