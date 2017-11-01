package com.others;

import java.util.ArrayList;

public class MainMethodExe01 {
	public static void main(String[] args) {
		int a[][] = {{1,2,3},{3,4,5}};
		try{
		ArrayList<Integer> list = new ArrayList<>(1);
		list.add(1002);
		list.add(33394);
		System.out.println(list.get(1));
		}catch(Exception e){
			
		}finally{
			
		}
		// System.out.println(args[1]);
	}
}

abstract class AbstractMethod extends SampleClass3 implements One123 {

	private int i;

	public AbstractMethod(int wow) {
		this.i = wow;
	}

	public void abstractMethod() {
		// TODO Auto-generated constructor stub
	}

	protected abstract void getValue();
}

interface One123 extends Two, Three123 {

	void getvalue001();
}

interface Two {

}

interface Three123 {

}

abstract class SampleClass3 {

}