package com.liys.example.chapter02;

public class DiscernVariable {
	private String prop = "外部类的实例变量";
	
	private class InClass {
		private String prop = "内部类的实例变量";
		
		public void info() {
			String prop = "局部变量";
			
			System.out.println("外部类的Field值：" + DiscernVariable.this.prop);
			System.out.println("内部类的Field值：" + this.prop);
			System.out.println("方法中的变量值：" + prop);
		}
	}
	
	public void test() {
		InClass in = new InClass();
		in.info();
	}
	
	public static void main(String[] args) {
		new DiscernVariable().test();
		
		/**
		 * 此实例说明了：当外部类的成员，内部类的成员以及局部变量的变量名字相同时。
		 * 在非静态内部类中使用OutClass.this.propName访问外部类中的属性，使用this.propName来访问非静态内部类的
		 * 属性成员，使用propName来访问方法中的局部变量
		 */
	}
	

}
