package com.prowings.BillPughSingleton;

public class BillPughSingleton {
	
	private BillPughSingleton()
	{

	}

	private static class LazyHolder{
		private static BillPughSingleton instance = new  BillPughSingleton ();

	}

	public static BillPughSingleton getInstance()
	{
		return LazyHolder.instance;
	//	return LazyHolder.null;
	}


}
