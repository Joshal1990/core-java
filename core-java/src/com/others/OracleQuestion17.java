package com.others;

//http://www.codejava.net/java-core/the-java-language/12-rules-of-overriding-in-java-you-should-know
class A {
	int a = 5;

	String doA() {return "a1";}

	protected static String doA2() {return "a2";}
}

class B extends A {
	int a = 7;

	String doA() {return "b1";}
	
	public static String doA2() {return "b2";}
	void go(){
		A b = new B();
		System.out.println(b.doA()+" "+b.doA2()+" "+b.a);
	}

}

public class OracleQuestion17 {

	public static void main(String[] args) {
		new B().go();

	}
}
