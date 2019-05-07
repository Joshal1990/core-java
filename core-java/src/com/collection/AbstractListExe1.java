package com.collection;

import java.util.ArrayList;
import java.util.List;

public class AbstractListExe1 {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		myList.add("Java");
		myList.add("Unix");
		myList.add("Oracle");
		myList.add("C++");
		myList.add("Perl");
		
		ArrayList list = new ArrayList(myList);
		for (Object object : list) {
			System.out.println(object);
		}
		ArrayList list2 = new ArrayList(5);
	}
}
