package com.liys.example.loader;

class SuperClass {
	
	static {
		System.out.println("SuperClass init £¡");
	}
	
	public static int value = 123;
	
}

class SubClass extends SuperClass {
	
	static {
		System.out.println("subClass");
	}
	
}




public class Example01 {
	
	public static void main(String[] args) {
		System.out.println(SubClass.value);
	}
	
}
