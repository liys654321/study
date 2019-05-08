package com.liys.example.chapter02;

/**
 * java内部类
 * 
 * @title:InnerClassExample01
 * @author: liys
 * @date: 2019年5月7日 下午7:09:17
 * @version:1.0v
 */
public class InnerClassExample01 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	class InnerClass {
		public InnerClass() {
			name = "chenssy";
			age = 20;
		}
	}

}
