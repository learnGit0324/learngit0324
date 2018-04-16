package com.adam.ImmutableClass;
/**
 * 缓存不可变类
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
	//使用数组来缓存已有的实例
	private static CacheImmutable[] cache
	 = new CacheImmutable[MAX_SIZE];
	//记录缓存实例在缓存中的位置,cache[pos-1]是最近缓存的实例
	private static int pos = 0;
	private final String name;
	//有参构造器
	private CacheImmutable(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public static CacheImmutable valueOf(String name){
		//便利缓存的对象
		for(int i = 0; i < MAX_SIZE; i++){
			//如果已有相同的实例，则返回该缓存的实例
			if(cache[i] != null && cache[i].getName().equals(name)){
				return cache[i];
			}
		}
		//如果缓存池已满
		if(pos == MAX_SIZE){
			//把缓存的第一个对象覆盖，即把刚生成的对象放在缓存池的最开始位置
			cache[0] = new CacheImmutable(name);
			//把pos设为1
			pos = 1;
		}else{
			//把新创建的对象缓存起来，pos加1
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