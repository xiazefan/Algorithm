package com.xia.homework;

/**
 * Penguin.java
 *
 * @author gxia002
 */

public class Penguin extends Pet {
	private String name;
	private int health;
	private int love;
	private String gender;

	public Penguin(String name, int health, int love, String gender) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
		this.gender = gender;
	}

	public Penguin() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health > 100 || health < 0) {
			System.out.println("健康值应该在0到100之间，默认值为60");
			this.health = 60;
		} else {
			this.health = health;
		}
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		if (love > 100 || love < 0) {
			System.out.println("亲密度应该在0到100之间，默认值为60");
			this.love = 60;
		} else {
			this.love = love;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void show() {
		System.out.println("宠物的自白：");
		System.out.println("我的名字叫：" + name + ",健康值是" + health + ",和主人的亲密度是" + love + "，我的性别是：" + gender);
	}

	public void feed() {
		this.health += 5;
		System.out.println("企鹅吃了食物，健康值增加5");
	}

}
