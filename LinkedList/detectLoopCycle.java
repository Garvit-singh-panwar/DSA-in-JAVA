package LinkedList;

// Detect cycle in the linked list

public class detectLoopCycle {

    

    public static void main(String[] args){

        Linkedlist ll = new Linkedlist();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        

        if(ll.detectCycle()){
            System.out.println("there is a cycle in this linkedlist");
        }
        else{
            System.out.println("there is no cycle in this linkedlist");
        }

    }

    
}
class Linkedlist{

        protected class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }


        }

        public  Node head = null;
        public Node tail = null;
        public int size = 0;

        void addFirst(int data){
            if( head == null){
                head = tail = new Node(data);
                size++;
                return;
            }
            else{

                Node newnode = new Node(data);
                newnode.next = head;
                head = newnode;
                size++;
            }
        }
        void addLast(int data){
            if( head == null){
                head = tail = new Node(data);
                size++;
                return;
            }
            else{

                tail.next = new Node(data);
                tail = tail.next;
                size++;
            }
        }


        public boolean detectCycle(){
            Node fast = head;
            Node slow = head;

            while(fast != null && fast.next != null ){

                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow || fast.next == slow){
                    return true;
                }

            }

            return false;
        }

    }