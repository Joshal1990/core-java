package com.may201907;

public interface MyGenericInterface<T> {
	public T getMax();
}

class SampleClass{
	public static void main(String[] args) {
		Integer[] intVal = {1,2,3,4,5,6};
		GenrcSampleClass<Integer> class1 = new GenrcSampleClass<Integer>(intVal);
		Integer max = class1.getMax();
		System.out.println(max);
		Character[] charVal = {'a','b','c'};
		GenrcSampleClass<Character> sampleClass = new GenrcSampleClass<Character>(charVal);
		Character max2 = sampleClass.getMax();
		System.out.println(max2);
		
	}
}

class GenrcSampleClass<T extends Comparable<T>> implements MyGenericInterface<T>{

	T[] val;
	public GenrcSampleClass(T[] arrVal) {
		val = arrVal;
		
	}
	
	@Override
	public T getMax() {
		T maxVal = val[0];	

		for (int i = 0; i < val.length; i++) {
			if(val[i].compareTo(maxVal) > 0) {
				maxVal = val[i];
			}
		}
		return maxVal;
	}
	
}