package com.ali.design.chapter_08.v01;

public class AddFactory implements IFactory{

	@Override
	public Operation createOperation(double a,double b) {
		return new AddOperation(a,b);
	}

}
