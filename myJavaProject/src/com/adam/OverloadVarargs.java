package com.adam;

public class OverloadVarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadVarargs ov = new OverloadVarargs();
		ov.test();
		ov.test("aa","bb");
		ov.test("aa");
		ov.test(new String[]{"aa"});
	}
	//只有一个参数的传入时才会执行方法
	private void test(String msg) {
		// TODO Auto-generated method stub
		System.out.println("只有一个字符串参数的test方法" + msg);
	}
	//不推荐在重载的时候使用形参个数可变的方法
	private void test(String... books){
		System.out.println("***形参个数可变的test方法***");
	}

}
