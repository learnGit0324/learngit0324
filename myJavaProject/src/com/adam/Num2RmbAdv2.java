package com.adam;

import java.util.Arrays;

public class Num2RmbAdv2 {
	/**
	 * ע�⣺������������������ֲ���ȫ��Ϊ0 �������� ��Ԫ
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
		double num = 0100001000.173; //���ڶ���ȫΪ0ʱ ����� ������ Ӧ�ò����
		arr = nb.divide(num);
//		System.out.println(Arrays.toString(nb.divide(num))); //��� [1006, 33]
		//nb.toHanStr(num);
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
		//System.out.println(zheng);
		//����������ֵ��ַ������� �� 1006 ����λ 4
		int zhengLen = zheng.length();
		int zhengYu = zhengLen % 4;
		//����zhengPartLen����������ֵĳ��ȿ��Է�Ϊ���飬����4λ����һ��
		int zhengPartLen = zhengYu == 0 ? zhengLen/4 : (zhengLen/4 + 1);
		int firstZhengPartLen = zhengLen - (zhengPartLen - 1) * 4;
		String resultFirstZhengPart = "";
		String resultSecondZhengPart = "";
		String resultThirdZhengPart = "";
		String zhengResult = "";
		for(int i = 0; i < zhengPartLen; i++){
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
			//System.out.println(resultFirstZhengPart);
			}
			if(i == 1){
				//��ȡ�ڶ����е������ַ���
				String secondPart = zheng.substring(firstZhengPartLen, (firstZhengPartLen+4));
				for(int k = 0; k < secondPart.length(); k++){
					int number = secondPart.charAt(k) - 48;
//					System.out.print(number);
					if( k != secondPart.length() - 1 && number != 0){
						resultSecondZhengPart += hanArr[number] + unitArr[secondPart.length() - 2 -k];
					}
					if( k == secondPart.length() - 1 && number != 0){
						resultSecondZhengPart += hanArr[number];
					}
					if(k == 2 && number == 0 && secondPart.charAt(0) - 48 == 0
							&& secondPart.charAt(secondPart.length() - 1) - 48 != 0){
						resultSecondZhengPart += hanArr[number];
					}
				}
				//�����λ����ȫ��0, �ҵڶ��ڲ������һ��, ��ֻ�����һ���㡣   
                //Integer���parseInt(String s)�������������ַ�������������һ�������ŵ�ʮ������
				if(Integer.parseInt(secondPart) == 0 && zhengPartLen == 3){
					resultSecondZhengPart += hanArr[0];
				}
				//System.out.println(resultSecondZhengPart);
			}
			if(i == 2){
				//��ȡ�������е��ַ���
				String thirdPart = zheng.substring(firstZhengPartLen + 4, zhengLen);
				for(int l = 0; l < thirdPart.length(); l++){
					int number = thirdPart.charAt(l) - 48;
					if(l != thirdPart.length()-1 && number != 0){
						resultThirdZhengPart += hanArr[number] + unitArr[thirdPart.length() - 2 -l];
					}
					if(l == thirdPart.length()-1 && number != 0){
						resultThirdZhengPart += hanArr[number];
					}
					if(l == 2 && number == 0 && thirdPart.charAt(0) - 48 == 0
							&& thirdPart.charAt(thirdPart.length()-1) - 48 != 0){
						resultThirdZhengPart += hanArr[number];
					}
				}
				//System.out.println(resultThirdZhengPart);
			}
		}
			if(zhengPartLen == 1){
				//�����һ��ȫΪ0
				if(resultFirstZhengPart == ""){
					zhengResult += hanArr[0] + "Ԫ";
				}
				else{
				zhengResult += resultFirstZhengPart + "Ԫ";
				}
			}
			if(zhengPartLen == 2){
				if(Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4)) == 0){
					zhengResult += resultFirstZhengPart + "��"; // bug point
				}
				else{
					zhengResult += resultFirstZhengPart + "��" + resultSecondZhengPart + "Ԫ"; 
				}
			}
			/*
			 * �˴����߼���δ������Ӧ�����е� senario
			 */
			if(zhengPartLen == 3){ 
				//����ȫΪ0
				if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0
						&& Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4))== 0 
						&& Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += "";
				}
				//ǰ����Ϊ0
				else if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0 
						&& Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4)) == 0){
					zhengResult += 	resultThirdZhengPart + "Ԫ";
				}
				//��һ�� ������Ϊ0
				else if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0
						&& Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += resultSecondZhengPart +"��";
				}
				//������Ϊ0
				else if(Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4))== 0 
						&& Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += resultFirstZhengPart +"��" ;
				}
				else if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0 ){
					zhengResult += resultFirstZhengPart + resultSecondZhengPart +"��"+ resultThirdZhengPart+ "Ԫ";
				}
				else if(Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4))== 0 ){
					zhengResult += resultFirstZhengPart +"��"+ resultSecondZhengPart + resultThirdZhengPart+ "Ԫ";
				}
				else if(Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += resultFirstZhengPart +"��"+ resultSecondZhengPart +"��" + "Ԫ";
				}
				else{
					zhengResult += resultFirstZhengPart +"��"+ resultSecondZhengPart +"��"+ resultThirdZhengPart+ "Ԫ";
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
		return zhengResult + resultLing;
	}

}
