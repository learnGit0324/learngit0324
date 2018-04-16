
public class OverrideEqualsError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println("Person对象是否equasl Dog对象："+p.equals(new Dog()));
		System.out.println("Person对象是否equals String对象："+p.equals(new String("hello")));
	}

}
class Person{
	//重写equals方法 提供自定义的相等标准
	public boolean equals(Object obj){
		//不加判断总是返回true 即Person对象与任何对象都相等
		return true;
	}
}
class Dog{}