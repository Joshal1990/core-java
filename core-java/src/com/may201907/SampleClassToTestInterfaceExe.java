package com.may201907;

public class SampleClassToTestInterfaceExe extends AbstractClassTestInterfaceExe{

	@Override
	public void method2() {
		System.out.println("method 2 invoked from sample class!!!!");
		
	}
	
	/*
	 * @Override public void method1() {
	 * System.out.println("inside sample class invoked!!!"); }
	 */
	 
	
	public static void main(String[] args) {
		InterfaceExample face = new SampleClassToTestInterfaceExe();
		face.method1();
		face.method3();
	}
}
