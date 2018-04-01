package com.adam;

import java.util.Arrays;

public class Num2RmbAdv2 {
	/**
	 * ��������ת��������Ҷ����ַ��� ���磺 1006.333һǧ��½Ԫ��������
	 * @param args ������
	 * @return  ����Ҷ����ַ��� 
	 */
	private String[] hanArr = {"��","Ҽ","��","��","��","��","½","��","��","��"};
	private String[] unitArr = {"ʮ","��","ǧ"};
	private String[] unitArr2 = {"��","��"};
	private static String[] arr = new String[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2RmbAdv2 nb = new Num2RmbAdv2();
		double num = 1006.103;
		arr = nb.divide(num);
		//System.out.println(Arrays.toString(nb.divide(num))); //��� [1006, 33]
		nb.toHanStr(num);
		System.out.println(nb.toHanStr(num));
	}
	/**
	 * ��һ����������ֵת��Ϊstring[]���� ��������Ԫ�طֱ�Ϊ�������ֺ�����������С������
	 * @param double num
	 * @return String [] array
	 */
	private String[] divide(double num) {
		// TODO Auto-generated method stub
		long zheng = (long) num;
		long ling = Math.round((num - zheng) * 100);
		return new String[]{zheng+"",String.valueOf(ling)};
		
	}
	/**
	 * 
	 * @param String[] ���� �����������ֺ�С������ת�����string����Ԫ��
	 * @return ����Ҷ����ַ���
	 */
	private String toHanStr(double num) {
		// TODO Auto-generated method stub
		//��һ������ת��Ϊ����Ҷ����ַ���
		String zheng = arr[0];
		//����������ֵ��ַ������� �� 1006 ����λ 4
		int zhengLen = zheng.length();
		int zhengYu = zhengLen % 4;
		//����zhengPartLen����������ֵĳ��ȿ��Է�Ϊ���飬����4λ����һ��
		int zhengPartLen = zhengYu == 0 ? zhengLen/4 : (zhengLen/4 + 1);
		int firstZhengPartLen = zhengLen - (zhengPartLen - 1) * 4;
		String resultFirstZhengPart = "";
		String resultSecondZhengPart = "";
		String resultThirdZhengPart = "";
		for(int i = 0; i < zhengPartLen; i ++){
			if(i == 0){
				//��ȡ��һ�������ַ���
				String firstPart = zheng.substring(0, firstZhengPartLen);
				//System.out.println(firstPart);
				for(int j = 0; j < firstPart.length(); j++ ){
					int number = firstPart.charAt(j) - 48;
					//����������һ�����֣��Ҳ���0����Ҫ��ӵ�λ����ǧ�������١�����ʮ����
					if(j != firstPart.length()-1 && number != 0){
						resultFirstZhengPart += hanArr[number] + unitArr[firstPart.length() - 2 - j];
					}
					//��������һ�����֣��Ҳ���0������Ҫ��ӵ�λ
					if(j == firstPart.length() -1 && number != 0){
						resultFirstZhengPart += hanArr[number];
					}
					//����м���λ������0��ֻ��Ҫ���һ��"��"�Ϳ�����
					if(j == 2 && number == 0 && firstPart.charAt(1) - 48 == 0
							&& (firstPart.charAt(0) - 48) != 0
							&& (firstPart.charAt(firstZhengPartLen-1) - 48) != 0){
						resultFirstZhengPart += hanArr[number];
					}
					
				}
//				System.out.println(resultFirstZhengPart);
			}
		}
		//��һ��С������ת��Ϊ����Ҷ����ַ���
		String ling = arr[1];
		int lingLen = ling.length();
		String resultLing = "";
		for(int i = 0; i< lingLen; i++){
			int lingNum = ling.charAt(i) - 48;
			//System.out.println(lingNum);
			//����������һλ�����Ҳ���0������Ҫ��ӵ�λ��'��','��'��
			if(i != lingLen - 1 && lingNum != 0){
				resultLing += hanArr[lingNum] + unitArr2[lingLen - 1 - i];
			}
			//��������һλ��������0������Ҫ��λ
			if(i == lingLen - 1 && lingNum != 0){
				resultLing += hanArr[lingNum] + unitArr2[lingLen - 1 - i];;
			}
			else{
				resultLing += "";
			}
		}
//		System.out.println(resultLing);
		//��������С�����ֺϲ�
		return resultFirstZhengPart + resultLing;

	}

}
