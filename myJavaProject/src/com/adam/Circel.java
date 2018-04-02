package com.adam;

public class Circel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circel c = new Circel();
		int rad = 8;
		c.paint(rad);
	}

	private void paint(int rad) {
		// TODO Auto-generated method stub
		//String[][] arr = new String[rad * 2 + 1][rad * 2 + 1]; 数组没有用处
		for(int i = 0; i < rad * 2 + 1; i++){
			for(int j = 0; j < rad * 2 + 1; j++){
				//arr[i][j] = initArr(i, j, rad);
				String adot = initArr(i, j, rad);
				System.out.print(adot);
			}
			System.out.println(" ");
		}
		
	}

	private String initArr(int i, int j, int rad) {
		// TODO Auto-generated method stub
		double pes = 0.1;
		String result ="";
		if(Math.abs(Math.sqrt(Math.pow((i - rad), 2) + Math.pow((j - rad), 2)) - rad) < pes){
			result = "*";
		}
		else if(i == rad && j == rad){
			result = ". ";
		}
		else{
			result = "  ";
		}
		return result;
	}

}
