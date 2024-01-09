package com.prowings.BillPughSingleton;

public class TestEnumSingleton {

	

	public static void main(String[] args) {

		EnumSingleton instance1 = EnumSingleton.INSTANCE;

		instance1.setValue(10);

		EnumSingleton instance2 = EnumSingleton.INSTANCE;
		 instance2.setValue(20);


		System.out.println(instance1 == instance2);
	}
}
