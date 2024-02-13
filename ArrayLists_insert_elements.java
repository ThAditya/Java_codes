import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists_insert_elements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        list.add(3, 4);
        System.out.println(list);

        // set element
        list.set(0, 0);
        System.out.println(list);

        // delete element
        list.remove(4);
        System.out.println(list);
    }
}