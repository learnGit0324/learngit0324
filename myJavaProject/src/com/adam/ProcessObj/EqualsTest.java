package com.adam.ProcessObj;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int it =65;
		float f1 = 65.0f;
		//�Ƚ�it��f�Ƿ���� ���true
		System.out.println("65��65.0f�Ƿ���ȣ�"+(it == f1));
		char ch ='A';
		//�Ƚ�ch��it�Ƿ���� ���true
		System.out.println("65��'A'�Ƿ���ȣ�"+(it == ch));
		String s1 = new String("hello");
		String s2 = new String("hello");
		//�Ƚ�s1��s2�Ƿ���� ���false �������͵ı���ָ����Ƕ������ڴ��еĵ�ַ
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //���true���ö���ı���ֵ���
		
	}

}
