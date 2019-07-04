package com.may201907;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		ArrayList<Person> arrayList = new ArrayList<Person>(5);
		Person person1 = new Person(56, "john", "velachery");
		Person person2 = new Person(24, "paul", "vadapalani");
		Person person3 = new Person(98, "mark", "kk nagar");
		Person person4 = new Person(23, "anand", "palavaram");
		arrayList.add(person1);
		arrayList.add(person2);
		arrayList.add(person3);
		arrayList.add(person4);
		System.out.println("before sorting list");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList+" after sorting list");
	}
}


class Person implements Comparable<Person>{
	
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String name;
	private String address;
	
	public Person(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return (this.getName().compareTo(o.getName()));
	}
	
	
	
}