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
	 * ��ʵ��˵������̬�ڲ����п��Զ��徲̬�ͷǾ�̬�ĳ�Ա�����ݾ�̬��Ա���ܷ��ʷǾ�̬�Ĺ���
	 * ͬ��̬�ڲ����в��ܷ����ⲿ���зǾ�̬�ĳ�Ա��Ҳ�����ھ�̬�ڲ����е�ʵ��������Ҳ����
	 * �����ⲿ���ʵ����Ա��
	 * 
	 * ��ô��̬�ڲ�����Ϊʲô���ܷ����ⲿ���зǾ�̬�ĳ�Ա�أ�����
	 * 	��Ϊ�ⲿ���е�ʵ�������Ƕ�����أ�����̬�ڲ���Ķ����ֲ��ǼĴ����ⲿ��Ķ����У����ǼĴ���
	 * 	�ⲿ��������С�Ҳ����˵��̬�ڲ������ȥ�����ⲿ���е�ʵ������ʱ���ⲿ�໹û�ж���
	 * 
	 */
	

}
