package com.adam.ProcessObj;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple("��ɫ",350);
		//��ӡApple����
		System.out.println(a);
	}

}
class Apple{
	private String color;
	private double weight;
	//�ṩ�в����Ĺ�����
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
		return "һ��ƻ������ɫ��"+color +",������"+ weight;
		
	}
}