package com.oops.concepts;

public class StaticClassExe {

	static int i = 10;
	
	static {
		i = i+10;
		System.out.println("i in static block " +i);
		staticMethod();
	}
	
	static void staticMethod(){
		i = i+10;
		System.out.println("i in static method " +i);
	}
	
	public StaticClassExe() {
		// TODO Auto-generated constructor stub
		i = i+10;
		System.out.println("i in constructor " + i);
	}
	
	public static void main(String[] args) {
		StaticClassExe staticClassExe = new StaticClassExe();
	}
}
