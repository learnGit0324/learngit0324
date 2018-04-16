package com.adam;

public class VariableOverride {
	//定义一个name实例变量
	private String name = "Adam";
	//定义一个price类变量
	private static double price = 78.0;
	//主方法 程序入口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法里的局部变量，局部变量覆盖成员变量
		int price = 65;
		System.out.println(price); //输出 65 输出的是局部变量的值
		//使用类名作为price的限制
		System.out.println(VariableOverride.price); //输出78.0 输出的是静态成员变量的值
		new VariableOverride().info();
	}
	private void info() {
		// TODO Auto-generated method stub
		//方法里的局部变量，覆盖成员变量
		String name = "孙悟空";
		System.out.println(name);//输出 孙悟空 是方法内的局部变量的值
		System.out.println(this.name); //输出 Adam 是类实例 非静态成员变量的值
	}

}
