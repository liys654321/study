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
	 * �ⲿ����Ȼ����ֱ�ӷ����ڲ���ĳ�Ա�����ⲿ�����ʹ���ڲ��������Ϊ�������������ڲ����еľ�̬��Ա����ʹ�ö�����з���
	 * �ڲ����ʵ����Ա
	 */
	
	
}
