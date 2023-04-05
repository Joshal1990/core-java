package com.interview.prep.others;

public class OracleQuestion8 {
	public static void main(String[] args) {
		try {
			new OracleQuestion8().go();
		} catch (Exception e) {
			System.out.println("thrown to main");
		}
	}

	synchronized void go() throws InterruptedException {
		//Thread t1 = new Thread();
		Runnable runnable = Runnable(); 
		Thread t1 = new Thread(runnable);
		t1.start();
		System.out.print("1 ");
		t1.wait(5000);
		System.out.print("2 ");
	}

	private Runnable Runnable() {
		// TODO Auto-generated method stub
		return null;
	}
}
