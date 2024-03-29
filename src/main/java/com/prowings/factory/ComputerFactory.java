package com.prowings.factory;

public class ComputerFactory {
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if(type.equalsIgnoreCase("PC"))
		{
			return new Pc(ram, hdd, cpu);
		}
		else if(type.equalsIgnoreCase("SERVER"))
		{
			return new Server(ram, hdd, cpu);
		}
		else
		{
			System.out.println("Invalid Type!!!");
			return null;
		}
			
	}

}