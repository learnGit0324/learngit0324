package com.adam;

public class ThisInConstructor {
	//����һ����Ϊfoo�ĳ�Ա����
	public int foo;
	public ThisInConstructor(){
		//�ڹ������ж���һ��foo�ľֲ�����
		int foo = 0;
		//ʹ��this����ù��������ڳ�ʼ���Ķ���
		//����Ĵ��뽫��Ѹù��������ڳ�ʼ���Ķ���foo��Ա������Ϊ6
		this.foo = 6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ʹ��ThisInConstructor�����Ķ����foo��Ա������������Ϊ6
		System.out.println(new ThisInConstructor().foo);
	}

}
