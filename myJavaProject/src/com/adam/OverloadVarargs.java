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
	//ֻ��һ�������Ĵ���ʱ�Ż�ִ�з���
	private void test(String msg) {
		// TODO Auto-generated method stub
		System.out.println("ֻ��һ���ַ���������test����" + msg);
	}
	//���Ƽ������ص�ʱ��ʹ���βθ����ɱ�ķ���
	private void test(String... books){
		System.out.println("***�βθ����ɱ��test����***");
	}

}
