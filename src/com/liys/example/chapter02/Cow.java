package com.liys.example.chapter02;

public class Cow {

	private double weight;
	private Cow(){}
	
	private Cow(double weight) {
		this.weight = weight;
	}
	
	private class CowLeg {
		private double length;
		private String color;
		
		public CowLeg(){}
		public CowLeg(double length,String color) {
			this.length = length;
			this.color = color;
		}
		
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public void info() {
			System.out.println("当前牛腿颜色是：" + color + "，高：" + length);
			System.out.println("本牛腿所在的奶牛重:" + weight);
		}
	}
	
	public void test() {
		CowLeg c1 = new CowLeg(1.12,"黑白相同");
		c1.info();
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
		
		/**
		 * 如上所示：不难发现在外部类中使用非静态的内部类时，和平常的类的使用方法并没有什么、太大的区别。
		 */
	}
		
}
