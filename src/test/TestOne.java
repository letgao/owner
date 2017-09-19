package test;

import one.Demo1;

public class TestOne {
	public static void main(String[] args) {
		//实例化泛型类，定义参数类型
		Demo1<String,Integer> demo1 = new Demo1<String, Integer>("刘爱军",20);
		demo1.showInfo(demo1.getName(), demo1.getAge());
	}
}
