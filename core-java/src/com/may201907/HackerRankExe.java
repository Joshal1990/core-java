package com.may201907;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HackerRankExe {
	public static void main(String[] args) {

		int arr[] = {140638725, 436257910, 953274816 ,734065819 ,362748590};
		List<Long> treeSet = new ArrayList<Long>();
		Long sum = 0l;
		for(int i=0;i<arr.length; i++) {
			for(int j=0;j<arr.length; j++) {
				if(i != j) {
					sum += arr[j];
				}
			}
			treeSet.add(sum);
			sum=0l;
		}
		Collections.sort(treeSet);
		System.out.println(treeSet.get(0)+" "+treeSet.get(treeSet.size() - 1));
	}
}
