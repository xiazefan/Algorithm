package com.xia.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ClassInfo.java
 *
 * @author gxia002
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfo {
	private int id;
	private String name;
	private int score;

	public ClassInfo(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
