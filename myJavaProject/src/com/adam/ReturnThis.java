package com.adam;

public class ReturnThis {
	public int age;
	public ReturnThis grow(){
		age++;
		//return this ���ص��ø÷����Ķ���
		return this;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnThis rt = new ReturnThis();
		rt.grow().grow().grow();
		System.out.println("rt��age��Ա����ֵ�ǣ�" + rt.age);
	}

}
