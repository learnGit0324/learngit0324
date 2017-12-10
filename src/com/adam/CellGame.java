package com.adam;

public class CellGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("绘制Cell");
		Cell cell = new Cell();
		cell.row=15;
		cell.clo=6;
//		printCell(cell);
		
		//drop
		cell.drop();
		printCell(cell);
		//move
		cell.moveLeft(2);
		printCell(cell);
	}

	private static void printCell(Cell cell) {
		// TODO Auto-generated method stub
		int totalRow =20;
		int totalClo =10;
		
		//打印场地
		for(int row=0;row<totalRow;row++){
			for(int clo=0;clo<totalClo;clo++){
				if(cell.row==row && cell.clo==clo){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
	}

}
