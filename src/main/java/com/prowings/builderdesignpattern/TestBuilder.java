package com.prowings.builderdesignpattern;

public class TestBuilder {
	
	public static void main(String[] args) {
		
		Student student=new Student.StudentBuilder("abhi", "khade")
				.age(25)
				.build();
		
		System.out.println(student);
	}

}
