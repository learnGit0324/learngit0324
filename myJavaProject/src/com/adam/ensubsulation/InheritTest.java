package com.adam.ensubsulation;


public class InheritTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new Bird();
		b.breath();
		b.fly();
		Wolf w = new Wolf();
		w.breath();
		w.run();
	}

}
class Animal{
	private void beat(){
		System.out.println("��������������");
	}
	public void breath(){
		beat();
		System.out.println("�����С�����");
	}
}
class Bird extends Animal{
	public void fly(){
		System.out.println("���ɷ��衣����");
	}
}
class Wolf extends Animal{
	public void run(){
		System.out.println("���ܡ�����");
	}
}