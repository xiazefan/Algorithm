package com.xia.homework;

/**
 * Dog.java
 *
 * @author gxia002
 */

public class Dog extends Pet {
	private String name;
	private int health;
	private int love;
	private String gender;

	public Dog(String name, int health, int love, String gender) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
		this.gender = gender;
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

	public void feed() {
		this.health += 3;
		System.out.println("狗狗吃了食物，健康值增加3");
	}

}
