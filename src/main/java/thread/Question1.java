package thread;

class ThreadTest extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("A");
			System.out.println("B");
		}
	}
}

public class Question1 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("C");
			System.out.println("D");
		}
	}

	public static void main(String args[]) {
		ThreadTest t1 = new ThreadTest();
		Question1 t2 = new Question1();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}
}