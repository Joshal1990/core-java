package com.interview.prep.others;

public class OracleQuestion14 {
	public static void main(String[] args) {

		int Output = 10;
		boolean b1 = false;
		if (((Output += 10) == 20) && (b1 == true)) {
			System.out.println("We are equal " + Output);
		} else {
			System.out.println("Not equal! " + Output);
		}
	}
}
