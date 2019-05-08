package com.liys.example.chapter02;

public class AccessStaticInnerClass {
	
	static class StaticInnerClass {
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	
	public void accessInnerProp() {
		System.out.println(StaticInnerClass.prop1);
		System.out.println(new StaticInnerClass().prop2);
	}
	
	
	/**
	 * 外部类依然不能直接访问内部类的成员而是外部类可以使用内部类的类名为调用者来访问内部类中的静态成员，而使用对象进行访问
	 * 内部类的实例成员
	 */
	
	
}
