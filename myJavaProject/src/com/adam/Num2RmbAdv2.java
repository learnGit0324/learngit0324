package com.adam;

import java.util.Arrays;

public class Num2RmbAdv2 {
	/**
	 * 注意：：输入的数字整数部分不能全都为0 否则会输出 零元
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
		double num = 0100001000.173; //当第二节全为0时 会输出 “零万” 应该不输出
		arr = nb.divide(num);
//		System.out.println(Arrays.toString(nb.divide(num))); //输出 [1006, 33]
		//nb.toHanStr(num);
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
		//System.out.println(zheng);
		//求出整数部分的字符串长度 如 1006 长度位 4
		int zhengLen = zheng.length();
		int zhengYu = zhengLen % 4;
		//利用zhengPartLen算出整数部分的长度可以分为几组，其中4位数字一组
		int zhengPartLen = zhengYu == 0 ? zhengLen/4 : (zhengLen/4 + 1);
		int firstZhengPartLen = zhengLen - (zhengPartLen - 1) * 4;
		String resultFirstZhengPart = "";
		String resultSecondZhengPart = "";
		String resultThirdZhengPart = "";
		String zhengResult = "";
		for(int i = 0; i < zhengPartLen; i++){
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
			//System.out.println(resultFirstZhengPart);
			}
			if(i == 1){
				//获取第二节中的数字字符串
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
				//如果四位数字全是0, 且第二节不是最后一节, 则只需读出一个零。   
                //Integer类的parseInt(String s)方法：将整数字符串参数解析成一个带符号的十进制整
				if(Integer.parseInt(secondPart) == 0 && zhengPartLen == 3){
					resultSecondZhengPart += hanArr[0];
				}
				//System.out.println(resultSecondZhengPart);
			}
			if(i == 2){
				//获取第三节中的字符串
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
				//如果第一节全为0
				if(resultFirstZhengPart == ""){
					zhengResult += hanArr[0] + "元";
				}
				else{
				zhengResult += resultFirstZhengPart + "元";
				}
			}
			if(zhengPartLen == 2){
				if(Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4)) == 0){
					zhengResult += resultFirstZhengPart + "万"; // bug point
				}
				else{
					zhengResult += resultFirstZhengPart + "万" + resultSecondZhengPart + "元"; 
				}
			}
			/*
			 * 此处的逻辑如何处理才能应对所有的 senario
			 */
			if(zhengPartLen == 3){ 
				//三节全为0
				if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0
						&& Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4))== 0 
						&& Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += "";
				}
				//前两节为0
				else if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0 
						&& Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4)) == 0){
					zhengResult += 	resultThirdZhengPart + "元";
				}
				//第一节 第三节为0
				else if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0
						&& Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += resultSecondZhengPart +"万";
				}
				//后两节为0
				else if(Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4))== 0 
						&& Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += resultFirstZhengPart +"亿" ;
				}
				else if(Integer.parseInt(zheng.substring(0, firstZhengPartLen)) == 0 ){
					zhengResult += resultFirstZhengPart + resultSecondZhengPart +"万"+ resultThirdZhengPart+ "元";
				}
				else if(Integer.parseInt(zheng.substring(firstZhengPartLen, firstZhengPartLen+4))== 0 ){
					zhengResult += resultFirstZhengPart +"亿"+ resultSecondZhengPart + resultThirdZhengPart+ "元";
				}
				else if(Integer.parseInt(zheng.substring(firstZhengPartLen + 4, zheng.length())) == 0){
					zhengResult += resultFirstZhengPart +"亿"+ resultSecondZhengPart +"万" + "元";
				}
				else{
					zhengResult += resultFirstZhengPart +"亿"+ resultSecondZhengPart +"万"+ resultThirdZhengPart+ "元";
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
		return zhengResult + resultLing;
	}

}
