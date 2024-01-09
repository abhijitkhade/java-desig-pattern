package com.prowings.BillPughSingleton;

public class TestBillPugh {

	public static void main(String[] args) {

			BillPughSingleton instance1 = BillPughSingleton.getInstance();
			BillPughSingleton instance2 = BillPughSingleton.getInstance();



			System.out.println(instance1 == instance2);
			
			System.out.println(instance1);
			System.out.println(instance2);

}
}