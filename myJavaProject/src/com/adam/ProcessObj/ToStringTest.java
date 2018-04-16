package com.adam.ProcessObj;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple("红色",350);
		//打印Apple对象
		System.out.println(a);
	}

}
class Apple{
	private String color;
	private double weight;
	//提供有参数的构造器
	public Apple(String color, double weight){
		this.color = color;
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String toString(){
		return "一个苹果，颜色是"+color +",重量是"+ weight;
		
	}
}