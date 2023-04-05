package com.interview.prep.collection;

import org.apache.commons.lang3.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNoWordVowelFrequency {
    public static void main(String[] args) {
        String str = "Welcome To Java Program Coding Practice";
        if (StringUtils.isNotBlank(str)) {
            System.out.println("No of words in given string is: " + str.split(" ").length);
            final var characterList = str.chars().filter(Character::isLetter).mapToObj(value -> (char) value).collect(Collectors.toList());
            final var hashMap = new HashMap<Character, Integer>();
            characterList.forEach(val -> {
                if (hashMap.containsKey(val))
                    hashMap.put(val, hashMap.get(val) + 1);
                else hashMap.put(val, 1);
            });
            final var linkedHashMap = hashMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                    collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer2, LinkedHashMap::new));
            System.out.println("Given String frequency: " + linkedHashMap);
            System.out.println("Vowels count: " + characterList.stream().filter(val -> "aeiou".chars().anyMatch(vowl -> vowl == val)).count());
            System.out.println("upper cause count: " + characterList.stream().filter(Character::isUpperCase).count());
        }
    }
}
