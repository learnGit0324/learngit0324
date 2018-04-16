package com.adam;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		Animal a2 = new Animal();
		Wolf w = new Wolf(a2);
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
		System.out.println("����������");
	}
}

class Bird {
	//��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϲ���		
	private Animal a;
	public Bird(Animal a){
		this.a = a;
	}
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("���衣����");
	}
}
class Wolf{
	private Animal a;
	public Wolf(Animal a){
		this.a = a;
	}
	public void  breath(){
		a.breath();
	}
	public void run(){
		System.out.println("���ܡ�����");
	}
}