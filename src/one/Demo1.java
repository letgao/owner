package one;
/** 
 *定义泛型类
 */
public class Demo1<T,K> {
	private T name;
	private K age;
	public Demo1() {
		
	}
	public Demo1(T name,K age) {
		this.name = name;
		this.age  = age;
	}
	
	//name,age的getter/setter
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public K getAge() {
		return age;
	}
	public void setAge(K age) {
		this.age = age;
	}
	
	//添加泛型方法
	public <T,K> void showInfo(T name,K age) {
		System.out.println("姓名："+this.getName()+" 年龄："+this.getAge());
	}
}
