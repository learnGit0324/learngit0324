package com.adam.ensubsulation;

public class Person {
	//ʹ��private���γ�Ա����������Щ��Ա������������
	private String name;
	private int age;
	//�ṩ����������name��Ա����
	public void setName(String name){
		if(name.length() > 6 || name.length() < 2){
			System.out.println("�������Ȳ��ϸ�");
			return;
		}
		else{
			this.name = name;
		}
	}
	public String getName(){
		return this.name;
	}
	//�ṩ����������age��Ա����
	public void setAge(int age){
		if(age > 100 || age < 0){
			System.out.println("���䷶Χ���ϸ�");
			return;
		}
		else{
			this.age = age;
		}
	}
	public int getAge(){
		return this.age;
	}
}
