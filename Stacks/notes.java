package Stacks;

// stacks is a user defined linear type of data structure
// elements will be inserted or deleted from only one side 

// stacks is like a bucket 
// in thich we can fill it from the top and take water from the top

// Operations on stack 
// push operation means insertion operation time complexity o(1)
// pop operation means deletion operation time complexity o(1)
// peek operation means see hte top element timecomplexity o(1)

// we also call it LIFO data structure means last in first out

// to make statck we can use array , arraylist , linkedlist 

// if we make stack using array it will be of fixed size 
// if we make stack using arraylist then we can add more elements in it 

// if we make stack using linkedlist then we can also add as many elements as we want 

import java.util.ArrayList;

class stack {

    ArrayList <Integer> list = new ArrayList<>();

    // it a boolean function gives true if array is empty otherwise false
    public boolean isEmpty(){ 
        return list.size() == 0;
    }

    // this is push by which we add elements in stack 
    public void push(int data){
        this.list.add(data);
    }
    
    // from this function we remove last element from the stack and we also return the last element value
    public int pop(){
        int indx = list.size()-1;
        int temp = this.list.get(indx);
        this.list.remove(indx);
        return temp;
    }

    // this will show the data present in the last element
    public int peek(){
        if(this.isEmpty()){
            return Integer.MIN_VALUE;
        }
        return this.list.get(list.size()-1);
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

}

public class notes {
    public static void main(String[] args){

        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()){

            System.out.print(s.pop() + " ");
        }
        System.out.println("\nwe removed every element ");

        stackLL sLL = new stackLL();

        sLL.push(1);
        sLL.push(2);
        sLL.push(3);
        sLL.push(4);
        sLL.push(5);

        while(!sLL.isEmpty()){
            System.out.print(sLL.pop() + " ");
        }
        System.out.println("\n stack is empty now");

        // we can also use javaCollections framework to use stack there is  a inbuilt stack datatype 
        
        
    }
    
}
