package com.xia.homework;

/**
 * MyThread.java
 *
 * @author gxia002
 */

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread tt = new MyThread();
		tt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main" + i);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("mythread" + i);
		}
	}

}
