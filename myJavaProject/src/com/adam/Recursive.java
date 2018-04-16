package com.adam;

public class Recursive {
	/**
	 * 已知 fn(0) = 1, fn(1) = 4, fn(n + 2) = 2 * fn(n + 1) + fn(n)
	 * 求fn(10)的值
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fn(10));
	}

	private static int fn(int i) {
		// TODO Auto-generated method stub
		if(i == 0){
			return 1;
		}
		else if(i == 1){
			return 4;
		}
		else{
			return 2 * fn(i - 1) + fn(i - 2);
		}
	}

}
