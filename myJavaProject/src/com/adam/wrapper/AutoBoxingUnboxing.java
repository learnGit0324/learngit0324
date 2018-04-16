package com.adam.wrapper;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//把一个基本类型变量赋值给Integer对象
		Integer inObj = 5;
		//把一个boolean类型变量赋值给Object类型的变量
		Object boolObj = true;
		//直接把一个Integer对象赋值给int类型的变量
		int it = inObj;
		if(boolObj instanceof Boolean){
			boolean b = (Boolean) boolObj;
			System.out.println(b);
		}
	}

}
