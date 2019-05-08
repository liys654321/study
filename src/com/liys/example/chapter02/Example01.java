package com.liys.example.chapter02;

/**
 * 单例模式：
 * 		单例模式确保一个类在整个系统中只有一个实例，而且是自己实例化出来然后提供整个系统使用。这个类称之为单例类
 * 
 * 		单例模式要满足三个条件：
 * 			1.只能有一个实例。
 * 			2.必须是由类自身创建。
 * 			3.必须为整个系统提供获取此实例的方法。
 * @title:Example01
 * @author: liys
 * @date: 2019年5月7日 下午6:15:28
 * @version:1.0v
 */
public class Example01 {

}


/**
 * 饿汉式：
 * 		三个要点：
 * 			1):保存实例的成员变量必须由static修饰。
 * 			2)：构造函数必须由private修饰。
 * 			3):向外面提供的方法必须用public static修饰。
 * @title:EagerSingleton
 * @author: liys
 * @date: 2019年5月7日 下午6:21:29
 * @version:1.0v
 */
class EagerSingleton {
	/**
	 * 当类被加载时，就进行实例化，此时调用私有的构造函数。
	 */
	private static EagerSingleton es = new EagerSingleton();
	
	/**
	 * 私有的构造函数
	 */
	private EagerSingleton() {
		
	}
	
	public static EagerSingleton getInstence() {
		return es;
	}
	
}




/**
 * 懒汉式
 * @title:LazySingleton
 * @author: liys
 * @date: 2019年5月7日 下午6:30:29
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
 * 线程安全的单例模式
 * @title:Singleton
 * @author: liys
 * @date: 2019年5月7日 下午6:40:27
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












