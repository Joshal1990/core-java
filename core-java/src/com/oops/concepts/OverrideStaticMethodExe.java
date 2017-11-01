package com.oops.concepts;


	// Superclass
	class Base {

		public Base() {
			// TODO Auto-generated constructor stub
			System.out.println("base constructor");
		}
		// Static method in base class which will be hidden in subclass
		public static void display() {
			System.out.println("Static or class method from Base");
		}

		// Non-static method which will be overridden in derived class
		public void print() {
			System.out.println("Non-static or Instance method from Base");
		}
	}

	// Subclass
	class Derived extends Base {

		public Derived() {
			System.out.println("derived constructor");
			// TODO Auto-generated constructor stub
		}
		// This method hides display() in Base
		public static void display() {
			System.out.println("Static or class method from Derived");
		}

		// This method overrides print() in Base
		public void print() {
			System.out.println("Non-static or Instance method from Derived");
		}
	}

	// Driver class
	public class OverrideStaticMethodExe {
		public static void main(String args[]) {
			Base obj1 = new Derived();

			// As per overriding rules this should call to class Derive's static
			// overridden method. Since static method can not be overridden, it
			// calls Base's display()
			try{
				obj1.display();
			}catch(ArrayIndexOutOfBoundsException e){
				
			}catch(ArithmeticException e){
				
			}catch(NumberFormatException e){
				
			}catch (Exception e) {
				// TODO: handle exception
			}

			// Here overriding works and Derive's print() is called
			obj1.print();
		}
}
