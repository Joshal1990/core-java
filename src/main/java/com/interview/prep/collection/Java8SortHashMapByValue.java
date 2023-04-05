package com.interview.prep.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8SortHashMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("SIX", 6);
        hashMap.put("ONE", 1);
        hashMap.put("NINE", 9);
        hashMap.put("TWO", 2);
        System.out.println("Before map sort: " + hashMap);
        final var sorted = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue());
        sorted.forEach(val -> System.out.println(val.getKey() + " " + val.getValue()));
        Map<String, Integer> sortMap = hashMap.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
        System.out.println("Sort hashmap: " + sortMap);
    }
}
