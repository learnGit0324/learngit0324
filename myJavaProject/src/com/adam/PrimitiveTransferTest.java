package com.adam;


public class PrimitiveTransferTest {
	public static void swap(DataWrap dw){
		//��a b��ֵ����
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap�����a��ֵ�ǣ�"+ dw.a +", b��ֵ�ǣ�"+ dw.b);
		dw = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataWrap dw = new DataWrap();
//		int a = 6;
//		int b = 9;
//		swap(a, b);
		dw.a = 6;
		dw.b = 9;
		swap(dw);
		System.out.println("main�����a��ֵ�ǣ�"+ dw.a +", b��ֵ�ǣ�"+ dw.b);
	}

}

class DataWrap{
	int a;
	int b;
}
