package com.adam;

public class IsoscelesTriangle {
	/**
	 * ʹ��ѭ�������ӡ����������
	 * @param args �������������� 4 ���ӡ����ͼ��
	 * 	 *		*
	 * 	 * 	   ***
	 * 	 * 	  *****
	 * 	 * 	 *******
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int high = 5;
		for(int i = 1; i < high; i++){
			//ѭ����ӡ�ո�" "
			for(int j = 1; j < high - i; j++ ){
				System.out.print(" ");
				//ѭ����ӡ���� ��*��
			}
			for(int k = 1; k <= 2*i -1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
