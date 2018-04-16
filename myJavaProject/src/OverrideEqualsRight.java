
public class OverrideEqualsRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2("Adam1", "12345671");
		Person2 p2 = new Person2("Adam2", "12345672");
		Person2 p3 = new Person2("Adam3", "12345672");
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		Person2 p4 = p3;
		System.out.println(p4.equals(p3) );
		
	}

}
class Person2{
	private String name;
	private String idStr;
	public Person2(){}
	public Person2(String name, String idStr){
		this.name = name;
		this.idStr = idStr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
	//重写equals方法，自定义相等的标准
	public boolean equals(Object obj){
		//如果了两个对象为同一对象
		if(this == obj){
			return true;
		}
		//只有当obj是Person对象
		if(obj != null && obj.getClass() == Person.class){
			Person2 personObj = (Person2) obj;
			
			if(this.getIdStr().equals(personObj.getIdStr())){
			return true;
			}
		}
		return false;
	}
}