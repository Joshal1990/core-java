package com.others;

import java.util.Arrays;
import java.util.Comparator;

class MySort implements Comparator<Integer> {
	public MySort() {
		System.out.println("inside mysort......");
	}

	public int compare(Integer x, Integer y) {
		return x.compareTo(y);
	}
}

public class OracleQuestion4 {
	public static void main(String[] args) {
		Integer[] primes = { 2, 7, 5, 3 };
		MySort ms = new MySort();
		Arrays.sort(primes,ms);
		for (Integer p2 : primes) {
			System.out.print(p2 + " ");
		}
	}
}