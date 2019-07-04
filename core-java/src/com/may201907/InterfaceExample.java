package com.may201907;

public interface InterfaceExample {

	// implicitly all the variables are public static and final.
	// we have to declare value to the variable..
	
	int i = 10;
	// interface implicitly public and abstract method event if we didn't declare 
	// by default
	// private and protected is not allows in interfaces
	public abstract void method1();
	// only abstract or static is allowed at once both are not allowed
	public abstract void method2();
	public default void method3() {
		System.out.println("insid method 3 from interface");
	};
	// interface method cannot be static before java 8 but now static methods are allowed in java 8 onwards.
	// interface methods cannot be final or strictfp or native
	public static void method4() {
		System.out.println("interface method4 executed!!!!");
	};
	// java 9 we are allowed to have private method in interface
}
