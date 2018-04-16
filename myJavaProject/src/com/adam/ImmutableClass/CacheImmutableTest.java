package com.adam.ImmutableClass;
/**
 * ���治�ɱ���
 * @author zhaoj
 * @version 1.0
 *
 */
public class CacheImmutableTest {
	public static void main(String[] args) {
		CacheImmutable ci1 = CacheImmutable.valueOf("hello");
		CacheImmutable ci2 = CacheImmutable.valueOf("hello");
		System.out.println(ci1 == ci2);
  	}
}
class CacheImmutable{
	private static int MAX_SIZE = 10;
	//ʹ���������������е�ʵ��
	private static CacheImmutable[] cache
	 = new CacheImmutable[MAX_SIZE];
	//��¼����ʵ���ڻ����е�λ��,cache[pos-1]����������ʵ��
	private static int pos = 0;
	private final String name;
	//�вι�����
	private CacheImmutable(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public static CacheImmutable valueOf(String name){
		//��������Ķ���
		for(int i = 0; i < MAX_SIZE; i++){
			//���������ͬ��ʵ�����򷵻ظû����ʵ��
			if(cache[i] != null && cache[i].getName().equals(name)){
				return cache[i];
			}
		}
		//������������
		if(pos == MAX_SIZE){
			//�ѻ���ĵ�һ�����󸲸ǣ����Ѹ����ɵĶ�����ڻ���ص��ʼλ��
			cache[0] = new CacheImmutable(name);
			//��pos��Ϊ1
			pos = 1;
		}else{
			//���´����Ķ��󻺴�������pos��1
			cache[pos++] =  new CacheImmutable(name);
		}
		return cache[pos - 1];
	}
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj != null && obj.getClass() == CacheImmutable.class){
			CacheImmutable ci = (CacheImmutable) obj;
			return name.equals(ci.getName());
		}
		return false;	
	}
	public int hashCode(){
		return name.hashCode();
	}
}