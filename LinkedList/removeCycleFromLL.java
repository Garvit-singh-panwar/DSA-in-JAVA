package LinkedList;

public class removeCycleFromLL {


    public static void main(String[] args){
        
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.tail.next = ll.head.next.next;
        System.out.println("calling detectcycle function before remove cycle function ");

         if(ll.detectCycle()){
            System.out.println("there is a cycle in this linkedlist");
        }
        else{
            System.out.println("there is no cycle in this linkedlist");
        }

        System.out.println("\n"+"Calling detect cycle after calling removecycle function \n");
        ll.removeCycleFromLL();

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


        // function to remove cycle from linked list 
        public void removeCycleFromLL(){

            // we made two pointer fast and slow which points to head 
            Node fast = head;
            Node slow = head;

            // we make a boolean cycle which checks cycle exist or not
            boolean cycle = false ; 

            // we make a while loop terminate when fast or fast.next == null 
            // because if loop not exist this is our terminating condition
            while(fast.next != null || fast != null ){

                // ever time fast pointer increment by 2 steps 
                // and slow pointer increment by 1
                fast = fast.next.next;
                slow = slow.next;

                // if they meet means cycle is present 
                // and we break the loop because we find the cycle
                if(fast == slow){
                    cycle = true;
                    break;
                }

            }

            // we are checking if it is terminated by loop condition or cycle condition
            //if it is terminated by cycle condition the cycle must be true 
            // if not we dont have to do any thing we return 
            if( !cycle){
                System.out.println("there is no cycle in thid LL ");
                return;
            }

            // if cycle is present 
            // we make slow pointer points to head
            // also make a previous pointer pointes to null 

            slow = head;
            Node prev = null;

            // then we increment fast and slow by 1 step  until fast equals to slow
            // and before increment fast we store fast address in prev 
            // so we keep track of the previous place from where the cycle form
            while(fast != slow){
                prev = fast;
                fast = fast.next;
                slow = slow.next;
            }

            // then we make prev.next points to null to stop the cycle formation
            prev.next = null;
            return;

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