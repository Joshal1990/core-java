package com.interview.prep.others;

class Alpha {
	String getType() {
		return "alpha";
	}
}

class Beta extends Alpha {
	String getType() {
		return "beta";
	}
}

public class OracleQuestion2 extends Beta {
	String getType() {
		return "gamma";
	}

	public static void main(String[] args) {
		Alpha alpha = new OracleQuestion2();
		//OracleQuestion2 g2 = new Beta();
		System.out.println(alpha.getType() );
	}
}
