package com.adam.ensubsulation;

public class Sub extends Base{
	private String name;
	public void test(){
		System.out.println("������д����ķ�����" + "��name�ַ����ĳ�����" + name.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ֿ�ָ���쳣��������Ϊִ���������ĳ�ʼ������ִ�и���Ĺ����������ڸ���Ĺ������ֵ����� test()�����������򲢲���ȥִ�и�������test()���� 
		//����������д��test()�������������������null�������޷����ã��ͳ��ֿ�ָ���쳣
		Sub s = new Sub();
	}
	
}
class Base{
	public Base(){
		test();
	}

	public void test() { 
		// TODO Auto-generated method stub
		System.out.println("����������д�ķ���");
	}
}