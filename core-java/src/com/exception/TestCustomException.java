package com.exception;

public class TestCustomException {

	static void validate(int a) throws CustomException {
		// TODO Auto-generated method stub
		if(a != 1){
			throw new CustomException("this is the custom exception!!!!!!!!!!!");
		}

	}
	
	public static void main(String[] args) {
		try {
			validate(5);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println("exception occuren in: "+e);
			//e.printStackTrace();
		}
		System.out.println("rest code is here.......");
	}
}
