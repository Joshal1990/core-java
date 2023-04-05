package com.interview.prep.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListValuesToAnArray {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.remove(0);
		System.out.println(list);
		Object[] array = list.toArray();
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
	}
}
