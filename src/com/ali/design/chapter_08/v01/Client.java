package com.ali.design.chapter_08.v01;

public class Client {
	
	public static void main(String[] args) {
		IFactory factory=new AddFactory();
		Operation operation = factory.createOperation(1,3);
		double result = operation.getResult();
		System.out.println(result);
		
		IFactory mulfactory=new MulFactory();
		Operation mul = mulfactory.createOperation(3,4);
		System.out.println(mul.getResult());
	}

}
