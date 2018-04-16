package com.adam.wrapper;

public class Primitive2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intStr ="123";
		int it1 = Integer.parseInt(intStr);
		System.out.println(it1);
		//返回值是 an Integer object 这里进行了自动拆箱
		int it2 = Integer.valueOf(intStr);
		System.out.println(it2);
		//把一个特定的字符串转成float常量
		String floatStr ="4.56";
		float ft1 =Float.parseFloat(floatStr);
		System.out.println(ft1);
		float ft2 = Float.valueOf(floatStr);
		System.out.println(ft2);
		//把一个float变量转换成String常量
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		//把一个double变量转换成String常量
		String dbStr = String.valueOf(3.44);
		System.out.println(dbStr);
		//把一个boolean变量转变成一个String常量
		String boolStr = String.valueOf(true);
		System.out.println(boolStr);
	}

}
