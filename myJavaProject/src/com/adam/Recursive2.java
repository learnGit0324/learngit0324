package com.adam;

public class Recursive2 {
	/**
	 * 已知f(20) = 1, fn(21) = 4, f(n+2) = 2*fn(n+1) + fn(n)
	 * 求fn(10)的值
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fn(10));
	}

	private static int fn(int i) {
		// TODO Auto-generated method stub
		if(i == 20){
			return 1;
		}
		else if(i == 21){
			return 4;
		}
		else{
			return fn(i + 2) - 2 * fn(i + 1);
		}
	}

}
