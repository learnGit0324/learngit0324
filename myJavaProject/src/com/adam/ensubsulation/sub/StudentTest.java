package com.adam.ensubsulation.sub;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Student[] student = new Student[3];
		student[0] = new Student("秦时明月汉时关",13,"男","123-1","杭州","XM@mail.com");
		student[1] = new Student("小花",140,"女","123-2","上海","XH@mail.com");
		student[2] = new Student("小李",15,"男","123-3","广州","XL@mail.com");
		int flag = 0;
		for(int i = 0; i < student.length; i++){
			if(str.equals(student[i].getName()) 
					|| str.equals(student[i].getEmail()) 
					|| str.equals(student[i].getAddress())){
				System.out.println("找到一个学生：" + student[i].getName());
				flag++;
			}
		}
		if(0 == flag){
			System.out.println("未找到该学生");
		}
	}	

}
