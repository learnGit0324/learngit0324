package com.adam.wrapper;

public class WrapperClassCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = Integer.valueOf(6);
		//���true
		System.out.println("6�İ�װ��ʵ���Ƿ����5.0"+(a > 5.0));
		//��װ��ıȽ�
		System.out.println("�Ƚ�������װ���ʵ���Ƿ���ȣ�"+(Integer.valueOf(2) == Integer.valueOf(2)));
		Integer ina = 2;
		Integer inb = 2;
		System.out.println("����2�Զ�װ����Ƿ���ȣ�"+(ina == inb));
		Integer biga = 128;
		Integer bigb = 128;
		System.out.println("����128�Զ�װ����Ƿ���ȣ�"+(biga == bigb)); //���false
		String str =Integer.toUnsignedString(1234);
		System.out.println(str);
		//��ָ����int/long��������ָ������ת��
		System.out.println(Integer.toUnsignedString(1234, 16));
		//��ָ���ַ�������ָ���Ľ��ƽ������޷�������
		System.out.println(Long.parseUnsignedLong("1234", 16));
		//��װ�� ���� compare(x,y)�ο�API�ĵ���Դ��
		// (x < y)? -1 : ((x == y)? 0 : 1)
		System.out.println("�Ƚ�3��5�Ƿ����:"+Integer.compare(3, 5) +
				",�Ƚ�0��0�Ƿ����:"+Integer.compare(0, 0)+",�Ƚ�1��-1�Ƿ���ȣ�"+Integer.compare(1, -1));
		//compareUnsigned(x,y)����������ת��Ϊ�޷��������Ƚϴ�С
		System.out.println(Integer.compareUnsigned(3, -3));
		//����������Ϊ0
		//������ת��Ϊ�޷��ŵ�����
		System.out.println("3����5����:"+Long.divideUnsigned(3, 5)
				+"0����5����:"+Long.divideUnsigned(0, 5)
				+"-3����-3����:"+Long.divideUnsigned(-3, 3));
		//remainderUnsigned(x,y) ������ת��Ϊ�޷��ŵ�������������
		System.out.println("3����5�������ǣ�"+Integer.remainderUnsigned(3, 5)
		+"��-4����5�������ǣ�"+Integer.remainderUnsigned(-4, 5)
		+"��0����5�������ǣ�"+Integer.remainderUnsigned(0, 5));
		System.out.println(0xffffffffL); //4294967295
		System.out.println(0xffffffffL & 0x00000005);
  	}

}
