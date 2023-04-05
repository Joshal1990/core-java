package com.interview.prep.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateNumbers {

	public static Integer findDuplicateValue(List<Integer> val) {
		
	//	List<Integer> duplciate = new ArrayList<Integer>(val);
	//	System.out.println(duplciate);
	//	Set<Integer> noDuplicate = new HashSet<Integer>(duplciate);
	//	System.out.println(noDuplicate);
	//	if(duplciate.size() != noDuplicate.size()){
			Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
			
			for (Integer integer : val) {
				
				if(hashMap.containsKey(integer)){
					System.out.println("the duplicate value is "+ integer);
					hashMap.put(integer, hashMap.get(integer)+1);
				}else{
					hashMap.put(integer, 1);
				}
			}
	//	}
		
		return null;
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		List<Integer> intValues = new ArrayList<Integer>();
		intValues.add(5);
		intValues.add(15);
		intValues.add(8);
		intValues.add(69);
		intValues.add(15);
		intValues.add(5);
		System.out.println("Values with duplicates: "+intValues);
		Integer val = findDuplicateValue(intValues);
		int[] arr = {1,2,3,4,5,6};
		System.out.println(arr.length-1);
	}
}
