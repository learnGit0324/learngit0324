package com.adam;

import java.util.Arrays;

public class Num2Rmb {
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2Rmb rn = new Num2Rmb();
		//测试将一个浮点数分解位整数部分和小数部分
		System.out.println(Arrays.toString(rn.divide(236711125.123)));
		//测试将一个四位数的数字字符串转换为汉字字符串 如 6009 --》 陆仟零玖
		System.out.println(rn.toHanStr("0100"));
	}
	/**
	 * 将一个四位数的数字字符串转换为汉字字符串 如 6009 --》 陆仟零玖
	 * @param string 四位数字的字符串
	 * @return 四位数字的字符串转换成的汉字字符串
	 */
	private String toHanStr(String numStr) {
		// TODO Auto-generated method stub
		String result = "";
		int strLen = numStr.length();
		//遍历字符串的每一位数字
		for(int i = 0; i < strLen; i++){
			//将遍历到的char数字类型转为位int数字类型 这里char数字类型的ASCII码比int数字类型大48
			int num = numStr.charAt(i)-48;
			System.out.println(num + "-" + hanArr[num]);
			//在遍历的过程中，如果遍历到数字不是最后一位，而且不是0，则要加上单位（‘千’，‘百’，‘十’）
			if(i != strLen-1 && num != 0){
				result += hanArr[num] + unitArr[strLen - 2 - i];
			}
			//在遍历的过程中，如果遍历到最后一位数字，而且不是0，则不需要添加单位
			else if(i == strLen - 1 && num != 0 ){
				result += hanArr[num];
			}
			//在遍历的过程中，如果遍历到中间两位都是0，则只需要输出一个零就可以
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
		//怎么把一个整数转换位字符串
		return new String[]{zheng+"",String.valueOf(ling)};
	}

}
