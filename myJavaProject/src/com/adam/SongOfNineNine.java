package com.adam;

public class SongOfNineNine {
	/**
	 * 使用循环输出九九乘法表
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//外层循环
		for(int i = 1; i <= 9; i++){
			//内层循环 内存循环要收到外层循环变量i的约束
			for(int j = 1; j <= i; j++){
				System.out.print(i + "*" + j + "=" +i * j +" ");
			}
			System.out.println();
		}
	}

}
