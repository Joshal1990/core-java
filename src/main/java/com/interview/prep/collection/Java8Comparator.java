package com.interview.prep.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Comparator {
    public static void main(String[] args) {
        final var list = List.of(8, 4, 4, 5, 71, 2, 6, 3);
        final var strings = List.of("john", "paul", "chennai", "royapyram");
        strings.sort(String::compareTo);
        list.sort(Comparator.comparingInt(o -> o));
        final var stream = Stream.of(7, 3, 2, 7, 8, 3, 1, 6);
        final var stringList = Stream.of("GeeksforGeeks", "GFG", "Geeks", "for", "GeeksQuiz").sorted(Comparator.comparingInt(o -> o.charAt(o.length() - 1))).collect(Collectors.toList());
        System.out.println(stringList);
        final var collect = stream.max(Comparator.naturalOrder());
        System.out.println(collect.get());


    }
}
