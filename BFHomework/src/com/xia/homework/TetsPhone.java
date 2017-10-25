package com.xia.homework;

/**
 * TetsPhone.java
 *
 * @author gxia002
 */

public class TetsPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone = new Iphone(1, "iPhone");
		Phone HuaweiPhone = new HuaweiPhone(2, "HuaweiPhone");

		System.out.println(iphone.getName());
		System.out.println(HuaweiPhone.getName());

	}

}
