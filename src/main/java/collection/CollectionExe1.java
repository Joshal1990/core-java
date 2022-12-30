package collection;

import java.util.*;

public class CollectionExe1 {
    public static void main(String[] args) {
        // List
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        Collection<Integer> integers = Collections.unmodifiableCollection(list);
        // list.sort();
        // integers.add(10);

        System.out.println("before sort: " + list);
        Collections.sort(list);
        System.out.println("After soft: " + list);
        LinkedList<Object> linkedList = new LinkedList<>(list);
        System.out.println("Linked list: " + linkedList);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        linkedList.descendingIterator().forEachRemaining(System.out::println);
        linkedList.get(2);
    }
}
