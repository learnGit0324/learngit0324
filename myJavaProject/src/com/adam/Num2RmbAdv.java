package com.adam;

public class Num2RmbAdv {
	private String[] hanArr = {"��","Ҽ","��","��","��","��","½","��","��","��"};
	private String[] unitArr = {"ʮ","��","ǧ"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2RmbAdv rn = new Num2RmbAdv();
		System.out.println(rn.toHanStr("236711125"));
		System.out.println(rn.toHanStr("000001010"));
		System.out.println(rn.toHanStr("000000000"));
		System.out.println(rn.toHanStr("200000000"));
		System.out.println(rn.toHanStr("002000000"));
	}
	//Ŀǰ�����λ���ֵ��ַ����ܹ�ʵ���Զ�ת����ô���ڳ�����λ������ 7λ 9λ�����������ַ����أ��� 
	//�������ǲ�֪���û�������ַ����ĳ��Ⱦ����Ƕ��پ�Ҫ������п��ܵĳ��Ƚ��з����ж� 
	/**
	 * 
	 * @param numStr
	 * @return
	 */
	private String toHanStr(String numStr) {
		// TODO Auto-generated method stub
		int strLen = numStr.length();
		//��������ַ����ĳ��ȣ����Էֽ�Ϊ���飨ÿ4λ����Ϊһ�飩
		int yu = strLen % 4;
		int partNum = yu == 0 ? strLen/4: strLen/4 + 1;
		//System.out.println(partNum);
		//firstPartLen��ʾ��һ�ڵĳ��� ���ڵ�һ��ĳ��ȿ��ܲ���4�ı��� ����Ҫ�������һ��ĳ��� �����鶼�ܱ�4����
		//�������ַ������ܳ��� ��ȥ ������ĳ��� ���ǵ�һ��ĳ��� 
		int firstPartLen = strLen - (partNum - 1) * 4;
		String resultFirst = "";
		String resultSecond = "";
		String resultThird = "";
		//һ�α��������ַ�����ÿһ��
		for(int i = 0; i < partNum; i++){
			//ת����һ��
			if(i == 0){
				//ͨ��String���substring�����������ִ�
				String firstPart = numStr.substring(0, firstPartLen);
				//������һ���е�ÿһλ����
				for(int j = 0; j < firstPartLen; j++){
					int num = firstPart.charAt(j) - 48;
					//System.out.println(num + "-" + hanArr[num]);
					//�ڱ����Ĺ����У���������������ֲ������һλ�����Ҳ���0������Ҫ��ӵ�λ('ʮ','��','ǧ')
					if(j != firstPartLen -1 && num != 0){
						resultFirst += hanArr[num] + unitArr[firstPartLen - 2 - j];
					}
					//�ڱ����Ĺ����У�������������һλ�����Ҳ���0������Ҫ��ӵ�λ
					else if(j == firstPartLen - 1 && num != 0){
						resultFirst += hanArr[num];
					}
					//�ڱ����Ĺ����У�����������м���λ���֣����Ҷ���0����ֻ��Ҫ���һ�����ġ��㡯�Ϳ���
					else if(j == 2 && num == 0 && firstPart.charAt(1) - 48 == 0
							&& firstPart.charAt(0) - 48 != 0
							&& firstPart.charAt(firstPartLen-1) - 48 != 0){
						resultFirst += hanArr[num];
					}
				}
			}
			//ת���ڶ���
			if(i == 1){
				String secondPart = numStr.substring(firstPartLen, (firstPartLen+4));
				//System.out.println(secondPart);
				int secondPartLen = secondPart.length();
				//���������е�ÿһλ����
				for(int j = 0; j < secondPartLen; j++){
					int num = secondPart.charAt(j) - 48;
					//System.out.println(num + "-" + hanArr[num]);
					if(j != secondPartLen -1 && num != 0){
						resultSecond += hanArr[num] + unitArr[secondPartLen - 2 - j];
					}
					else if(j == secondPartLen -1 && num != 0){
						resultSecond += hanArr[num];
					}
					else if(j == 2 && num == 0 && secondPart.charAt(1) - 48 == 0
//							&& secondPart.charAt(0) - 48 != 0
							&& secondPart.charAt(secondPartLen - 1) - 48 != 0){
						resultSecond += hanArr[num];
					}
				}
				//�����λ����ȫ��0, �ҵڶ��ڲ������һ��, ��ֻ�����һ���㡣   
                //Integer���parseInt(String s)�������������ַ�������������һ�������ŵ�ʮ������
				if(Integer.parseInt(secondPart) == 0 && partNum == 3){
					resultSecond += hanArr[0];
				}
			}
			//ת��������
			if(i == 2){
				String thirdPart = numStr.substring((firstPartLen+4), strLen);
				//System.out.println(thirdPart);
				int thirdPartLen = thirdPart.length();
				for(int j = 0; j < thirdPartLen; j++){
					int num = thirdPart.charAt(j) - 48;
					if(j != thirdPartLen -1 && num != 0){
						resultThird += hanArr[num] + unitArr[thirdPartLen - 2 - j];
					}
					else if(j == thirdPartLen -1 && num != 0){
						resultThird += hanArr[num];
					}
					else if(j == 2 && num == 0 && numStr.charAt(1) - 48 == 0
							&& numStr.charAt(thirdPartLen -1) - 48 != 0){
						resultThird += hanArr[num];
					}
				}
			}
		}
		String result = "";
		if(partNum == 1){
			if(resultFirst == ""){
				result = hanArr[0] + "Ԫ";
			}
			else{
				result = resultFirst + "Ԫ";
			}
		}
		if(partNum == 2){
			//����ڶ���ȫΪ0
			if(Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen+4))) == 0){
				result = resultFirst + "��";
			}
			else{
				result = resultFirst + "��" + resultSecond + "Ԫ";
			}
		}
		if(partNum == 3){
			//����ڶ��ں͵����ھ�ȫΪ0  
			if(Integer.parseInt(numStr.substring(0, firstPartLen))== 0
					&& Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen + 4)))== 0 
					&& Integer.parseInt(numStr.substring((firstPartLen+4), strLen)) == 0){
				result = hanArr[0];
			}
			//�����һ�� �ڶ���ȫΪ0
			else if(Integer.parseInt(numStr.substring(0, firstPartLen))== 0
					&& Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen + 4)))== 0){
				result = resultThird + "Ԫ";
			}
			//�����һ�� ������ȫΪ0
			else if(Integer.parseInt(numStr.substring(0, firstPartLen))== 0
					&& Integer.parseInt(numStr.substring((firstPartLen+4), strLen)) == 0){
				result =  resultSecond + "��";
			}
			//����ڶ��� ������ȫΪ0
			else if(Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen + 4)))== 0 
					&& Integer.parseInt(numStr.substring((firstPartLen+4), strLen)) == 0){
				result = resultFirst + "��";
			}
			else
			result = resultFirst + "��" + resultSecond + "��" + resultThird + "Ԫ";

		}
		return  result;
	}

}
