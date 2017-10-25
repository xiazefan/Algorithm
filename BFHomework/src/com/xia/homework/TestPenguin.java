package com.xia.homework;

import java.util.Scanner;

/**
 * TestPenguin.java
 *
 * @author gxia002
 */

public class TestPenguin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Penguin p = new Penguin();
		System.out.println("欢迎来到宠物店");
		System.out.println("请输入您要领养的宠物名字：");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		p.setName(name);
		System.out.println("请选择要领养的宠物类型：(1.狗 2.企鹅)");
		int type = sc.nextInt();
		switch (type) {
		case 1:
			break;
		case 2:
			System.out.println("请选择企鹅的性别：（1，Q仔 2，Q妹）");
			int sex = sc.nextInt();
			if (sex == 1) {
				p.setGender("Q仔");
			} else {
				p.setGender("Q妹");
			}
			System.out.println("请输入企鹅的健康值(1~100之间)：");
			int health = sc.nextInt();
			p.setHealth(health);
			p.show();
		}
	}

}
