package com.xia.homework;

/**
 * Iphone.java
 *
 * @author gxia002
 */

public class Iphone implements Phone {

	private int id;
	private String name;

	public Iphone(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
