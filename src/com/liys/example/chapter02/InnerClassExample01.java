package com.liys.example.chapter02;

/**
 * java�ڲ���
 * 
 * 		�ڲ�����Ҫ��һ�����ã�
 * 			1):�ڲ����ṩ�˸��õķ�װ�����԰��ڲ����������ⲿ���У�������ͬһ�����е��������������ڲ��ࡣ
 * 			2):�ڲ����Ա����ֱ�ӷ����ⲿ���˽�����ݡ�
 * 			3):�����ڲ����ʺ��ڴ�����Щ����Ҫһ��ʹ�õ��ࡣ
 * 
 *		�ڲ����Ϊ����һ���ǳ�Ա�ڲ��࣬һ���Ǿֲ��ڲ��ࣨҲ���ǽ��ඨ�������еĳ�Ա�����У���
 *			1):��Ա�ڲ��ࣺ
 *				��Ա�ڲ�����һ�ֺ�Field�����������캯������ʼ���������Ƶ����Ա���ֲ��ڲ���������ڲ���������ĳ�Ա
 *				��Ա�ڲ����ֿɷ�Ϊ���֣�
 *					1):��̬�ڲ���
 *					2):�Ǿ�̬�ڲ���
 * 
 * 
 * 
 * 
 * 
 * @title:InnerClassExample01
 * @author: liys
 * @date: 2019��5��7�� ����7:09:17
 * @version:1.0v
 */
public class InnerClassExample01 {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	class InnerClass {
		public InnerClass() {
			name = "chenssy";
			age = 20;
		}
	}

}
