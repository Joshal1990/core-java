package com.may201907;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingExamples {

	public static void main(String[] args) throws Exception {
		ParentClass exe = new ChildClassExe();
		String val;
		try {
			val = exe.getParentVal();
			System.out.println("inside main method "+val);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(val);
	}
	
	static {
		System.out.println("inside static block!!!");
	}
}

class ParentClass {
	// final & static & private and constructors cannot be overridden
	protected String getParentVal() throws  Exception{
		return "printed from parent method!!!!";
	}
}

class ChildClassExe extends ParentClass {
	@Override
	public String getParentVal() throws IOException{
		//System.out.println("inside child class");
		return "inside child class";
	}
	
	private String getParentVal(int a) {
		//System.out.println("inside child class");
		return "inside child class";
	}
}

class childClassExe1 extends ParentClass {
	@Override
	public String getParentVal() {
		return "from child class exe 1";
	}
}