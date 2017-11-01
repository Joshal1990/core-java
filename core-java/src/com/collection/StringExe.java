package com.collection;

import java.util.ArrayList;

public class StringExe {

		public static void secondMethod(ArrayList list) {
			// TODO Auto-generated method stub
			list.add("4");
			list.add("5");

		}
		public static void main(String[] args) {
			ArrayList list = new ArrayList();
			list.add("1");
			list.add("2");
			list.add("3");
			System.out.println(" list of values are fgd " +list);

			secondMethod(list);
			System.out.println("added element to specified index: "+ list);
	 	}
	}
