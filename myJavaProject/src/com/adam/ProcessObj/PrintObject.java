package com.adam.ProcessObj;

public class PrintObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Adam");
		//����ֱ�Ӵ�ӡ���� ���com.adam.ProcessObj.Person@15db9742
		System.out.println(p);
		System.out.println(p.toString());
	}

}
class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
}