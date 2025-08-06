package LinkedList;

public class zig_zagLL {

    public static void main(String[] args){

        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        LinkedList ll2 = new LinkedList();

        ll2.addFirst(6);
        ll2.addLast(7);
        ll2.addLast(8);
        ll2.addLast(9);
        ll2.addLast(10);

        //here we are using my approach

        System.out.println("linked list before making the zidzag pattern in linkedlist :-");
        ll.printLL();
        ll.makeLL_zig_Zag();

        System.out.println("there is our linkedlist after calling zigzag function");
        ll.printLL();
        
        // here we are using the optmized approach
        System.out.println("Now we are using the second method");
        System.out.println("linked list before making the zidzag pattern in linkedlist :-");
        ll2.printLL();

        ll2.makeLLZig_Zag_2_optmized();
         System.out.println("there is our linkedlist after calling zigzag function");
         ll2.printLL();

    }
    
}
class LinkedList{

    class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0 ;

    public void addFirst(int data){
        if(size == 0){
            head = tail = new Node(data);
            size++;
            return;
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void addLast(int data){
        if(size == 0){
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

    public void printLL(){
        if(size == 0){
            System.out.println("no elements present ");
            return ;
        }

        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("-> null");
    }


    public void removeFirst(){
        if(size==0){
            System.out.println("there is no element present in the linked list ");
            return;
        }else if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        else{
            head = head.next;
            size--;
            return;
        }
    }

    public void removeLast(){
        if(size==0){
            System.out.println("there is no element present in the linked list ");
            return;
        }else if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;

            }
            temp.next = null;
            tail = temp;
            size--;
            return;
        }
    }

    public void makeLL_zig_Zag(){
        head = makeLL_zig_Zag_helper(head);
        
    }

    // in this  i am making the link list in zigzag pattern 
    // i am using recursion to do this 
    // what i am doing 
    // i am taking the first node and add last node in its next 
    // and also keep track of the head prev next and the element bofore last 
    // then i call this finction again for new head which is previous head next and now new tail is our node before tail 
    // i keep doing it until we have only one node left 
    private Node makeLL_zig_Zag_helper(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Node prev = head.next;
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        head.next = tail;
        tail = temp;
        tail.next =null;
        temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        Node New = makeLL_zig_Zag_helper(prev);
        if(New != temp){
            temp.next =New;
        }
        return head;


    } 


    // this is the optmized appraoch to make zigzag pattern in linkedlist

    // here what i am doing 
    // first i find the mid element of the linkedlist then i am reversing the linkedlist after mid
    // then making both the linked list sapereate 

    // Merge the two halves in a zig-zag manner:
    //    - First node from the first half
    //    - Then one node from the reversed second half
    //    - Repeat alternately
    public void makeLLZig_Zag_2_optmized(){
        if(head == null) return;

        Node mid = findMid(head);

        Node Rightpart = mid.next;
        mid.next = null;
        
        Node reverse = reverse(Rightpart);
        
        head = mergeForZigZag(head , reverse);

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;

        }

        tail = temp;

    }
    

    public Node findMid(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node slow  = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;


    }

    public  Node reverse(Node head){
        if(head == null){
            return head;
        }
        
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;

    }

    public Node mergeForZigZag(Node node1 , Node node2){

        Node head = new Node(-1);
        Node curr = head;
        boolean place = true;


        while(node1 != null || node2 != null){
            if(place){
                curr.next = node1;
                node1 = node1.next;
            }
            else{
                curr.next = node2;
                node2 = node2.next;
            }

            place = !place;
            curr = curr.next;
        }

        while(node1 != null){
            curr.next = node1;
            place = false;
            curr = curr.next;
            node1 = node1.next;
        }

        while(node2 != null){
            curr.next = node2;
            place = true;
            curr = curr.next;
            node2 = node2.next;
        }


        curr.next = null;
        return head.next;


    }


}