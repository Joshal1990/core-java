package com.may201907;

/*
Both must have the same method name.
Both must have different argument lists.
Have different return types.
Have different access modifiers.
Throw different checked or unchecked exceptions.
*/
public class OverloadingExample {
	private static void getValue(){
		System.out.println("no arg method");
	}
	
	public static String getValue(int val){
		return "one arg method";
	}
	
	protected void getValue(int val,String valStr){
		System.out.println("two arg method");
	}
	
	public static void main(String[] args) {
		new OverloadingExample().getValue();
		String value = new OverloadingExample().getValue(10);
		System.out.println(value);
		new OverloadingExample().getValue(20,"str");
	}
}
