package com.ali.design.chapter_08.v01;

public class AddOperation extends Operation {

	public AddOperation(double a, double b) {
		numberA=a;
		numberB=b;
	}

	@Override
	public double getResult() {
		return numberA + numberB;
	}

}
