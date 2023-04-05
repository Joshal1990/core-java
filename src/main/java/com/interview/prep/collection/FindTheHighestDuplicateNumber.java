package com.interview.prep.collection;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheHighestDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 67, 55, 4, 8, 6, 6, 6, 6, 55, 43};
        final HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.stream(arr).forEach(value -> {
            if (hashMap.containsKey(value))
                hashMap.put(value, hashMap.get(value) + 1);
            else hashMap.put(value, 1);
        });

        final var collect1 = Stream.of(arr).collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(value -> 1)));
        // .entrySet().stream().min(Map.Entry.comparingByValue()).orElse(null);
        System.out.println(collect1);

        hashMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(val -> System.out.println(val.getKey() + " " + val.getValue()));
        final var collect = hashMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer2, LinkedHashMap::new));
        System.out.println(collect);
        System.out.println("Highest Duplicate number is: " + collect.entrySet().stream().findFirst().map(Map.Entry::getKey).get());

    }
}
