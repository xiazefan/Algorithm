package com.xia.homework;

import java.util.Scanner;

/**
 * LowestPhonePrice.java
 *
 * @author gxia002
 */

public class LowestPhonePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入4家店的价格：");
		int[] price = new int[4];
		int min = 0;
		for (int i = 1; i <= 4; i++) {
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			price[i - 1] = j;
			min = j;
			System.out.println("第" + i + "店的价格：" + j);
		}

		for (int i = 0; i < 4; i++) {
			min = (min < price[i]) ? min : price[i];
		}

		System.out.println("最低价格是：" + min);

	}

}
