package com.adam;

public class StaticAccessNonStatic {
	public void info(){
		System.out.println("�򵥵�info����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Cannot make a static reference to the non-static method info() from the type StaticAccessNonStatic
		 */
		//��Ϊmain()������static��������info()�ǷǾ�̬����
		//����main()�����Ǹ��౾�������Ǹ����ʵ��
		//�˴�ʡ�Ե�this�޷�ָ����Ч�Ķ���
//		info();
		//ͨ�����ʵ�������ʷǾ�̬����
		new StaticAccessNonStatic().info();
	}
}
