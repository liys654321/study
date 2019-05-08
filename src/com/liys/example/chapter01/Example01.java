package com.liys.example.chapter01;

/**
 * ���ģʽ֮����ģʽ
 * @title:Example01
 * @author: liys
 * @date: 2019��5��7�� ����5:27:39
 * @version:1.0v
 */
public class Example01 {
	
	
	/**
	 * �����ɫ���ͻ��˿��Ե��������ɫ�ķ�����
	 * ��ϵͳ��ɫ������ͬʱ��һ��������ϵͳ��
	 * @param args
	 */
	public static void main(String[] args) {
		Facade f = new Facade();
		f.test();
	}
	
	/**
	 * ����ģʽ��Ҫ��������ɫһ������ϵͳ��һ���������ɫ������������пͻ���ʹ�������ɫFacade����ϵͳ�е�A��B��C����ģ����д򽻵���
	 * �������ĺô��ǿͻ��˲���Ҫ֪����ϵͳ�и���ģ��Ĵ��ڣ�Ҳ����˵�ͻ��˺���ϵͳ�е�ģ��֮�����ϡ�
	 * ����Ĳ�����������ȥ��ɲ���Ҫ�ͻ���ȥ��ɡ�
	 */

}

/**
 * �����ɫ
 * @title:Facade
 * @author: liys
 * @date: 2019��5��7�� ����5:55:27
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
 * ��ϵͳ�е�ģ��A
 * @title:ModuleA
 * @author: liys
 * @date: 2019��5��7�� ����5:54:31
 * @version:1.0v
 */
class ModuleA {
	
	public void testA() {
		System.out.println("����ModuleA�е�testA����");
	}
	
}

/**
 * ��ϵͳ�е�ģ��B
 * @title:ModuleB
 * @author: liys
 * @date: 2019��5��7�� ����5:54:51
 * @version:1.0v
 */
class ModuleB {
	
	public void testB() {
		System.out.println("����ModuleB�е�testB����");
	}
	
}


/**
 * ��ϵͳ�е�ģ��C
 * @title:ModuleC
 * @author: liys
 * @date: 2019��5��7�� ����5:55:02
 * @version:1.0v
 */
class ModuleC {
	
	public void testC() {
		System.out.println("����ModuleC�е�testC����");
	}
	
}





