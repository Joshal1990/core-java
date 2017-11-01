package com.others;

// Which variables may be referenced correctly at line 12?
public class OracleQuestion16 {
	public int a = 1;
	private int b = 2;

	public void method(final int c) {
		int d = 3;
		class Inner {
			private void iMethod(int e) {

			}
		}
	}
}