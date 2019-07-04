package com.may201907;

public class Ways2CreateObject{
	
	String name = "Johnpaul!!!";
	public static void main(String[] args) throws CloneNotSupportedException {
		FinalClassTest finalClassTest = new FinalClassTest("object creatred from main method!!!");
		System.out.println(finalClassTest.getVal());
		// 1 . As we all know that we can create object using new keywords.
		Ways2CreateObject ways2CreateObject = new Ways2CreateObject();
		System.out.println(ways2CreateObject.name);
		try {
		// 2. If we know the name of the class we can create object 
		Class forName = Class.forName("SampleClassData");
		SampleClassData obj = (SampleClassData)forName.newInstance();
		System.out.println(obj);
		}catch (InstantiationException | IllegalAccessException |ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// 3. Using clone method
		SampleClassData classData = new SampleClassData();
		SampleClassData clone = (SampleClassData)classData.clone();
		System.out.println(clone.val);
	}
}
