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
		System.out.println("�в����ķ�������"+ msg);
	}

	private void test() {
		// TODO Auto-generated method stub
		test("world");
		System.out.println("�޲����ķ�������");
	}

}
