package com.prowings.oop.patterns.singleton;

public class TestLazysingleTone {
	
	public static void main(String[] args) {
		
	
	
	LazySingleton obj= LazySingleton.getInstance();
	
	LazySingleton obj1= LazySingleton.getInstance();
	
	System.out.println(obj==obj1);
	
	}
}
