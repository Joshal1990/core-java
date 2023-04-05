package com.interview.prep.collection;

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

        // set
        final var hashSet = new HashSet<>(List.of(6, 3, 6, 1, 6, 99, 6, 3));
        hashSet.add(3);
        System.out.println(hashSet);

        // Stream example
        final var employee = new LinkedList<Employee>();
        employee.add(new Employee(1, "Johnpaul", "Raphael"));
        employee.add(new Employee(2, "Anand", "Raphael"));
        employee.add(new Employee(3, "HareRam", "Raphael"));
        employee.add(new Employee(4, "Pradeep", "Raphael"));

        //final var collect = employee.stream().sorted().collect(Collectors.toList());
        final var linkedHashSet = new LinkedHashSet<Object>();
        linkedHashSet.add("ONE");
        linkedHashSet.add("TWO");
        linkedHashSet.add("THREE");
        linkedHashSet.add("FOUR");
        linkedHashSet.add("ONE");
        System.out.println(linkedHashSet);

        final var hashSet1 = new TreeSet<Employee>();
        hashSet1.add(new Employee(1, "Johnpaul", "Raphael"));
        hashSet1.add(new Employee(2, "Anand", "Raphael"));
        hashSet1.add(new Employee(3, "HareRam", "Raphael"));
        hashSet1.add(new Employee(4, "Pradeep", "Raphael"));
        System.out.println("hashSet1: " + hashSet1);


    }
}
