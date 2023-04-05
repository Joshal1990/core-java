package com.interview.prep.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] a = {1, 8, 5, 7, 6};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.print("missing numbers are: ");
        for (int i = 0; i < 10; i++) {
            if (!list.contains(i))
                System.out.print(i + ",");
        }
    }
}
