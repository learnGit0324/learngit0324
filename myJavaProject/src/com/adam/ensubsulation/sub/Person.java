package com.adam.ensubsulation.sub;

public class Person {
	//定义一个初始化块
	{
		int a = 6;
		if(a > 4){
			System.out.println("Person的初始化块：局部变量a的值大于4");
		}
		System.out.println("Person的初始化块");
	}
	//定义第二个初始化块
	{
		System.out.println("Person的第二个初始化块");
	}
	//Person的无参构造器
	public Person(){
		System.out.println("Person类的无参构造器");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化块 按照顺序执行 然后是构造器最后是main方法
		new Person();
	}

}
