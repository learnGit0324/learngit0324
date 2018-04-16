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
		System.out.println("心脏跳动。。。");
	}
	public void breath(){
		beat();
		System.out.println("呼吸。。。");
	}
}

class Bird {
	//将原来的父类组合到原来的子类，作为子类的一个组合部分		
	private Animal a;
	public Bird(Animal a){
		this.a = a;
	}
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("飞翔。。。");
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
		System.out.println("奔跑。。。");
	}
}