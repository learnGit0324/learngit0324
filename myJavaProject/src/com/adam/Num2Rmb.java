package com.adam;

import java.util.Arrays;

public class Num2Rmb {
	private String[] hanArr = {"��","Ҽ","��","��","��","��","½","��","��","��"};
	private String[] unitArr = {"ʮ","��","ǧ"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2Rmb rn = new Num2Rmb();
		//���Խ�һ���������ֽ�λ�������ֺ�С������
		System.out.println(Arrays.toString(rn.divide(236711125.123)));
		//���Խ�һ����λ���������ַ���ת��Ϊ�����ַ��� �� 6009 --�� ½Ǫ���
		System.out.println(rn.toHanStr("0100"));
	}
	/**
	 * ��һ����λ���������ַ���ת��Ϊ�����ַ��� �� 6009 --�� ½Ǫ���
	 * @param string ��λ���ֵ��ַ���
	 * @return ��λ���ֵ��ַ���ת���ɵĺ����ַ���
	 */
	private String toHanStr(String numStr) {
		// TODO Auto-generated method stub
		String result = "";
		int strLen = numStr.length();
		//�����ַ�����ÿһλ����
		for(int i = 0; i < strLen; i++){
			//����������char��������תΪλint�������� ����char�������͵�ASCII���int�������ʹ�48
			int num = numStr.charAt(i)-48;
			System.out.println(num + "-" + hanArr[num]);
			//�ڱ����Ĺ����У�������������ֲ������һλ�����Ҳ���0����Ҫ���ϵ�λ����ǧ�������١�����ʮ����
			if(i != strLen-1 && num != 0){
				result += hanArr[num] + unitArr[strLen - 2 - i];
			}
			//�ڱ����Ĺ����У�������������һλ���֣����Ҳ���0������Ҫ��ӵ�λ
			else if(i == strLen - 1 && num != 0 ){
				result += hanArr[num];
			}
			//�ڱ����Ĺ����У�����������м���λ����0����ֻ��Ҫ���һ����Ϳ���
			else if(i == 2 && num == 0 && numStr.charAt(1) - 48 == 0
					&& numStr.charAt(0) - 48 != 0
					&& numStr.charAt(strLen-1) - 48 != 0){
				result += hanArr[num];
			}
			
		}
		return result;
	}

	private String[] divide(double num) {
		// TODO Auto-generated method stub
		long zheng = (long)num;
		long ling = Math.round((num-zheng)*100);
		//��ô��һ������ת��λ�ַ���
		return new String[]{zheng+"",String.valueOf(ling)};
	}

}
