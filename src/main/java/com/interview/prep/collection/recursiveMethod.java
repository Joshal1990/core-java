package com.interview.prep.collection;

public class recursiveMethod {
	
	static String recursiveMethod(String str){
	     if ((null == str) || (str.length() <= 1))
	     {
	            return str;
	     }
	 
	     return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		String string = recursiveMethod("john");
		System.out.println(string);
	}
}
