package com.ali.design.chapter_01.v02;

public class OperationFactory {

	public static Operation createOperation(String op) {
		Operation oper = null;
		switch (op) {
		case "+":
			oper = new AddOperation();
			break;

		case "-":
			oper = new SubOperation();
			break;
		case "*":
			oper = new MulOperation();
			break;
		case "/":
			oper = new DivOperation();
			break;
		default:
			break;
		}

		return oper;

	}

}
