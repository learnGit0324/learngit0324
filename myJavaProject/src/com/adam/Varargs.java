package com.adam;

public class Varargs {
	//�����βθ����ɱ�ķ���
	public static void test(int a ,String... books){
		//books���������鴦��
		for(String book:books){
			System.out.println(book);
		}
		//�������������ֵ
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test �������ھ�̬������������ķ���������ʹ�þ�̬����ֱ�ӵ��þ�̬����
		test(5,"���Java����","������Java EE ��ҵ��Ӧ��ʵ��");
		//��Ȼ����Ҳ����ֱ�Ӵ��ݸ�test����һ��String[]���͵�����
		//�������͵��βο���λ���β���������λ�ã����Ǹ������Ա���β�ֻ��λ���β��б�����
		//��һ�����������ֻ��һ���������Ա���β�
		test(5,new String[]{"���Java����","������Java EE ��ҵ��Ӧ��ʵ��"});
	}

}
