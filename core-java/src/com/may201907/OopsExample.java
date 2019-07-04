package com.may201907;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

abstract class AddressExe {
	static int val = 10;

	static void getVal() {
		System.out.println("method inside abstract class in invoked!!!");
	}

	public AddressExe(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		this(a, b);
		System.out.println("inside 3 param constructor");

	}

	public AddressExe(int a, int b) {
		// TODO Auto-generated constructor stub
		this(a);
		System.out.println("inside 2 param constructor");
	}

	public AddressExe(int a) {
		System.out.println(a);
		System.out.println("inside 1 constrctor");
		// TODO Auto-generated constructor stub
	}
}

public class OopsExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "one");
		hashMap.put(2, "two");
		hashMap.put(3, "three");
		Iterator<Integer> it = hashMap.keySet().iterator();
		while (it.hasNext()) {
			Integer type = (Integer) it.next();
			System.out.println(type);
			if(type == 1)
				hashMap.remove(type);
			
		}
		System.out.println(hashMap);
	}
}
