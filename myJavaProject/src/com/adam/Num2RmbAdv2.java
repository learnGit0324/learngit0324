package com.adam;

import java.util.Arrays;

public class Num2RmbAdv2 {
	/**
	 * 将浮点数转换成人民币读法字符串 例如： 1006.333一千零陆元叁角叁分
	 * @param args 浮点数
	 * @return  人民币读法字符串 
	 */
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	private String[] unitArr2 = {"分","角"};
	private static String[] arr = new String[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2RmbAdv2 nb = new Num2RmbAdv2();
		double num = 1006.103;
		arr = nb.divide(num);
		//System.out.println(Arrays.toString(nb.divide(num))); //输出 [1006, 33]
		nb.toHanStr(num);
		System.out.println(nb.toHanStr(num));
	}
	/**
	 * 将一个浮点型数值转换为string[]数组 其中数组元素分别为整数部分和四舍五入后的小数部分
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
	 * @param String[] 数组 包含整数部分和小数部分转换后的string类型元素
	 * @return 人民币读法字符串
	 */
	private String toHanStr(double num) {
		// TODO Auto-generated method stub
		//将一个整数转换为人民币读法字符串
		String zheng = arr[0];
		//求出整数部分的字符串长度 如 1006 长度位 4
		int zhengLen = zheng.length();
		int zhengYu = zhengLen % 4;
		//利用zhengPartLen算出整数部分的长度可以分为几组，其中4位数字一组
		int zhengPartLen = zhengYu == 0 ? zhengLen/4 : (zhengLen/4 + 1);
		int firstZhengPartLen = zhengLen - (zhengPartLen - 1) * 4;
		String resultFirstZhengPart = "";
		String resultSecondZhengPart = "";
		String resultThirdZhengPart = "";
		for(int i = 0; i < zhengPartLen; i ++){
			if(i == 0){
				//获取第一节数字字符串
				String firstPart = zheng.substring(0, firstZhengPartLen);
				//System.out.println(firstPart);
				for(int j = 0; j < firstPart.length(); j++ ){
					int number = firstPart.charAt(j) - 48;
					//如果不是最后一个数字，且不是0，则要添加单位（‘千’，‘百’，‘十’）
					if(j != firstPart.length()-1 && number != 0){
						resultFirstZhengPart += hanArr[number] + unitArr[firstPart.length() - 2 - j];
					}
					//如果是最后一个数字，且不是0，则不需要添加单位
					if(j == firstPart.length() -1 && number != 0){
						resultFirstZhengPart += hanArr[number];
					}
					//如果中间两位数字是0，只需要输出一个"零"就可以了
					if(j == 2 && number == 0 && firstPart.charAt(1) - 48 == 0
							&& (firstPart.charAt(0) - 48) != 0
							&& (firstPart.charAt(firstZhengPartLen-1) - 48) != 0){
						resultFirstZhengPart += hanArr[number];
					}
					
				}
//				System.out.println(resultFirstZhengPart);
			}
		}
		//将一个小数部分转换为人民币读法字符串
		String ling = arr[1];
		int lingLen = ling.length();
		String resultLing = "";
		for(int i = 0; i< lingLen; i++){
			int lingNum = ling.charAt(i) - 48;
			//System.out.println(lingNum);
			//如果不是最后一位，而且不是0，则需要添加单位（'角','分'）
			if(i != lingLen - 1 && lingNum != 0){
				resultLing += hanArr[lingNum] + unitArr2[lingLen - 1 - i];
			}
			//如果是最后一位，但不是0，则不需要单位
			if(i == lingLen - 1 && lingNum != 0){
				resultLing += hanArr[lingNum] + unitArr2[lingLen - 1 - i];;
			}
			else{
				resultLing += "";
			}
		}
//		System.out.println(resultLing);
		//将整数和小数部分合并
		return resultFirstZhengPart + resultLing;

	}

}
