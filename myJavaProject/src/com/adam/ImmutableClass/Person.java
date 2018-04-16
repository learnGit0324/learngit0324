package com.adam.ImmutableClass;

public class Person {
	private final Name name;
	public Person(Name name){
//		this.name = name;
		/**
		 * ����nameʵ������Ϊ��ʱ������Name���󣬸ö����firstName��lastName�봫���
		 * name������firstName��lastName��ͬ
		 */
		this.name = new Name(name.getFirstName(),name.getLastName());
	}
	public Name getName(){
		//����һ���������󣬸ö����firstName��lastName
		//��ö������name��firstName��lastName��ͬ
		return new Name(name.getFirstName(),name.getLastName());
	}
	public static void main(String[] args) {
		Name name = new Name("Wukong", "Sun");
		name.setFirstName("Bazei");
		Person person = new Person(name);
		System.out.println(person.getName().getFirstName());
		name.setFirstName("Shasheng");
		System.out.println(person.getName().getFirstName());
		
	}
}

class Name{
	private String firstName;
	private String lastName;
	//�������Ĺ�����
	public Name(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//setter and getter methods
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}