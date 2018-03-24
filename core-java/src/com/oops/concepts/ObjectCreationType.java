package com.oops.concepts;

public class ObjectCreationType {

	public static void main(String[] args) {
		
		try {
			ObjectCreationType newInstance = ObjectCreationType.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
