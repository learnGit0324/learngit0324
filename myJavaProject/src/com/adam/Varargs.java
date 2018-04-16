package com.adam;

public class Varargs {
	//定义形参个数可变的方法
	public static void test(int a ,String... books){
		//books被当成数组处理
		for(String book:books){
			System.out.println(book);
		}
		//输出整数变量的值
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 方法属于静态方法，属于类的方法，可以使用静态方法直接调用静态方法
		test(5,"疯狂Java讲义","轻量级Java EE 企业级应用实践");
		//当然我们也可以直接传递给test方法一个String[]类型的数组
		//数组类型的形参可以位于形参类标的任意位置，但是个数可以变得形参只能位于形参列表的最后
		//即一个方法中最多只有一个个数可以变的形参
		test(5,new String[]{"疯狂Java讲义","轻量级Java EE 企业级应用实践"});
	}

}
