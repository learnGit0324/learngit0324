package com.adam;


public class PrimitiveTransferTest {
	public static void swap(DataWrap dw){
		//将a b的值互换
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap方法里，a的值是："+ dw.a +", b的值是："+ dw.b);
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
		System.out.println("main方法里，a的值是："+ dw.a +", b的值是："+ dw.b);
	}

}

class DataWrap{
	int a;
	int b;
}
