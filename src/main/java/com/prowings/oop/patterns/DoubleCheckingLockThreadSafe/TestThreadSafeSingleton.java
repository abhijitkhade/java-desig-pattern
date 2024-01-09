package com.prowings.oop.patterns.DoubleCheckingLockThreadSafe;

public class TestThreadSafeSingleton {

	public static void main(String[] args) {

		
		 DoubleCheckingLockThreadSafeSingleton instance= new DoubleCheckingLockThreadSafeSingleton();
		 DoubleCheckingLockThreadSafeSingleton instance1= new DoubleCheckingLockThreadSafeSingleton();

	
		 System.out.println(instance==instance1);
	}

}
