package com.adam;

public class ReturnThis {
	public int age;
	public ReturnThis grow(){
		age++;
		//return this 返回调用该方法的对象
		return this;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnThis rt = new ReturnThis();
		rt.grow().grow().grow();
		System.out.println("rt的age成员变量值是：" + rt.age);
	}

}
