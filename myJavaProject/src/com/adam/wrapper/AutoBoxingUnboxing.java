package com.adam.wrapper;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ���������ͱ�����ֵ��Integer����
		Integer inObj = 5;
		//��һ��boolean���ͱ�����ֵ��Object���͵ı���
		Object boolObj = true;
		//ֱ�Ӱ�һ��Integer����ֵ��int���͵ı���
		int it = inObj;
		if(boolObj instanceof Boolean){
			boolean b = (Boolean) boolObj;
			System.out.println(b);
		}
	}

}
