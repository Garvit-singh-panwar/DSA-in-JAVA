package Stacks;
public class PushElementAtBottom {

    public static void main(String[] args) {
     
        stackLL sll = new stackLL();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);

        sll.addInBottom(0);

        while(!sll.isEmpty()){
            System.out.print(sll.pop() + " ");
        }
    
        
    }
}
class Node{
    Node next;
    int data;
    Node(int data){    
        this.next = null; 
        this.data = data;
    }
}

//here we are making stack using linkedlist 
class stackLL{

    // we made a node head top element of stack
    // we also keep track of size in every stack 
    public Node head = null;
    public int size = 0;

    // its a boolean function checks that stack is empty or not 
    public boolean isEmpty(){
        return this.size == 0;
    }

    // using this function we add elements in the top of stack 
    public void push(int data){
        if(head == null){
            this.head = new Node(data);
            size++;
            return;
        }
        else{
            Node newNode = new Node(data);
            newNode.next = this.head;
            this.head = newNode;
            size++;
        }
    }

    // using this function we remove elements from the top of stack 
    public int pop(){
        if(this.isEmpty()){
            return Integer.MIN_VALUE;
        }

        int data = this.head.data;
        this.head = this.head.next;
        size--;
        return data;

    }

    // using this function we see value or data in the top of stack 
    public int peek(){
        return this.head.data;
    }

    
    public void addInBottom(int data){
        
     head = addInBottom_helper(data);

    }

    
    // using this function we are adding a new node in the bottom of the stack 
    // we are using the recursive approach 
    // we store head in the temp  variable every time then delete the head and do it until the head become null 
    // then in the we add data in the head 
    // and then add all the previous elements in it recursively 
    // using temp 
    public Node addInBottom_helper(int data){
        if(head == null){
            this.push(data);
            return head;
            
        }

       Node temp = head;
       this.pop();
       temp.next = addInBottom_helper(data);
       head = temp;
       size++;
       return head;
    }
    

}
