package com.ali.design.chapter_06.v02;

public class Person {

	private String name;

	public Person() {
	}
	
	public Person(String _name) {
		name = _name;
	}

	public void show() {
		System.out.println("装扮的" + name);
	}

}
