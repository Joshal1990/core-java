package com.interview.prep.collection;

import java.util.*;

public class PrepareCollectionInterface {
    public static void main(String[] args) {
        final var integers1 = List.of(45, 6, 8, 8, 2, 5, 7, 8, 1);
        integers1.stream().skip(0).forEach(System.out::println);
        System.out.println("---------------------");
        integers1.stream().limit(6).forEach(System.out::println);
        System.out.println("---------------------");
        integers1.stream().limit(18).forEach(System.out::println);
        System.out.println("---------------------");

        final var arrayList = new ArrayList<>();
        final var integerList = List.of(1, 2, 3, 4, 5, 6);
        final var list1 = new ArrayList<>(List.of(9, 21, 1, 2, 7, 3, 44, 11, 4, 5, 6));

        final var list2 = List.of(1, 2, 3, 4, 5, 7);
        System.out.println(list1.equals(list2));
        String str = "sample method for com.interview.prep.collection";
        System.out.println("Content equals: " + str.contentEquals(str));

        System.out.println("list1.contains(list2): " + list1.contains(list1));

        integerList.forEach(System.out::println);
        System.out.println("-----------------------");
        final var linkedList = new LinkedList<>(integerList);
        linkedList.forEach(System.out::println);
        final var integers = new ArrayList<>(linkedList);
        System.out.println(integerList.contains(2));
        integers.set(2, 5);
        integers.sort(Integer::compareTo);
        final var spliterator = integers.spliterator();
        final var arrayList1 = new ArrayList<>(10);
        integers.equals(linkedList);
        System.out.println(arrayList1.size());
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Collections.reverseOrder():" + list1);
        Collections.sort(list1);
        System.out.println("Collections.sort():" + list1);
        Collections.reverse(list1);
        System.out.println("Collections.reverse(l1):" + list1);
        final var array = list1.toArray();
        System.out.println("array: ");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("Arrays.asList: " + Arrays.asList(array));
        final var integerList1 = Collections.synchronizedList(list1);
    }

}
