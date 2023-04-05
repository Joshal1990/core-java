package com.interview.prep.collection;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(8);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
	}
}
