package com.xia.homework;

import java.util.Scanner;

/**
 * TestScore.java
 *
 * @author gxia002
 */

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入5名参赛者的成绩：");
		int scores[] = new int[5];
		int sum = 0;
		int max = 0;
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			scores[i] = j;
			sum += scores[i];
			max = (max > scores[i]) ? max : scores[i];
		}

		System.out.println("平均成绩：" + sum / 5);
		System.out.println("最高成绩：" + max);

	}

}
