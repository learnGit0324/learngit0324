package com.adam.ensubsulation.sub;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Student[] student = new Student[3];
		student[0] = new Student("��ʱ���º�ʱ��",13,"��","123-1","����","XM@mail.com");
		student[1] = new Student("С��",140,"Ů","123-2","�Ϻ�","XH@mail.com");
		student[2] = new Student("С��",15,"��","123-3","����","XL@mail.com");
		int flag = 0;
		for(int i = 0; i < student.length; i++){
			if(str.equals(student[i].getName()) 
					|| str.equals(student[i].getEmail()) 
					|| str.equals(student[i].getAddress())){
				System.out.println("�ҵ�һ��ѧ����" + student[i].getName());
				flag++;
			}
		}
		if(0 == flag){
			System.out.println("δ�ҵ���ѧ��");
		}
	}	

}
