package com.prowings.abstractfactory;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory abstractFactory)
	{
			return abstractFactory.getComputer();
	}

}