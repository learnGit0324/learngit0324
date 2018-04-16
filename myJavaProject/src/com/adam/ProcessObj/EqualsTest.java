package com.adam.ProcessObj;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int it =65;
		float f1 = 65.0f;
		//比较it和f是否相等 输出true
		System.out.println("65和65.0f是否相等："+(it == f1));
		char ch ='A';
		//比较ch和it是否相等 输出true
		System.out.println("65和'A'是否相等："+(it == ch));
		String s1 = new String("hello");
		String s2 = new String("hello");
		//比较s1和s2是否相等 输出false 引用类型的变量指向的是对象在内存中的地址
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //输出true引用对象的变量值相等
		
	}

}
