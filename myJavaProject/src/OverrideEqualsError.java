
public class OverrideEqualsError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println("Person�����Ƿ�equasl Dog����"+p.equals(new Dog()));
		System.out.println("Person�����Ƿ�equals String����"+p.equals(new String("hello")));
	}

}
class Person{
	//��дequals���� �ṩ�Զ������ȱ�׼
	public boolean equals(Object obj){
		//�����ж����Ƿ���true ��Person�������κζ������
		return true;
	}
}
class Dog{}