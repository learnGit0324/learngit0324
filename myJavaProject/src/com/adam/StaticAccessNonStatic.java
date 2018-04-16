package com.adam;

public class StaticAccessNonStatic {
	public void info(){
		System.out.println("简单的info方法");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Cannot make a static reference to the non-static method info() from the type StaticAccessNonStatic
		 */
		//因为main()方法是static方法，而info()是非静态方法
		//调用main()方法是该类本身，而不是该类的实例
		//此处省略的this无法指向有效的对象
//		info();
		//通过类的实例来访问非静态方法
		new StaticAccessNonStatic().info();
	}
}
