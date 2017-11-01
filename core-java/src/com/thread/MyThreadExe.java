package com.thread;

public class MyThreadExe extends Thread {
	@Override
	public void run() {
		System.out.println("Important job running in MyThread");
		// TODO Auto-generated method stub
		super.run();
	}

	public static void main(String[] args) {
		MyThreadExe threadExe = new MyThreadExe();
		threadExe.run();
	}
}
