package com.adam.ensubsulation.sub;

public class Person {
	//����һ����ʼ����
	{
		int a = 6;
		if(a > 4){
			System.out.println("Person�ĳ�ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	//����ڶ�����ʼ����
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	//Person���޲ι�����
	public Person(){
		System.out.println("Person����޲ι�����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ���� ����˳��ִ�� Ȼ���ǹ����������main����
		new Person();
	}

}
