package com.adam.wrapper;

public class UnsignedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = -3;
		//��byte���͵�-3ת��Ϊ�޷������� ���253
		//-3 ��Դ�� 10000011 ���� 11111100 ���� 11111101 �޷��Ų�����1111101 253
		System.out.println("-3��Ӧ���޷���λ�������ǣ�"+Byte.toUnsignedInt(b));
		//ʹ��16���ƽ����޷�������
		int val = Integer.parseUnsignedInt("ab", 16);
		System.out.println(val); //���171
		//��-12ת��Ϊ�޷���int�ͣ���ת��Ϊ16���Ƶ��ַ���
		String str = Integer.toUnsignedString(-12,16);
		System.out.println(str); //���fffffff4
		//����������תΪ�޷����������
		System.out.println(Integer.divideUnsigned(-3, 2));
		//����������תΪ�޷����������������
		System.out.println(Integer.remainderUnsigned(3, 2));
	}

}
