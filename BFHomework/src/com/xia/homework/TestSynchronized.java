package com.xia.homework;

/**
 * TestSynchronized.java
 *
 * @author gxia002
 */

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA ta = new ThreadA();
		Thread a = new Thread(ta, "小王");
		Thread b = new Thread(ta, "老吴");

		a.start();
		b.start();

	}

}

class ThreadA implements Runnable {

	int count = 100;

	@Override
	// public synchronized void run() {
	public void run() {
		// TODO Auto-generated method stub
		while (count > 0) {
			synchronized (this) {
				if (count > 0) {
					count--;
					System.out.println(Thread.currentThread().getName() + count);
				}
			}
		}
	}

}