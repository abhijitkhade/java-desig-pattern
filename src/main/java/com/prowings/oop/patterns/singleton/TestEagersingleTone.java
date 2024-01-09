package com.prowings.oop.patterns.singleton;

public class TestEagersingleTone {
	
	public static void main(String[] args) {
		
	
	
	EagerSingleton obj= EagerSingleton.getInstance();
	EagerSingleton obj1= EagerSingleton.getInstance();
	

	System.out.println(obj==obj1);
}
}
