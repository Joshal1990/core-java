package thread;

// thread
class MyThread extends Thread {
	MyThread() {
		System.out.println("thread constructor........");
	}

	MyThread(Runnable r) {
		super(r);
		System.out.println("runnable constructor..........");
	}

	public void run() {
		System.out.println("Inside Thread ");
	}
}

// runnable
class RunnableDemo implements Runnable {
	public void run() {
		System.out.println("Inside Runnable");
	}
}
 

public class Question2 {
	public static void main(String[] args) {
		new MyThread().start();
		new MyThread(new RunnableDemo()).start();
		new Thread(new RunnableDemo()).start();
	}
}