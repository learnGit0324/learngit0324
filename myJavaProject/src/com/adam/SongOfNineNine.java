package com.adam;

public class SongOfNineNine {
	/**
	 * ʹ��ѭ������žų˷���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ѭ��
		for(int i = 1; i <= 9; i++){
			//�ڲ�ѭ�� �ڴ�ѭ��Ҫ�յ����ѭ������i��Լ��
			for(int j = 1; j <= i; j++){
				System.out.print(i + "*" + j + "=" +i * j +" ");
			}
			System.out.println();
		}
	}

}
