
public class StringCompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s1直接引用常量池中的"疯狂Java讲义"
		String s1 = "疯狂Java";
		String s2 = "疯狂";
		String s3 = "Java";
		//s4后面的字符串值可以再编译时就确定下来
		//s4直接引用常量池中的"疯狂Java"
		String s4 = "疯狂" +"Java";
		//s5后面的字符串值可以再编译时就确定下来
		//s5直接引用常量池中的"疯狂Java"
		String s5 = "疯" + "狂" + "Java";
		//s6后面的字符串值不能再编译时就确定，不能引用常量池中的字符串
		String s6 = s2 + s3;
		//s7引用堆内存中新创建的String对象
		String s7 = new String("疯狂Java");
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6); // false
		System.out.println(s1 == s7); // false
	}	

}
