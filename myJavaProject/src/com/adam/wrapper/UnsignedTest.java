package com.adam.wrapper;

public class UnsignedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = -3;
		//将byte类型的-3转换为无符号整数 输出253
		//-3 的源码 10000011 反码 11111100 补码 11111101 无符号补码是1111101 253
		System.out.println("-3对应的无符号位的整数是："+Byte.toUnsignedInt(b));
		//使用16进制解析无符号整数
		int val = Integer.parseUnsignedInt("ab", 16);
		System.out.println(val); //输出171
		//将-12转换为无符号int型，在转换为16进制的字符串
		String str = Integer.toUnsignedString(-12,16);
		System.out.println(str); //输出fffffff4
		//将两个整数转为无符号整数相除
		System.out.println(Integer.divideUnsigned(-3, 2));
		//将两个整数转为无符号整数相除求余数
		System.out.println(Integer.remainderUnsigned(3, 2));
	}

}
