package com.liys.example.chapter01;

/**
 * 设计模式之门面模式
 * @title:Example01
 * @author: liys
 * @date: 2019年5月7日 下午5:27:39
 * @version:1.0v
 */
public class Example01 {
	
	
	/**
	 * 门面角色：客户端可以调用这个角色的方法。
	 * 子系统角色：可以同时有一个或多个子系统。
	 * @param args
	 */
	public static void main(String[] args) {
		Facade f = new Facade();
		f.test();
	}
	
	/**
	 * 门面模式主要有两个角色一个是子系统，一个是门面角色。在这个例子中客户端使用门面角色Facade和子系统中的A，B，C三个模块进行打交道。
	 * 这样做的好处是客户端不需要知道子系统中各个模块的存在，也就是说客户端和子系统中的模块之间解耦合。
	 * 更多的操作由门面类去完成不需要客户端去完成。
	 */

}

/**
 * 门面角色
 * @title:Facade
 * @author: liys
 * @date: 2019年5月7日 下午5:55:27
 * @version:1.0v
 */
class Facade {
	
	
	public void test() {
		ModuleA a = new ModuleA();
		a.testA();
		ModuleB b = new ModuleB();
		b.testB();
		ModuleC c = new ModuleC();
		c.testC();
	}
	
	
}




/**
 * 子系统中的模块A
 * @title:ModuleA
 * @author: liys
 * @date: 2019年5月7日 下午5:54:31
 * @version:1.0v
 */
class ModuleA {
	
	public void testA() {
		System.out.println("调用ModuleA中的testA方法");
	}
	
}

/**
 * 子系统中的模块B
 * @title:ModuleB
 * @author: liys
 * @date: 2019年5月7日 下午5:54:51
 * @version:1.0v
 */
class ModuleB {
	
	public void testB() {
		System.out.println("调用ModuleB中的testB方法");
	}
	
}


/**
 * 子系统中的模块C
 * @title:ModuleC
 * @author: liys
 * @date: 2019年5月7日 下午5:55:02
 * @version:1.0v
 */
class ModuleC {
	
	public void testC() {
		System.out.println("调用ModuleC中的testC方法");
	}
	
}





