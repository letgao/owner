package one;
/** 
 *���巺����
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
	
	//name,age��getter/setter
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
	
	//��ӷ��ͷ���
	public <T,K> void showInfo(T name,K age) {
		System.out.println("������"+this.getName()+" ���䣺"+this.getAge());
	}
}
