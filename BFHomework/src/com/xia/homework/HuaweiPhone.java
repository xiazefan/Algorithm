package com.xia.homework;

/**
 * HuaweiPhone.java
 *
 * @author gxia002
 */

public class HuaweiPhone implements Phone {

	private int id;
	private String name;

	public HuaweiPhone(int id, String name) {
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
