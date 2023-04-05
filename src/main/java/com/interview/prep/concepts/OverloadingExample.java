package com.interview.prep.concepts;
//http://www.codejava.net/java-core/the-java-language/12-rules-of-overriding-in-java-you-should-know
public class OverloadingExample {

	public static void main(String[] args) {
		//Employee employee = new Employee();
		//employee.age();
		Employee student = new Student();
		student.age();
		System.out.println(student.a);
	}
}
class Employee{
	int a=10;
	public void age() {
		System.out.println("Employee age is 28!!!!!!!!!!!!!!!!..........");
	}
}
class Student extends Employee{
	int a=13;
	public void age() {
		System.out.println("Student age is 18!...................");
	}
}
