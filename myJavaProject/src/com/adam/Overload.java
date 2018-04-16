package com.adam;

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ol = new Overload();
		ol.test();
		ol.test("hello");
	}

	private void test(String msg) {
		// TODO Auto-generated method stub
		System.out.println("有参数的方法重载"+ msg);
	}

	private void test() {
		// TODO Auto-generated method stub
		test("world");
		System.out.println("无参数的方法重载");
	}

}
