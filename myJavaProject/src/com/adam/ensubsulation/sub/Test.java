package com.adam.ensubsulation.sub;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Leaf();
		new Leaf();
	}

}
class Root{
	static{
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root���޲���������");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid(){
		System.out.println("Mid���޲���������");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid�Ĵ������Ĺ�������������ǣ�"+msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}
	//ͨ��super���ø�����һ�������Ĺ�����
	public Leaf(){
		super("���Java����");
		System.out.println("ִ��Leaf�Ĺ�����");
		
	}
}