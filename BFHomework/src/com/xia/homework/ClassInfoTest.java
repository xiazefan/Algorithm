package com.xia.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassInfoTest.java
 *
 * @author gxia002
 */

public class ClassInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInfo c1 = new ClassInfo(1, "数学");
		ClassInfo c2 = new ClassInfo(2, "语文");
		ClassInfo c3 = new ClassInfo(3, "英语");
		ClassInfo c4 = new ClassInfo(4, "物理");
		ClassInfo c5 = new ClassInfo(5, "化学");

		List<ClassInfo> list = new ArrayList<ClassInfo>();

		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);

		System.out.println("请输入课程编号：");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();

		for (int i = 1; i <= 5; i++) {
			if (i == j) {
				System.out.println(list.get(i - 1).getName());
			}
		}

	}

}
