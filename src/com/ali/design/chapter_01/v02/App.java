package com.ali.design.chapter_01.v02;

public class App {

	public static void main(String[] args) {
		Operation operation;
		operation = OperationFactory.createOperation("+");
		operation.numberA = 1;
		operation.numberB = 2;
		double result = operation.getResult();
		System.out.println(result);
	}

}
