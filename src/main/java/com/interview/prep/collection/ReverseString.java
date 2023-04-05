package com.interview.prep.collection;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Welcome to string reverse program";
        if (StringUtils.isNotBlank(str))
            System.out.println(Arrays.stream(str.split(" ")).map(StringBuilder::new).map(StringBuilder::reverse).collect(Collectors.joining(" ")));
    }
}
