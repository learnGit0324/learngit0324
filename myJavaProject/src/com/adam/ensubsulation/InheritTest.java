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
		System.out.println("心脏跳动。。。");
	}
	public void breath(){
		beat();
		System.out.println("呼吸中。。。");
	}
}
class Bird extends Animal{
	public void fly(){
		System.out.println("自由飞翔。。。");
	}
}
class Wolf extends Animal{
	public void run(){
		System.out.println("奔跑。。。");
	}
}