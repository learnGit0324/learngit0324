package com.adam.wrapper;

public class WrapperClassCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = Integer.valueOf(6);
		//输出true
		System.out.println("6的包装类实例是否大于5.0"+(a > 5.0));
		//包装类的比较
		System.out.println("比较两个包装类的实例是否相等："+(Integer.valueOf(2) == Integer.valueOf(2)));
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("两个2自动装箱后是否相等："+(ina == inb));
		Integer biga = 128;
		Integer bigb = 128;
		System.out.println("两个128自动装箱后是否相等："+(biga == bigb)); //输出false
		String str =Integer.toUnsignedString(1234);
		System.out.println(str);
		//将指定的int/long型整数按指定进制转换
		System.out.println(Integer.toUnsignedString(1234, 16));
		//将指定字符串按照指定的进制解析成无符号整数
		System.out.println(Long.parseUnsignedLong("1234", 16));
		//包装类 方法 compare(x,y)参考API文档、源码
		// (x < y)? -1 : ((x == y)? 0 : 1)
		System.out.println("比较3和5是否相等:"+Integer.compare(3, 5) +
				",比较0和0是否相等:"+Integer.compare(0, 0)+",比较1和-1是否相等："+Integer.compare(1, -1));
		//compareUnsigned(x,y)将两个参数转换为无符号整数比较大小
		System.out.println(Integer.compareUnsigned(3, -3));
		//被除数不能为0
		//将参数转换为无符号的整数
		System.out.println("3除以5的商:"+Long.divideUnsigned(3, 5)
				+"0除以5的商:"+Long.divideUnsigned(0, 5)
				+"-3除以-3的商:"+Long.divideUnsigned(-3, 3));
		//remainderUnsigned(x,y) 将参数转换为无符号的整数后求余数
		System.out.println("3除以5的余数是："+Integer.remainderUnsigned(3, 5)
		+"，-4除以5的余数是："+Integer.remainderUnsigned(-4, 5)
		+"，0除以5的余数是："+Integer.remainderUnsigned(0, 5));
		System.out.println(0xffffffffL); //4294967295
		System.out.println(0xffffffffL & 0x00000005);
  	}

}
