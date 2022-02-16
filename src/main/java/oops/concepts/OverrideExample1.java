package oops.concepts;

class ABC {
	int i = 10;

	public void test() {
		System.out.println("a i===" + i);
	}
}

class BBB extends ABC {

	public void test() {
		super.test();
		i = 20;
		System.out.println("i===" + i);
	}
}

public class OverrideExample1 implements Sumo {
	public static void main(String[] args) {
		ABC a = new BBB();

		System.out.println(a.i);
		a.test();
		System.out.println(a.i);

	}

	public void PrintValue() {
		// TODO Auto-generated method stub

	}
}

interface Sumo {
	public void PrintValue();
}

