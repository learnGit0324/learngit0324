package com.adam.ensubsulation;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//����age��Ա�����Ѿ������أ����������������ֱ����쳣
//		p.age = 100;
		//�������䲻����ֱ����쳣�����ǻ���ʾ���䷶Χ���ϸ�
		p.setAge(1000);
		System.out.println("δ������age��Ա����ʱ��"+p.getAge());
		//�޸�p��age��Ա����
		p.setAge(30);
		System.out.println("�ɹ�����age��Ա����ʱ��"+p.getAge());
		p.setName("Adam");
		System.out.println("�ɹ�����name��Ա����ʱ��"+p.getName());
	}

}
