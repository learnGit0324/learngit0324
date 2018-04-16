package com.adam.ensubsulation.sub;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Leaf();
		new Leaf();
	}

}
class Root{
	static{
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root(){
		System.out.println("Root的无参数构造器");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	public Mid(){
		System.out.println("Mid的无参数构造器");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid的带参数的构造器，其参数是："+msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	//通过super调用父类有一个参数的构造器
	public Leaf(){
		super("疯狂Java讲义");
		System.out.println("执行Leaf的构造器");
		
	}
}