package com.adam.ImmutableClass;

public class Person {
	private final Name name;
	public Person(Name name){
//		this.name = name;
		/**
		 * 设置name实例变量为临时创建的Name对象，该对象的firstName与lastName与传入的
		 * name参数的firstName与lastName相同
		 */
		this.name = new Name(name.getFirstName(),name.getLastName());
	}
	public Name getName(){
		//返回一个匿名对象，该对象的firstName与lastName
		//与该对象里得name的firstName和lastName相同
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
	//带参数的构造器
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