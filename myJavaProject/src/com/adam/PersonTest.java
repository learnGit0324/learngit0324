package com.adam;

public class PersonTest {
	public static void main(String[] args) {
		//ʹ��Person�ඨ��һ��Person���͵ı���
		Person p1;
		//ͨ��new�ؼ���������Person��Ĺ�����������һ��Personʵ��
		//����Personʵ������p����
		p1 = new Person();
		p1.name ="adam";
		//�����µ�say()����������say()������ͬʱ����һ���β�
		p1.say("Javaѧϰ����Ȥ��");
		System.out.println(p1.name);
	}
}
