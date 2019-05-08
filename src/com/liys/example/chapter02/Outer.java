package com.liys.example.chapter02;

public class Outer {
	private int outProp = 10;
	
	private class Inner {
		private int innerProp = 20;
		
		public void accessOuterProp() {
			System.out.println("�ⲿ���е������ǣ�" + outProp);
		}
		
	}
	
	public void accessInnerProp() {
		System.out.println("�����ڲ����е����ԣ�" + new Inner().innerProp);
	}
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.accessInnerProp();
		
		/**
		 * ��ʵ��˵�����ڷǾ�̬�ڲ����п���ֱ�ӷ����ⲿ��ĳ�Ա���������ⲿ�಻��ֱ�ӷ����ڲ����еĳ�Ա��
		 * Ϊʲô�ⲿ�಻�ܷ����ڲ����еı����أ���������������
		 * 
		 * 		��Ϊÿһ���Ǿ�̬���ڲ���������Ĵ����ⲿ������С���������ڲ���Ҫ�Ƿ����ⲿ���еĳ�Աʱ��һ���ܿ϶�����ⲿ���Ѿ����ڣ���֮
		 * 		ÿһ���ⲿ�����һ����Ҫ�Ĵ��ڲ������Ҳ����˵��ʹ���ⲿ��ȥ�����ڲ����г�Ա����ʱ�ⲿ�໹��֪���ڲ����Ƿ������Ѿ����ڡ�
		 * 		����java�涨���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա�����ⲿ�಻��ֱ�ӷ����ڲ����еĳ�Ա��Ҫ������ڲ����еĳ�Ա��������Ҫ����
		 * 		�ڲ���Ķ�����ȷ���ڲ����Ѿ����ڡ�
		 * 
		 * 
		 * 
		 */
		
		
	}
	
	

}
