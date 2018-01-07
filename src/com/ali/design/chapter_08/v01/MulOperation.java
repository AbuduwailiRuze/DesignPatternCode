package com.ali.design.chapter_08.v01;

public class MulOperation extends Operation {

	public MulOperation(double a, double b) {
		// TODO Auto-generated constructor stub
		numberA=a;
		numberB=b;
	}

	@Override
	public double getResult() {
		return numberA * numberB;
	}

}
