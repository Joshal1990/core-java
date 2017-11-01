package com.thread;

public class MyRunnableExe implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			
			try {
				System.out.println("thread gng to sleep");
				Thread.sleep(1000);
				System.out.println("thread sleep end");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Important job running in MyRunnable");
		}
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		MyRunnableExe run = new MyRunnableExe();
		Thread thread = new Thread(run);
		//thread.start();
		thread.run();
		//thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("inside main method");
		}
	}
}
