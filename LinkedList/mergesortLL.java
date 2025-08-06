package LinkedList;

public class mergesortLL {

    
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.addFirst(5);
        ll.addLast(1);
        ll.addFirst(2);
        ll.addLast(19);
        ll.addLast(21);

        System.out.println("linked list before sorting :-");
        ll.printLL();

        System.out.println("\nLinked list after sorting");
        ll.mergesortinLL();
        ll.printLL();

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

    // made a mergeSorte function for linked list

    public void mergesortinLL(){
        // which call to a mergeSortHelper function which tales two arguments head and tail 
        // and we make head point to the right node
        head =  mergeSortHelper(head, tail);
        Node temp = head;

        // then we make tail point to the right node
        while(temp.next!=null){
            temp = temp.next;
        }
        tail = temp;
    }

    // we made a merge sort healper function which functions internally 
    // it takes two node head and tail to sort it 
    private Node mergeSortHelper(Node l , Node r){
        // we check if head node or tail node are same we return them 
        if (l == r) {
            l.next = null; 
            return l;
        }

        // then we find the mid 
        // to find mid we use fast and slow pointer approach
        Node fast = l, mid = l;
        // using this we will find mid
        while (fast != r && fast.next != r) {
            fast = fast.next.next;
            mid = mid.next;
        }

        // then we divde the linked list into two part 
        // we store right half in the right start 
        Node rightStart = mid.next;
        // then we make the end node of the left half null 
        mid.next = null;  // Important: break the list

        // then we call merge sort helper to sort left half and store it into left sorted
        Node leftSorted = mergeSortHelper(l, mid);
        // then we call merge sort helper to sort the right half and store it into right sorted
        Node rightSorted = mergeSortHelper(rightStart, r);

        // then we make head and curr = null 
        
        Node head = null;
        Node curr = null;

        // then we make a loop up to leftsorted != null and rightsorted != null
        while (leftSorted != null && rightSorted != null) {
            // then in every iteration we check data in leftsorted is bigger or data in right sorted is bigger 
            if (leftSorted.data < rightSorted.data) {
                
                // if data in left sorted is bigger 
                // then we check it there is nothing in our head means this is our first iteration 
                if (head == null) {

                    // we make head and curr = 1st leftsorted node 
                    head = curr = leftSorted;
                } else {
                    // if not  we put the left sorted in the curr.next pointer and then make curr points to this node
                    curr.next = leftSorted;
                    curr = curr.next;
                }
                // then we increment left sorted to its next
                leftSorted = leftSorted.next;
            } else {

                // if our right sorted is sorted 
                // we check is there thing in the head or not 
                if (head == null) {
                // if there is nothing means this is our first iteration we make head or curr points towards 1stnode of right sorted
                    head = curr = rightSorted;
                } else {
                    // if not  we put the right sorted in the curr.next pointer and then make curr points to this node
    
                    curr.next = rightSorted;
                    curr = curr.next;
                }
                // then we increment right sorted 
                rightSorted = rightSorted.next;
            }
        }

        // if any one is not full empth we store it in right sorted 
        if(leftSorted != null) {
            curr.next = leftSorted;
        }else if(rightSorted != null) {
            curr.next = rightSorted;
           
        }

       
        return head;
    }




}