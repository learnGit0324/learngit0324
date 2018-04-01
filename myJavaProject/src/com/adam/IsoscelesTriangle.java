package com.adam;

public class IsoscelesTriangle {
	/**
	 * 使用循环输出打印等腰三角形
	 * @param args 给定等腰三角形 4 则打印如下图形
	 * 	 *		*
	 * 	 * 	   ***
	 * 	 * 	  *****
	 * 	 * 	 *******
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int high = 5;
		for(int i = 1; i < high; i++){
			//循环打印空格" "
			for(int j = 1; j < high - i; j++ ){
				System.out.print(" ");
				//循环打印星星 “*”
			}
			for(int k = 1; k <= 2*i -1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
