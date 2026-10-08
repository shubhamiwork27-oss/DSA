package LinkedLists;
public class DblyLl {
//=======================================
//Boilerplate Node
public static class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
//=======================================
//Variables
public static Node head;
public static Node tail;
public static int size;

//=======================================
//Left node Insertion
public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;
}

//=======================================
//Right node Insertion
public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
        return;
    }

    tail.next = newNode;
    tail.prev = null;
    tail = newNode;
}
//=======================================
//Printing LinkedList
public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + " <--> ");
        temp = temp.next;
    }
    System.out.println("Null");
}
//=======================================
//Removing the First Node
public int removeFirst(){
    if(head == null){
        System.out.println("DLL is EMPTY");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;

    }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    
}
//=======================================
//Removing the Last Node
public int removeLast(){
    if(head == null){
        System.out.println("DLL is EMPTY");
        return Integer.MIN_VALUE;
    }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;

    }
 
    
}
//=======================================
//MAIN function
    public static void main(String[] args) {
        DblyLl dbll = new DblyLl();
        System.out.println("First add : ");
        dbll.addFirst(1);
        dbll.addFirst(2);
        dbll.addFirst(3);
        dbll.print();
        System.out.println("Last add : ");
        dbll.addLast(4);
        dbll.addLast(5);
        dbll.addLast(6);
        dbll.print();
        dbll.print();
        System.out.println(dbll.size);
    }
}
