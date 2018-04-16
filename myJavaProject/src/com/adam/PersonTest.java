package com.adam;

public class PersonTest {
	public static void main(String[] args) {
		//使用Person类定义一个Person类型的变量
		Person p1;
		//通过new关键字来调用Person类的构造器，返回一个Person实例
		//将该Person实例赋给p变量
		p1 = new Person();
		p1.name ="adam";
		//调用怕的say()方法，声明say()方法的同时定义一个形参
		p1.say("Java学习很有趣！");
		System.out.println(p1.name);
	}
}
