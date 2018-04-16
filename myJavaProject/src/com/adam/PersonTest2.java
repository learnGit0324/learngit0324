package com.adam;

public class PersonTest2 {
	/**
	 * 成员变量与局部变量
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一次主动使用Person2类，该类自动初始化，对应的成员变量按照各自的类型进行初始化，eyeNum输出 0 
		System.out.println("Person2的eyeNum类变量值：" + Person2.eyeNum);
		//创建Person2对象
		Person2 p = new Person2();
		//通过Person2对象的引用p来访问Person2对象的name属性，并通过实例访问eyeNum类变量
		//这里不推荐使用类的对象的引用去访问成员变量，建议直接使用类名.成员变量
		System.out.println("p变量的name变量值是：" + p.name+" ,p变量的eyeNum变量值是："+p.eyeNum);
		//直接为name和eyeNum实例变量赋值
		p.name = "孙悟空";
		p.eyeNum = 2;
		System.out.println("p变量的name变量值是：" + p.name+" ,p变量的eyeNum变量值是："+p.eyeNum);
		//前面通过类的实例去修改了实例属性
		System.out.println("Person2的eyeNum类变量值是："+Person2.eyeNum);
		//创建新的Person2对象去访问成员变量
		Person2 p2 = new Person2();
		System.out.println("p2对象的eyeNum类变量值是："+p2.eyeNum);
	}

}
class Person2{
	public String name;
	public static int eyeNum;
}
