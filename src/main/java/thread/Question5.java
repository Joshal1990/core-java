package thread;

class Question5 extends Thread {
	public static void main(String[] args) {
		Question5 t = new Question5();
		t.start();
		System.out.print("one. ");
		t.start();
		System.out.print("two. ");
	}

	public void run() {
		System.out.print("Thread ");
	}
}
