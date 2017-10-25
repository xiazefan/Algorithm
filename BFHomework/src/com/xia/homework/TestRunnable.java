package com.xia.homework;

/**
 * TestRunnable.java
 *
 * @author gxia002
 */

public class TestRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestRunnable tr = new TestRunnable();
		Thread th = new Thread(tr);
		th.start();
		Thread th2 = new Thread(tr);
		th2.start();

		// for (int i = 0; i < 10; i++) {
		// System.out.println("main" + i);
		// }
	}

	int count = 10;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (count > 0) {
			count--;
			System.out.println("count" + count);
		}
	}

}
