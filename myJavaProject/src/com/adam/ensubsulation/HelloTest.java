package com.adam.ensubsulation;

import com.adam.ensubsulation.sub.Apple;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//直接访问相同包下的另一个类，无需使用包前缀
		Hello h = new Hello();
		//对于不在同一个包下的类，访问时就须import该类的全名
		Apple a = new Apple();
	}

}
