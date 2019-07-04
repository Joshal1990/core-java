package com.may201907;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Java8ForEachExample {

	public static void main(String[] args) {
		// created an collection list to iterate
		List<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < 5; i++) arrayList.add(i);
		
		// traversing an list using an iterator Interface
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println("iterator value: " + next);
		}
		
		// foreach array using java 8 with open and close brace
		arrayList.forEach(name -> {
			System.out.println("java 8 with foreach "+name);
			});
		// forEach with our brace
		arrayList.forEach(name -> System.out.println("java 8 without foreach "+name));
		
		// method reference in java 8
		arrayList.forEach(System.out::println);
		
		//Iterating over a Map – using Map’s forEach
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "John");
		hashMap.put(2, "paul");
		hashMap.put(3, "Joe");
		hashMap.put(4, "Window");
		String string = hashMap.get(hashMap.keySet().toArray()[0]);
		System.out.println("------------iterate over map using foreach java 8----------");
		hashMap.forEach((key,val) -> System.out.println(key +" "+ val));
		System.out.println("------------iterate over map using entryset java 8----------");
		hashMap.entrySet().forEach(val -> System.out.println(val.getKey()+" "+val.getValue()));
		
		System.out.println("sorting an element using an array-----");
		Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 }; 
		
		Arrays.sort(arr);
		System.out.println("arrays.sort--> "+Arrays.toString(arr));
		
		System.out.println("arrays sort decending order-----");
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("sorting collections object using collections.sort() method....."+Arrays.deepToString(arr));
		
		Integer[] arr1 = { 13, 7, 6, 45, 21, 9, 2, 100 };
		List<Integer> asList = Arrays.asList(arr1);
		System.out.println("before collection.sort()--> "+asList);
		Collections.sort(asList);
		System.out.println("collection.sort()--> "+asList);
		Collections.sort(asList,Collections.reverseOrder());
		System.out.println("collection.sort() reverse order--> "+asList);
		//Arrays.binarySearch(arr1, key);
		int binarySearch = Collections.binarySearch(asList, 13);
		System.out.println(binarySearch);
		
	}
}
