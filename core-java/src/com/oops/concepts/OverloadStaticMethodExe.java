package com.oops.concepts;

public class OverloadStaticMethodExe {
		// possible to overload static method in java ref below example
		public static void foo() {
			System.out.println("Test.foo() called ");
		}

		public static void foo(int a) {
			System.out.println("Test.foo(int) called ");
		}

		public static void main(String args[]) {
			OverloadStaticMethodExe.foo(10);
			OverloadStaticMethodExe.foo();
		}
		
		/*We cannot overload two methods in Java if they differ only by static keyword
		 *  (number of parameters and types of parameters is same). 
		 *  See following Java program for example.

		public class Test {
		    public static void foo() {
		        System.out.println("Test.foo() called ");
		    }
		    public void foo() { // Compiler Error: cannot redefine foo()
		        System.out.println("Test.foo(int) called ");
		    }
		    public static void main(String args[]) { 
		        Test.foo();
		    }
		}*/
}
