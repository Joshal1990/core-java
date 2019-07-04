package com.may201907;

public class SampleGenericClassExe {

	public static void main(String[] args) {
		Integer[] intVal = { 1, 2, 3, 4, 5, 6 };
		GenrcSampleCls<Integer> class1 = new GenrcSampleCls<Integer>(intVal);
		Integer max = class1.getMax();
		System.out.println(max);
		Character[] charVal = { 'a', 'b', 'c' };
		GenrcSampleCls<Character> sampleClass = new GenrcSampleCls<Character>(charVal);
		Character max2 = sampleClass.getMax();
		System.out.println(max2);

	}

}

class GenrcSampleCls<T extends Comparable<T>> implements MyGenericInterface<T> {

	T[] val;

	public GenrcSampleCls(T[] arrVal) {
		val = arrVal;

	}

	@Override
	public T getMax() {
		T maxVal = val[0];

		for (int i = 0; i < val.length; i++) {
			if (val[i].compareTo(maxVal) > 0) {
				maxVal = val[i];
			}
		}
		return maxVal;
	}

}
