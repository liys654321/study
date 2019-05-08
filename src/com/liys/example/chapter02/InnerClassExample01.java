package com.liys.example.chapter02;

/**
 * java内部类
 * 
 * 		内部类主要有一下作用：
 * 			1):内部类提供了更好的封装，可以把内部类隐藏在外部类中，不允许同一个包中的其他类来访问内部类。
 * 			2):内部类成员可以直接访问外部类的私有数据。
 * 			3):匿名内部类适合于创建那些仅需要一次使用的类。
 * 
 *		内部类分为两种一种是成员内部类，一种是局部内部类（也就是将类定义在类中的成员方法中）：
 *			1):成员内部类：
 *				成员内部类是一种和Field，方法，构造函数，初始化块相类似的类成员。局部内部类和匿名内部类则不是类的成员
 *				成员内部类又可分为两种：
 *					1):静态内部类
 *					2):非静态内部类
 * 
 * 
 * 
 * 
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
