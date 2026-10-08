    package LinkedLists;

    public class LinkedLists {
//=======================================BOILERPLATE
public static class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
//=======================================
//Variables
public static Node head;
public static Node tail;
public static int size;
//=======================================
//Left head Insertion
        public void addFirst(int data) {
            // step 1: create a new node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step 2: newNode.next = head (link)
            newNode.next = head;

            // step 3: head = newNode
            head = newNode;
        }
//=======================================
        //Right tail Insertion
            public void addLast(int data) {
            // step 1: create a new node
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // step 2: tail.next = newNode (link)
            tail.next = newNode;

            // step 3: head = newNode
            tail = newNode;
        }
//=======================================
        //Insertion in the middle of LinkedList
        public void add(int idx , int data){
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            //BASE CASE
            if(idx ==0){
                addFirst(data);
                return;
            }
            size++;
            while(i < idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
 //Remove first Node
//=======================================
        public int removeFirst(){
            if(size == 0){
                System.out.print("LL IS EMPTY!");
                return Integer.MIN_VALUE;
            } else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
 //Remove last Node
//=======================================
     public int removeLast() { 
         if (size == 0) { 
             System.out.println("LL IS EMPTY!"); 
                 return Integer.MIN_VALUE; 
         }else if (size == 1) { 
             int val = head.data; 
             head = tail = null;
             size = 0;
             return val;
         }
         Node prev = head;
         for (int i = 0; i < size-2; i++) {
             prev = prev.next;
         }
          int val = prev.next.data;
          prev.next = null;
          tail = prev;
          size--;
          return val;
     }
//=======================================
//Print the LinkedList
//=======================================
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
//=======================================
//ITERATIVE SEARCH
public static int itrSearch(int key){
    Node temp = head;
    int i =0 ;
    while(temp!=null){
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
}

        public static void main(String[] args) {
            LinkedLists l1 = new LinkedLists();
            l1.print();
            l1.addFirst(4);
            l1.print();
            l1.addFirst(2);
            l1.print();
            l1.addFirst(1);  
            l1.print();
            l1.add(2,3);
            l1.print();
            l1.removeFirst();
            l1.removeLast();
            System.out.println("SIZE OF LINKEDLIST: "+l1.size);
            // l1.addLast(2);
            // l1.addLast(1);
            // l1.addLast(8);
            System.out.println(itrSearch(3));
            System.out.println();
        }
    }