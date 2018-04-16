package com.adam.ensubsulation.sub;

public class Student {
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	
	public void setName(String name){
		System.out.println(name.length());
		if(name.length()>6 || name.length() < 2){
			System.out.println("name长度不符");
			return;
		}
		else{
			this.name = name;
		}

	}
	public String getName(){
		return this.name;		
	}
	public void setAge(int age){
		if(age > 120 || age < 0){
			System.out.println("age范围不符");
		}
		else{
			this.age = age;
		}
	}
	public int getAge(){
		return age;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public Student(){
		
	}
	public Student(String name, int age, String gender, String phone, String address, String email) {
//		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}
	public void eat(){
		System.out.println("Student有吃的行为");
	}
	public void drink(){
		System.out.println("Student有喝的行为");
	}
	public void play(){
		System.out.println("Student有玩的行为");
	}
	public void sleep(){
		System.out.println("Studnet有睡的行为");
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("秦时明月汉时关");
		//s.setAge(140);
		Student s1 = new Student("秦时明月汉时关",15,"男","123-3","广州","XL@mail.com");
		System.out.println(s1.name.length());
		System.out.println(s1.getName());
	}
}
