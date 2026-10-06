package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ALsort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(4);

        // Collections.sort(list);
        Collections.sort(list , Collections.reverseOrder());

        System.out.println(list);
    }
}
