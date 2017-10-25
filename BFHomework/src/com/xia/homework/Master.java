package com.xia.homework;

/**
 * Master.java
 *
 * @author gxia002
 */

public class Master {
	public void feed(Pet pet) {
		if (pet.getHealth() < 100) {
			pet.feed();
		} else {
			System.out.println("健康值达100，不需要喂食物。");
		}
	}
}
