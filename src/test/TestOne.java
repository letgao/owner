package test;

import one.Demo1;

public class TestOne {
	public static void main(String[] args) {
		//ʵ���������࣬�����������
		Demo1<String,Integer> demo1 = new Demo1<String, Integer>("������",20);
		demo1.showInfo(demo1.getName(), demo1.getAge());
	}
}
