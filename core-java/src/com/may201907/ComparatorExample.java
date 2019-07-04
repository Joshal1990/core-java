package com.may201907;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

public static void main(String[] args) {
	ArrayList<PersonCompartorExe> arrayList = new ArrayList<PersonCompartorExe>(5);
	PersonCompartorExe person1 = new PersonCompartorExe(56, "john", "velachery");
	PersonCompartorExe person2 = new PersonCompartorExe(24, "paul", "vadapalani");
	PersonCompartorExe person3 = new PersonCompartorExe(98, "mark", "kk nagar");
	PersonCompartorExe person4 = new PersonCompartorExe(23, "anand", "palavaram");
	arrayList.add(person1);
	arrayList.add(person2);
	arrayList.add(person3);
	arrayList.add(person4);
	System.out.println("before sorting list");
	System.out.println(arrayList);
	Collections.sort(arrayList,new SortByName());
	System.out.println("after sorting list by name "+ arrayList);
	Collections.sort(arrayList,new SortByID());
	System.out.println("after sorting list by age "+ arrayList);
}
}
class SortByName implements Comparator<PersonCompartorExe>{

	@Override
	public int compare(PersonCompartorExe o1, PersonCompartorExe o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
class SortByID implements Comparator<PersonCompartorExe>{

	@Override
	public int compare(PersonCompartorExe o1, PersonCompartorExe o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}
	
}
class PersonCompartorExe{
	
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
	
	public PersonCompartorExe(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
}