package LinkedList;

// Linked List is a user-defined linear data structure.
// It stores data in a linear sequence, but unlike arrays,
// the elements are not stored in contiguous memory locations.

// In a linked list, each element is called a "node".
// Each node contains two parts:
// 1. The "data" or value to store.
// 2. A "next" reference (or pointer) that points to the next node.

// The nodes are connected (linked) using the next pointer.
// The last node’s next pointer is set to null,
// which indicates the end of the linked list.

public class notes {

    public static class LinkedList{

        public static class Node{
            int data; // here we store data 
            Node next; // here we store reference of the next node

            public Node(int data){ 
                // its a constructor which takes value to store data 
                // and make the reference null
                this.data = data;
                this.next = null;
            }

        

        }

        public static Node head ;  // reference used to access the first node using this we can access all nodes
        public static Node tail ; // reference used to access last node 
        public static int size ;  // it gives the length of linkedlist

        public static void addFirst(int data){ // function to add element in the head
           
            // if head == null make a new node and both head and tail reference to this new node increase size and return
            if(head == null){
                head = new Node(data);
                tail = head;
                size++;
                return;
                
            } // if not means there is a element
            // make a new node and its next pointer point towards head
            // then make head reference to this new node
            // increment size to keep track of elements
            else{
                Node newnode = new Node(data);
                newnode.next = head;
                head = newnode;
                size++;
            }
        }


        public static void addLast(int data){
            // if head == null means there is no element 
            // make head as newnode n  and tail also point to head
            //increment size 
            if(head == null){
                head = new Node(data);
                tail = head;
                size++;
                return;
            }
            // if not assign new node to tail.next
            // and then make tail point to the new node 
            // also increment the size  
            else{
                tail.next = new Node(data);
                tail = tail.next;
                size++;
            }
            

        }


        // here we print the node data until temp == null
        // when temp become null we are at the last element
        public static void print(){
            Node temp = head;

            while(temp != null ){
                System.out.println(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("->null");
        }

        // here we aadd element at the given indx
        public static void add(int indx , int data){
            // if indx == 0 means we have to add element in the head so we sirectly call that function and return 
            if(indx == 0){
                addFirst(data);
                return;
            }
            // bu if indx is bigger and equal to size-1 we add the element in the end
            // so we directly call the function for it
            else if(indx >= size-1){
                addLast(data);
                return;
            }

            // the we made a count we can also use the for loop for that 
            // and also make a Node temp which points towards head 
            // then we increment count and make temp = temp.next until count equals to indx-1  1 position before indx
            int count = 0;
            Node temp = head;
            while(count < indx-1 && temp.next != null){
                temp = temp.next;
                count++;
            }


            // after reaching the position indx-1
            // we make a new node and store the data which we want to store in it
            Node newnode = new Node(data);

            // then we point nownode.next == temp.next
            // and temp.next = newnode 
            // and also increment the size 
            newnode.next= temp.next;
            temp.next = newnode;
            size++;

        }

        // in this we have to remove node from the head and re assign head to the next node 

        public static int removeFirst(){
            if(size == 0){
                System.out.println("Linked list is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1){
                int data = head.data;
                head = tail = null;
                size= 0;
                return data;
            }
            int data = head.data;
            head = head.next;
            size--;
            return data;
        }


        // in this function we we have to remove ht elast node and reassign tail its previous element
        public static int removeLast(){
            if(size == 0){
                System.out.println("linked list is empty ");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int data = head.data;
                head = tail = null;
                size= 0;
                return data;
                
            }

            int data = tail.data;
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
            return data;
        }


        public static int itrSearch(int key){

            if(size == 0){
                System.out.println("Linked list is empty");
                return -1;
            }

            Node temp = head;
            int indx = 0;
            while(temp != null){
                if(temp.data == key){
                    return indx;
                }
                temp = temp.next;
                indx++;
            }

            return -1;

        }

        public static int recSearch(int key){

            return recSearch_helper(head,key,0);
        }

        private static int recSearch_helper(Node head , int key , int count ){ 
            if(head == null){
                return -1;
            }
            if(head.data == key){
                return count;
            }

            return recSearch_helper(head.next , key , count+1);
        }


        public static void itrReverse(){
            
           if(head == null){
            System.out.println("linked list is empty");
            return;

           }
           else if(size == 1){
            return;
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

          head = prev;
        }

        public static void recReverse(){
            recReverse_helper(head);
        }

        private static void recReverse_helper(Node temp){
            if(temp.next == null){
                head = temp;
                return;
            }
            
            recReverse_helper(temp.next);
            temp.next.next = temp;
            temp.next = null;
        }

        public static void removeNthNodeFromTheEnd(int n){
            if(n == 0 || head == null){
                return;
            }
            if(n == 1){
                removeLast();
                return;
            }
            int sz = 0;
            Node temp = head;
            while(temp != null){
                temp = temp.next;
                sz++;
            }

            int indx = sz - n;

            if(indx == 0){

                removeFirst();
                return;
            }

            temp = head;
            for(int i = 0 ; i < indx-1 ; i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
            size--;

        }

        public static boolean palindrome(){

            if(head == null && head.next == null){
                return true;
            }

            Node slow = head;
            Node fast = head;

            while(fast != null || fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            Node prev = null;
            Node curr = slow;
            Node next = null;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev =  curr;
                curr = next;
            }

            Node right = prev;
            Node left = head;

            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                right = right.next;
                left = left.next;
            }

            return true;

        } 

        
    }

    public static void main(String[] args){
        
        LinkedList newList = new LinkedList();

        newList.addFirst(1);
        newList.addFirst(0);
        newList.addLast(2);
        newList.addLast(3);

        


    }
    
}

