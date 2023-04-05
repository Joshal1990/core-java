package com.interview.prep.concepts;

 class Child {

	//public class InheritanceExe {
		public String parentName ="hgjhgjg";
		public String familyName="yffguguu";

		protected void printMyName() {
		    System.out.println("My name main class is"+parentName+ " is"+familyName);
		 // }
	}
}
 public class InheritanceExe extends Child {
		public String childName;
		public int childAge;

		// inheritance
		protected void printMyName() {
			System.out.println("My child name child is "+childName+""+familyName);
		}
		public static void main(String[] args) {
			Child child = new Child();
			child.printMyName();
		}
	}

