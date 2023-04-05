package com.interview.prep.collection;

public class FindAllSubString {
    public static void main(String[] args) {
        String val = "abc";

        for (int i = 0; i <= val.length(); i++) {
            String sub = "";
            for (int j = i; j < val.length(); j++) {
                sub += val.charAt(j);
                System.out.println(sub);
            }
        }
    }
}
