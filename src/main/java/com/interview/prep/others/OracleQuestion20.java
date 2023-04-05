package com.interview.prep.others;

interface Event {
	String type = "event";

	public void details();
}

class Quiz {
	static String type = "Quiz";
}

public class OracleQuestion20 extends Quiz implements Event{
	public static void main(String[] args) {
		new OracleQuestion20().details();
		//System.out.println(type);
	}

	@Override
	public void details() {
		//System.out.println(type);
		
	}
}
