package com.liys.example.chapter02;

public class Outer {
	private int outProp = 10;
	
	private class Inner {
		private int innerProp = 20;
		
		public void accessOuterProp() {
			System.out.println("外部类中的属性是：" + outProp);
		}
		
	}
	
	public void accessInnerProp() {
		System.out.println("访问内部类中的属性：" + new Inner().innerProp);
	}
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.accessInnerProp();
		
		/**
		 * 本实例说明：在非静态内部类中可以直接访问外部类的成员变量，而外部类不能直接访问内部类中的成员。
		 * 为什么外部类不能访问内部类中的变量呢？？？？？？？、
		 * 
		 * 		因为每一个非静态的内部类对象必须寄存在外部类对象中。所以这个内部类要是访问外部类中的成员时就一定能肯定这个外部类已经存在，反之
		 * 		每一个外部类对象不一定非要寄存内部类对象，也就是说当使用外部类去访问内部类中成员，此时外部类还不知道内部类是否现在已经存在。
		 * 		所以java规定，内部类可以直接访问外部类中的成员，而外部类不能直接访问内部类中的成员，要想访问内部类中的成员必须首先要创建
		 * 		内部类的对象以确定内部类已经存在。
		 * 
		 * 
		 * 
		 */
		
		
	}
	
	

}
