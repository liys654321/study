package com.liys.example.chapter02;

public class StaticInnerClassTest {
	private int prop1 = 5;
	private static int prop2 = 9;
	
	static class StaticInnerClass {
		private static int age;
		
		public void accessOuterProp() {
			//System.out.println(prop1);
			System.out.println(prop2);
		}
	}
	
	/**
	 * 此实例说明，静态内部类中可以定义静态和非静态的成员，根据静态成员不能访问非静态的规则
	 * 同理静态内部类中不能访问外部类中非静态的成员，也包括在静态内部类中的实例方法中也不能
	 * 访问外部类的实例成员。
	 * 
	 * 那么静态内部类中为什么不能访问外部类中非静态的成员呢？？？
	 * 	因为外部类中的实例变量是对象相关，而静态内部类的对象又不是寄存在外部类的对象当中，而是寄存在
	 * 	外部类的类体中。也就是说静态内部类对象去访问外部类中的实例变量时，外部类还没有对象。
	 * 
	 */
	

}
