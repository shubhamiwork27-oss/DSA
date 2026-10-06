package LinkedLists;

public class LinkedLists {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    //Left head Insertion
    public void addFirst(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: newNode.next = head (link)
        newNode.next = head;

        // step 3: head = newNode
        head = newNode;
    }

    //Right tail Insertion
        public void addLast(int data) {
        // step 1: create a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2: tail.next = newNode (link)
        tail.next = newNode;

        // step 3: head = newNode
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedLists l1 = new LinkedLists();
        
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);        
        l1.addLast(2);
        l1.addLast(1);
        l1.addLast(8);

        System.out.println();
        System.out.println("L I N K E D L I S T S");
        System.out.println();
        l1.print(); // 1 -> 2 -> null
    }
}