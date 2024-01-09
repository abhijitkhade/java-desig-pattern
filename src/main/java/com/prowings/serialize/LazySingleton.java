package com.prowings.serialize;

import java.io.Serializable;

public class LazySingleton implements Serializable {

	private volatile static LazySingleton instance = null;

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	

	protected Object readResolve() {
		return instance;
	}


	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
