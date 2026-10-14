public class LinkedList{
    public static class Node{
        int data;
        Node node;
        Node(int data){
            this.data=data;
            this.node=null;
        }
    }
    public static Node head;
    public static Node tail;

    // public void addfirst(int data){
    //     Node newnode=new Node(data);
    //     if(head==null){
    //         head=tail=newnode;
    //         return;
    //     }
    //     newnode.node=head;
    //     head=newnode;

    // }

        public void addlast(int data){
        Node newnode=new Node(data);
        if(tail==null){
            head=tail=newnode;
            return;
        }
        tail.node = newnode;
        tail =newnode;
    }

     public void printList() {
        Node current = head; // Start at the head of the list
        
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.node; // Move pointer to the next node
        }
        System.out.println("null");
    }
    
    public static void main(String[] args){
       LinkedList li=new LinkedList();

       li.addlast(12);
       li.addlast(34);
       li.addlast(54);
       li.printList();
    }
}