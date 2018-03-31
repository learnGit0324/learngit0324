package com.adam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gobang {
	/**
	 * ���ö�ά������ʵ��������
	 * @param args
	 */
	//�������̴�С
	private static int BOARD_SIZE = 15;
	//��ʼ��һ����ά�������䵱����
	private String[][] board;
	//���������������ӵĳ�ʼ״̬ Ĭ�϶��� 0 ���¹����Ӻ� ״̬���ĳ�1
	private static int[][] status = new int[BOARD_SIZE][BOARD_SIZE];
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Gobang gb = new Gobang();
		//��ʼ������
		gb.initBoard();
		//��ӡ����
		gb.printBoard();
		//���ڻ�ȡ���̵����뷽��
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		int xPos;
		int yPos;
		//br.readLine() ÿ���ڼ���������һ�����ݺ󰴻س����� ����������ݽ���br��ȡ��
		while((inputStr = bf.readLine()) != null){
			//���û�������ַ����ԡ�����Ϊ�ָ�����ָ�������ַ���
			String[] posStrArr = inputStr.split(",");
			//��2���ַ���ת�����û����������
			 xPos = Integer.parseInt(posStrArr[0]);
			 yPos = Integer.parseInt(posStrArr[1]);
			if(xPos < 1 || xPos > 15 || yPos < 1 && yPos > 15){
				System.out.println("�������������������");
			}
			else{
				//�Ѷ�Ӧ��Ԫ�ظ�ֵΪ��
				gb.board[xPos - 1][yPos - 1] = "��";
				status[xPos - 1][yPos - 1] = 1;
				gb.printBoard();
			}
			
			/*
			 * ���������������������ֻ�������֣����ܳ������̷�Χ ���̵ķ�Χ�� x 1- 15 y 1 - 15
			 * ���漰��
			 * 1.�������Ч�ԣ�ֻ�������֣����ܳ������̷�Χ
			 * 2.�µ���ĵ㣬�����ظ����� // ����ж��Ѿ�����������Ѿ��¹����ӣ��� �Ƿ��������һ�� ��ʼ��״̬ ���¹����Ӻ�״̬�����ı䣬
			 * �ٴ�����ʱ�����жϸ����������״̬��������ǳ�ʼ״̬������ʾ�������Ѿ��¹�������
			 * 3.ÿ���������Ҫɨ��˭Ӯ�� //��Ҫ����������ͬ������ ��Ӧ�Ķ�Ӧ���ֲ�ͬ�ı�� �� ��  ��
			 */
			System.out.println(status[xPos - 1][yPos - 1]);
			System.out.println("�����������̵����꣬Ӧ��x,y�ĸ�ʽ��");
		}
	}

	private void printBoard() {
		// TODO Auto-generated method stub
		//��ӡÿһ������Ԫ��
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				//��ӡ����Ԫ�ز�����
				System.out.print(board[i][j]+"  ");
			}
			System.out.println("\n");
		}
	}

	private void initBoard() {
		// TODO Auto-generated method stub
		//��ʼ������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//��ÿһ������Ԫ�ظ�ֵλ������ �����ڿ���̨�ϻ�������
		for(int i = 0; i < BOARD_SIZE; i++){
			for(int j = 0; j < BOARD_SIZE; j++){
				board[i][j] = "+";
			}
		}
	}

}
