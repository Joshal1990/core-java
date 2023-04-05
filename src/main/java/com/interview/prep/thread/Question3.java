package com.interview.prep.thread;

class MyThread1 extends Thread {
	MyThread1() {
		System.out.print(" MyThread1");
	}

	public void run() {
		System.out.print(" bar");
	}

	public void run(String s) {
		System.out.println(" baz");
	}
}

public class Question3 {
	public static void main(String[] args) {
		Thread t = new MyThread1() {
			public void run() {
				System.out.println(" foo");
			}
		};
		t.start();
	}
}
