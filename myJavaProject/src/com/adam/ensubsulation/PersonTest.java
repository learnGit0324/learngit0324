package com.adam.ensubsulation;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//由于age成员变量已经被隐藏，所以下面的语句会出现编译异常
//		p.age = 100;
		//下面的语句不会出现编译异常，但是会提示年龄范围不合格
		p.setAge(1000);
		System.out.println("未能设置age成员变量时："+p.getAge());
		//修改p的age成员变量
		p.setAge(30);
		System.out.println("成功设置age成员变量时："+p.getAge());
		p.setName("Adam");
		System.out.println("成功设置name成员变量时："+p.getName());
	}

}
