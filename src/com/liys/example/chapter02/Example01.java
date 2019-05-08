package com.liys.example.chapter02;

/**
 * ����ģʽ��
 * 		����ģʽȷ��һ����������ϵͳ��ֻ��һ��ʵ�����������Լ�ʵ��������Ȼ���ṩ����ϵͳʹ�á�������֮Ϊ������
 * 
 * 		����ģʽҪ��������������
 * 			1.ֻ����һ��ʵ����
 * 			2.������������������
 * 			3.����Ϊ����ϵͳ�ṩ��ȡ��ʵ���ķ�����
 * @title:Example01
 * @author: liys
 * @date: 2019��5��7�� ����6:15:28
 * @version:1.0v
 */
public class Example01 {

}


/**
 * ����ʽ��
 * 		����Ҫ�㣺
 * 			1):����ʵ���ĳ�Ա����������static���Ρ�
 * 			2)�����캯��������private���Ρ�
 * 			3):�������ṩ�ķ���������public static���Ρ�
 * @title:EagerSingleton
 * @author: liys
 * @date: 2019��5��7�� ����6:21:29
 * @version:1.0v
 */
class EagerSingleton {
	/**
	 * ���౻����ʱ���ͽ���ʵ��������ʱ����˽�еĹ��캯����
	 */
	private static EagerSingleton es = new EagerSingleton();
	
	/**
	 * ˽�еĹ��캯��
	 */
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstence() {
		return es;
	}
	
}




/**
 * ����ʽ
 * @title:LazySingleton
 * @author: liys
 * @date: 2019��5��7�� ����6:30:29
 * @version:1.0v
 */
class LazySingleton {
	
	private static LazySingleton ls = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		if(null == ls) {
			ls = new LazySingleton();
		}
		return ls;
	}
}


/**
 * �̰߳�ȫ�ĵ���ģʽ
 * @title:Singleton
 * @author: liys
 * @date: 2019��5��7�� ����6:40:27
 * @version:1.0v
 */
class Singleton {
	private volatile static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(null == singleton) {
			synchronized(Singleton.class) {
				if(null == singleton) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
		
	}
}












