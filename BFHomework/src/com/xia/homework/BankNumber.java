package com.xia.homework;

/**
 * BankNumber.java
 *
 * @author gxia002
 */

public class BankNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int customerNo = 1236547;
		int geiwei = customerNo % 10;
		int shiwei = customerNo / 10 % 10;
		int baiwei = customerNo / 100 % 10;
		int qianwei = customerNo / 1000 % 10;
		int wanwei = customerNo / 10000 % 10;
		int shiwanwei = customerNo / 100000 % 10;
		int baiwanwei = customerNo / 1000000 % 10;

		int sum = geiwei + shiwei + baiwei + qianwei + wanwei + shiwanwei + baiwanwei;

		System.out.println(sum);
	}

}
