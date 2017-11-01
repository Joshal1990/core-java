package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateString {

public static void main(String[] args) {
	
	//private static void occuranceValue(String str) {
		String str = "a a aa a a a a a a a a aaaa aaaa aaa aaaaaa";
	
		List list = Arrays.asList(str.split(" "));
		
		System.out.println(list.toString());
		
		
	
		Set<String> set = new HashSet<String>(list);
		for(String word: set){
			System.out.println(word+" ::" + Collections.frequency(list, word));
		}
		
		
		
		
		
		
		
		
		/*String[] splitString = str.split(" ");
		Map<String, Integer> mapValue = new HashMap<String, Integer>();
		for (String ch : splitString) {
				if(mapValue.containsKey(ch)){
					mapValue.put(ch, mapValue.get(ch)+1);
				}else{
					mapValue.put(ch, 1);
				}
		}
		System.out.println("mapValue=="+mapValue);*/
	}

	/*public static void main(String[] args) {
		occuranceValue("defg defg zklm cba scb");
	}*/
}
