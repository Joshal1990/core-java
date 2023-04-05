package com.interview.prep.collection;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SquarePositiveNegativeArrayOfNumber {
    public static void main(String[] args) {
        final var list = List.of(-1, 4, 9, -5, 3, 1, 6);
        final var collect = list.stream().map(val -> val * val).collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);
    }
}
