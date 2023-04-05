package com.interview.prep.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberJava8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(6, 2, 1, 6, 7, 4, 55, 21, 78, 59);
        int second = list.stream().sorted(Comparator.reverseOrder()).limit(2).collect(Collectors.toList()).get(1);
        System.out.println(second);
    }
}
