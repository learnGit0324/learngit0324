package com.adam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang {
	/**
	 * 利用二维数组来实现五子棋
	 * @param args
	 */
	//定义棋盘大小
	private static int BOARD_SIZE = 15;
	//初始化一个二维数组来充当棋盘
	private String[][] board;
	//设置棋盘坐标棋子的初始状态 默认都是 0 当下过棋子后 状态被改成1
	private static int[][] status = new int[BOARD_SIZE][BOARD_SIZE];
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Gobang gb = new Gobang();
		//初始化棋盘
		gb.initBoard();
		//打印棋盘
		gb.printBoard();
		//用于获取键盘的输入方法
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		int xPos;
		int yPos;
		//br.readLine() 每当在键盘上输入一行内容后按回车键， 刚输入的内容将被br读取到
		while((inputStr = bf.readLine()) != null){
			//将用户输入的字符串以‘，’为分割符，分割成两个字符串
			String[] posStrArr = inputStr.split(",");
			//将2个字符串转换成用户下棋的坐标
			 xPos = Integer.parseInt(posStrArr[0]);
			 yPos = Integer.parseInt(posStrArr[1]);
			if(xPos < 1 || xPos > 15 || yPos < 1 && yPos > 15){
				System.out.println("您输入的棋盘坐标有误！");
			}
			else{
				//把对应的元素赋值为●
				gb.board[xPos - 1][yPos - 1] = "●";
				status[xPos - 1][yPos - 1] = 1;
				gb.printBoard();
			}
			
			/*
			 * 电脑随机生成两个整数，只能是数字，不能超出棋盘范围 棋盘的范围在 x 1- 15 y 1 - 15
			 * 还涉及：
			 * 1.坐标的有效性，只能是数字，不能超出棋盘范围
			 * 2.下的棋的点，不能重复下棋 // 如何判断已经输入的坐标已经下过棋子？？ 是否可以设置一个 初始的状态 当下过棋子后状态发生改变，
			 * 再次下棋时，先判断该棋子坐标的状态，如果不是初始状态，就提示该坐标已经下过棋子了
			 * 3.每次下棋后需要扫描谁赢了 //需要捕获两个不同的输入 相应的对应两种不同的标记 ▲ 和  ●
			 */
			System.out.println(status[xPos - 1][yPos - 1]);
			System.out.println("请您输入棋盘的坐标，应以x,y的格式：");
		}
	}

	private void printBoard() {
		// TODO Auto-generated method stub
		//打印每一个数组元素
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				//打印数组元素不换行
				System.out.print(board[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}

	private void initBoard() {
		// TODO Auto-generated method stub
		//初始化棋盘
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//把每一个数组元素赋值位”＋“ 用于在控制台上画出棋盘
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				board[i][j] = "+";
			}
		}
	}

}
