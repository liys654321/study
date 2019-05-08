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
			System.out.println("��ǰţ����ɫ�ǣ�" + color + "���ߣ�" + length);
			System.out.println("��ţ�����ڵ���ţ��:" + weight);
		}
	}
	
	public void test() {
		CowLeg c1 = new CowLeg(1.12,"�ڰ���ͬ");
		c1.info();
	}
	
	public static void main(String[] args) {
		Cow cow = new Cow(378.9);
		cow.test();
		
		/**
		 * ������ʾ�����ѷ������ⲿ����ʹ�÷Ǿ�̬���ڲ���ʱ����ƽ�������ʹ�÷�����û��ʲô��̫�������
		 */
	}
		
}
