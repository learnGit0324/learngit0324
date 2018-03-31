package com.adam;

public class Num2RmbAdv {
	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
	private String[] unitArr = {"十","百","千"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2RmbAdv rn = new Num2RmbAdv();
		System.out.println(rn.toHanStr("236711125"));
		System.out.println(rn.toHanStr("000001010"));
		System.out.println(rn.toHanStr("000000000"));
		System.out.println(rn.toHanStr("200000000"));
		System.out.println(rn.toHanStr("002000000"));
	}
	//目前针对四位数字的字符串能够实现自动转换那么对于超过四位，比如 7位 9位这样的数字字符串呢？？ 
	//由于我们不知道用户输入的字符串的长度具体是多少就要针对所有可能的长度进行分类判断 
	/**
	 * 
	 * @param numStr
	 * @return
	 */
	private String toHanStr(String numStr) {
		// TODO Auto-generated method stub
		int strLen = numStr.length();
		//分析这个字符串的长度，可以分解为几组（每4位数字为一组）
		int yu = strLen % 4;
		int partNum = yu == 0 ? strLen/4: strLen/4 + 1;
		//System.out.println(partNum);
		//firstPartLen表示第一节的长度 由于第一组的长度可能不是4的倍数 所以要先求出第一组的长度 其余组都能被4整除
		//用数字字符串的总长度 减去 其余组的长度 就是第一组的长度 
		int firstPartLen = strLen - (partNum - 1) * 4;
		String resultFirst = "";
		String resultSecond = "";
		String resultThird = "";
		//一次遍历数字字符串的每一节
		for(int i = 0; i < partNum; i++){
			//转换第一节
			if(i == 0){
				//通过String类的substring方法来返回字串
				String firstPart = numStr.substring(0, firstPartLen);
				//遍历第一节中的每一位数字
				for(int j = 0; j < firstPartLen; j++){
					int num = firstPart.charAt(j) - 48;
					//System.out.println(num + "-" + hanArr[num]);
					//在遍历的过程中，如果遍历到的数字不是最后一位，而且不是0，则需要添加单位('十','百','千')
					if(j != firstPartLen -1 && num != 0){
						resultFirst += hanArr[num] + unitArr[firstPartLen - 2 - j];
					}
					//在遍历的过程中，如果遍历到最后一位，而且不是0，则不需要添加单位
					else if(j == firstPartLen - 1 && num != 0){
						resultFirst += hanArr[num];
					}
					//在遍历的过程中，如果遍历到中间两位数字，而且都是0，则只需要输出一个中文‘零’就可以
					else if(j == 2 && num == 0 && firstPart.charAt(1) - 48 == 0
							&& firstPart.charAt(0) - 48 != 0
							&& firstPart.charAt(firstPartLen-1) - 48 != 0){
						resultFirst += hanArr[num];
					}
				}
			}
			//转换第二节
			if(i == 1){
				String secondPart = numStr.substring(firstPartLen, (firstPartLen+4));
				//System.out.println(secondPart);
				int secondPartLen = secondPart.length();
				//遍历数组中的每一位数字
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
				//如果四位数字全是0, 且第二节不是最后一节, 则只需读出一个零。   
                //Integer类的parseInt(String s)方法：将整数字符串参数解析成一个带符号的十进制整
				if(Integer.parseInt(secondPart) == 0 && partNum == 3){
					resultSecond += hanArr[0];
				}
			}
			//转换第三节
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
				result = hanArr[0] + "元";
			}
			else{
				result = resultFirst + "元";
			}
		}
		if(partNum == 2){
			//如果第二节全为0
			if(Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen+4))) == 0){
				result = resultFirst + "万";
			}
			else{
				result = resultFirst + "万" + resultSecond + "元";
			}
		}
		if(partNum == 3){
			//如果第二节和第三节均全为0  
			if(Integer.parseInt(numStr.substring(0, firstPartLen))== 0
					&& Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen + 4)))== 0 
					&& Integer.parseInt(numStr.substring((firstPartLen+4), strLen)) == 0){
				result = hanArr[0];
			}
			//如果第一节 第二节全为0
			else if(Integer.parseInt(numStr.substring(0, firstPartLen))== 0
					&& Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen + 4)))== 0){
				result = resultThird + "元";
			}
			//如果第一节 第三节全为0
			else if(Integer.parseInt(numStr.substring(0, firstPartLen))== 0
					&& Integer.parseInt(numStr.substring((firstPartLen+4), strLen)) == 0){
				result =  resultSecond + "万";
			}
			//如果第二节 第三节全为0
			else if(Integer.parseInt(numStr.substring(firstPartLen, (firstPartLen + 4)))== 0 
					&& Integer.parseInt(numStr.substring((firstPartLen+4), strLen)) == 0){
				result = resultFirst + "亿";
			}
			else
			result = resultFirst + "亿" + resultSecond + "万" + resultThird + "元";

		}
		return  result;
	}

}
