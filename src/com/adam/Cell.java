package com.adam;

public class Cell {
	int row;
	int clo;
	
	public void drop(){
		row++;
	}
	
	public void moveLeft(int d){
		clo-=d;
	}
	
	public void moveRight(int d){
		clo+=d;
	}
	
	public String getCellInfo(){
		return row +","+clo;
		
	}
}
