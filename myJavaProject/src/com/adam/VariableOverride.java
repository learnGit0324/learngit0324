package com.adam;

public class VariableOverride {
	//����һ��nameʵ������
	private String name = "Adam";
	//����һ��price�����
	private static double price = 78.0;
	//������ �������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ľֲ��������ֲ��������ǳ�Ա����
		int price = 65;
		System.out.println(price); //��� 65 ������Ǿֲ�������ֵ
		//ʹ��������Ϊprice������
		System.out.println(VariableOverride.price); //���78.0 ������Ǿ�̬��Ա������ֵ
		new VariableOverride().info();
	}
	private void info() {
		// TODO Auto-generated method stub
		//������ľֲ����������ǳ�Ա����
		String name = "�����";
		System.out.println(name);//��� ����� �Ƿ����ڵľֲ�������ֵ
		System.out.println(this.name); //��� Adam ����ʵ�� �Ǿ�̬��Ա������ֵ
	}

}
