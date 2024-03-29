package com.interview.prep.others;

class Person {
	Person(String s, int i) {
		++pid;
		name = s;
		age = i;
	}

	static int pid;
	int age;
	String name;
}

class OracleQuestion11 {
	public static void main(String args[]) {
		Person p1 = new Person("John", 22);
		OracleQuestion11 te = new OracleQuestion11();
		Person p2 = te.change(p1);
		System.out.println(p2.pid + " " + p2.name + " " + p2.age);
		System.out.print(p1.pid + " " + p1.name + " " + p1.age);
	}

	private Person change(Object o) {
		Person p2 = (Person) o;
		p2.age = 25;
		return p2;
	}
}
