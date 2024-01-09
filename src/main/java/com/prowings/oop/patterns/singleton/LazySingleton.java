package com.prowings.oop.patterns.singleton;

public class LazySingleton {
	
	
	
	public static LazySingleton instance = null;

	private LazySingleton()
	{
		// since this is a private constructor.. only accessible in this class
	}

	public static LazySingleton getInstance()
	{
		if(instance == null)
		{
			instance = new LazySingleton();
		}
		return instance;
	}

}
