package com.adam;

public class PersonTest2 {
	/**
	 * ��Ա������ֲ�����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ������ʹ��Person2�࣬�����Զ���ʼ������Ӧ�ĳ�Ա�������ո��Ե����ͽ��г�ʼ����eyeNum��� 0 
		System.out.println("Person2��eyeNum�����ֵ��" + Person2.eyeNum);
		//����Person2����
		Person2 p = new Person2();
		//ͨ��Person2���������p������Person2�����name���ԣ���ͨ��ʵ������eyeNum�����
		//���ﲻ�Ƽ�ʹ����Ķ��������ȥ���ʳ�Ա����������ֱ��ʹ������.��Ա����
		System.out.println("p������name����ֵ�ǣ�" + p.name+" ,p������eyeNum����ֵ�ǣ�"+p.eyeNum);
		//ֱ��Ϊname��eyeNumʵ��������ֵ
		p.name = "�����";
		p.eyeNum = 2;
		System.out.println("p������name����ֵ�ǣ�" + p.name+" ,p������eyeNum����ֵ�ǣ�"+p.eyeNum);
		//ǰ��ͨ�����ʵ��ȥ�޸���ʵ������
		System.out.println("Person2��eyeNum�����ֵ�ǣ�"+Person2.eyeNum);
		//�����µ�Person2����ȥ���ʳ�Ա����
		Person2 p2 = new Person2();
		System.out.println("p2�����eyeNum�����ֵ�ǣ�"+p2.eyeNum);
	}

}
class Person2{
	public String name;
	public static int eyeNum;
}
