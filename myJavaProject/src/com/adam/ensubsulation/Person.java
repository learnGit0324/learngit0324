package com.adam.ensubsulation;

public class Person {
	//使用private修饰成员变量，将这些成员变量隐藏起来
	private String name;
	private int age;
	//提供方法来操作name成员变量
	public void setName(String name){
		if(name.length() > 6 || name.length() < 2){
			System.out.println("人名长度不合格！");
			return;
		}
		else{
			this.name = name;
		}
	}
	public String getName(){
		return this.name;
	}
	//提供方法来操作age成员变量
	public void setAge(int age){
		if(age > 100 || age < 0){
			System.out.println("年龄范围不合格！");
			return;
		}
		else{
			this.age = age;
		}
	}
	public int getAge(){
		return this.age;
	}
}
