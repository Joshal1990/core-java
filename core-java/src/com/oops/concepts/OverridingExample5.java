package com.oops.concepts;

public class OverridingExample5{
	static int a;
	{
		System.out.println("IIB");
		a =5;
	}
	static{
		System.out.println("static");
		a =55;
	}
	
	
	public OverridingExample5(int j) {
		a = j;
		// TODO Auto-generated constructor stub
	}
	
	static void method()
	{
		System.out.println("method1 ");
	}
	
	public static void main(String[] args) {
		//A aaa = new A(23);
		//System.out.println(aaa.a);
		//A.method();
	}
}


class A {

	
	
}
