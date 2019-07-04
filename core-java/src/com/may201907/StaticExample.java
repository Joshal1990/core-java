package com.may201907;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StaticExample {

	static int i;
	static {
		System.out.println("inside static method two!!! " + i);
	}

	public static void main(String[] args) {
		i = 10;
		System.out.println("main method!!!! " + i);
		ParentStaticClass childStaticClass = new ParentStaticClass();
		childStaticClass.getValue();
	}

	static {
		System.out.println("inside static method!!!");
	}
	static {
		System.out.println("inside static method one!!!");
	}
}


class ParentStaticClass{
	static {
		System.out.println("parent static block executed!!!!");
	}
	public ParentStaticClass() {
		// TODO Auto-generated constructor stub
		System.out.println("parent constructor executed!!!!");
	}
	
	public void getValue() throws Exception{
		try {
			Class.forName("Employee");
			File file = new File("/john");
			BufferedReader bufferedReader = new BufferedReader(new FileReader("/john"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inside parent get value method!!!");
	}
	
}

class ChildStaticClass extends ParentStaticClass{
	static {
		System.out.println("child static block executed!!!");
	}
	
	public ChildStaticClass() {
		// TODO Auto-generated constructor stub
		System.out.println("child static class constructor executed!!!!");
	}
	@Override
	public void getValue() throws IndexOutOfBoundsException{
		System.out.println("inside child class get vlaue method");
	}
}