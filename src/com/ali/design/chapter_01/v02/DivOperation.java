package com.ali.design.chapter_01.v02;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		if (numberB == 0.0)
			throw new RuntimeException("numberB 不能为零");
		return numberA / numberB;
	}

}
