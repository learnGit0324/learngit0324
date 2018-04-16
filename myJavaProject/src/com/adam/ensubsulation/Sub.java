package com.adam.ensubsulation;

public class Sub extends Base{
	private String name;
	public void test(){
		System.out.println("子类重写父类的方法，" + "其name字符串的长度是" + name.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//编译会出现空指针异常，这是因为执行子类对象的初始化会先执行父类的构造器，由于父类的构造器又调用了 test()方法，而程序并不会去执行父类的这个test()方法 
		//二是子类重写的test()方法，由于子类对象是null，所以无法调用，就出现空指针异常
		Sub s = new Sub();
	}
	
}
class Base{
	public Base(){
		test();
	}

	public void test() { 
		// TODO Auto-generated method stub
		System.out.println("将被子类重写的方法");
	}
}