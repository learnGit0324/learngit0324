
public class StringCompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s1ֱ�����ó������е�"���Java����"
		String s1 = "���Java";
		String s2 = "���";
		String s3 = "Java";
		//s4������ַ���ֵ�����ٱ���ʱ��ȷ������
		//s4ֱ�����ó������е�"���Java"
		String s4 = "���" +"Java";
		//s5������ַ���ֵ�����ٱ���ʱ��ȷ������
		//s5ֱ�����ó������е�"���Java"
		String s5 = "��" + "��" + "Java";
		//s6������ַ���ֵ�����ٱ���ʱ��ȷ�����������ó������е��ַ���
		String s6 = s2 + s3;
		//s7���ö��ڴ����´�����String����
		String s7 = new String("���Java");
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s1 == s6); // false
		System.out.println(s1 == s7); // false
	}	

}
