package com.others;

public class Example02 {

	public static void main(String[] args) {
		int a = 5;
		for (int i = a; i >= 1; i--) {
			for (int j = a; j >= 1; j--) {
				
				Object val[] = new Object[a];
				val[i] = i;
				val[i-1]='*';
				for (int k = 0; k < val.length-1; k++) {
					System.out.println(k);
				}
				//System.out.print(j);
			}
			System.out.println();
		}
	}
}
