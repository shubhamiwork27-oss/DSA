package JCF;
import java.util.LinkedList;

import LinkedLists.LinkedLists;

public class LLjcf {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        ll.removeFirst();
        ll.removeFirst();

        System.out.println(ll);

    }
}
