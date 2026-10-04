package ArrayLists;
import java.util.ArrayList;

public class ALone {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String>  list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,8); //dynamic data adding --O(n)

        System.out.println(list);

        // System.out.println(list);


        // //get opertaion -- O(1)
        // int elem = list.get(2);
        // System.out.println(elem);

        // //remove an element -- O(n)
        // list.remove(2);
        // System.out.println(list);

        // //set an element --O(n)
        // list.set(2,10);
        // System.out.println(list);

        //contains an element --O(n)
        // System.out.println(list.contains(7));
        // System.out.println(list.contains(19));

    } 
}
