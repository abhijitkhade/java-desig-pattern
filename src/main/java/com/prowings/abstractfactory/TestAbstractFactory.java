package com.prowings.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(new PcFactory("4 GB", "500 GB", "Dual Core"));
		
		System.out.println(pc);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("100 GB", "500 TB", "i7 12th Gen"));
		
		System.out.println(server);
	}
}