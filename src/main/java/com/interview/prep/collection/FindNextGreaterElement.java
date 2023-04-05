package com.interview.prep.collection;

import java.util.List;

public class FindNextGreaterElement {
    public static void main(String[] args) {
        final var list = List.of(55,10, 11, 5,1, 4, 7);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            int greaterValue = -1;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    greaterValue = list.get(j);
                }
            }
            System.out.println(greaterValue);
        }
    }
}
