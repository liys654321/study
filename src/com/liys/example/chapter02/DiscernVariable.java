package com.liys.example.chapter02;

public class DiscernVariable {
	private String prop = "�ⲿ���ʵ������";
	
	private class InClass {
		private String prop = "�ڲ����ʵ������";
		
		public void info() {
			String prop = "�ֲ�����";
			
			System.out.println("�ⲿ���Fieldֵ��" + DiscernVariable.this.prop);
			System.out.println("�ڲ����Fieldֵ��" + this.prop);
			System.out.println("�����еı���ֵ��" + prop);
		}
	}
	
	public void test() {
		InClass in = new InClass();
		in.info();
	}
	
	public static void main(String[] args) {
		new DiscernVariable().test();
		
		/**
		 * ��ʵ��˵���ˣ����ⲿ��ĳ�Ա���ڲ���ĳ�Ա�Լ��ֲ������ı���������ͬʱ��
		 * �ڷǾ�̬�ڲ�����ʹ��OutClass.this.propName�����ⲿ���е����ԣ�ʹ��this.propName�����ʷǾ�̬�ڲ����
		 * ���Գ�Ա��ʹ��propName�����ʷ����еľֲ�����
		 */
	}
	

}
