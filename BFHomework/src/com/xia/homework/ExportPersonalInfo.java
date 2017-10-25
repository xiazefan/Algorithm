package com.xia.homework;

/**
 * ExportPersonalInfo.java
 *
 * @author gxia002
 */

public class ExportPersonalInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalInfo pi = new PersonalInfo("xia", 25, "Male");
		System.out.println("Name: " + pi.getName() + " Age: " + pi.getAge() + " Gender: " + pi.getGender());

	}

}
