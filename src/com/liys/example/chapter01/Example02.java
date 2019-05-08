package com.liys.example.chapter01;

/**
 * 门面模式还有一个附加的好处那就是可以有选择性的往外暴露方法
 * @title:Example02
 * @author: liys
 * @date: 2019年5月7日 下午6:03:30
 * @version:1.0v
 */
public class Example02 {
	
	public static void main(String[] args) {
		/**
		 * 此例子中说明了一个问题就是：
		 * 当子系统模块中的方法仅仅是用于自身调用的话，那就没有必要在暴露给外界。
		 * 所以说门面模式另外一个附件的好处就是，选择性的向外界暴露方法。进而达到安全的措施。
		 */
	}
	
	
}


/**
 * 门面类
 * @title:Faced
 * @author: liys
 * @date: 2019年5月7日 下午6:08:30
 * @version:1.0v
 */
class Faced {
	
	public void aa1() {
		System.out.println("子系统的aa1");
	}
	
	public void bb1() {
		System.out.println("子系统的bb1");
	}
	
	public void cc1() {
		System.out.println("子系统的cc1");
	}
	
}


/**
 * 子系统模块AA
 * @title:ModuleA
 * @author: liys
 * @date: 2019年5月7日 下午6:04:21
 * @version:1.0v
 */
class ModuleAA {
	
	public void aa1() {
		System.out.println("aa1");
	}
	
	public void aa2() {
		System.out.println("aa2");
	}
	
	public void aa3() {
		System.out.println("aa3");
	}
	
}

/**
 * 子系统模块BB
 * @title:ModuleBB
 * @author: liys
 * @date: 2019年5月7日 下午6:06:46
 * @version:1.0v
 */
class ModuleBB {
	
	public void bb1() {
		System.out.println("bb1");
	}
	
	public void bb2() {
		System.out.println("bb2");
	}
	
	public void bb3() {
		System.out.println("bb3");
	}
	
}

/**
 * 子系统中c模块
 * @title:ModuleCC
 * @author: liys
 * @date: 2019年5月7日 下午6:07:24
 * @version:1.0v
 */
class ModuleCC {
	
	public void cc1() {
		System.out.println("cc1");
	}
	
	public void cc2() {
		System.out.println("cc2");
	}
	
	public void cc3() {
		System.out.println("cc3");
	}
	
}
