package com.adam.wrapper;

public class Primitive2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intStr ="123";
		int it1 = Integer.parseInt(intStr);
		System.out.println(it1);
		//����ֵ�� an Integer object ����������Զ�����
		int it2 = Integer.valueOf(intStr);
		System.out.println(it2);
		//��һ���ض����ַ���ת��float����
		String floatStr ="4.56";
		float ft1 =Float.parseFloat(floatStr);
		System.out.println(ft1);
		float ft2 = Float.valueOf(floatStr);
		System.out.println(ft2);
		//��һ��float����ת����String����
		String ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		//��һ��double����ת����String����
		String dbStr = String.valueOf(3.44);
		System.out.println(dbStr);
		//��һ��boolean����ת���һ��String����
		String boolStr = String.valueOf(true);
		System.out.println(boolStr);
	}

}
