package com.xia.homework;

/**
 * TestPet.java
 *
 * @author gxia002
 */

public class TestPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet dog = new Dog("狗狗", 100, 60, "狗仔");
		Pet pegiun = new Penguin("企鹅", 60, 60, "Q仔");

		System.out.println("狗狗初始健康值：" + dog.getHealth());
		System.out.println("企鹅初始健康值：" + pegiun.getHealth());
		Master master = new Master();
		master.feed(dog);
		master.feed(pegiun);
		System.out.println("狗狗现在健康值：" + dog.getHealth());
		System.out.println("企鹅现在健康值：" + pegiun.getHealth());
	}

}
