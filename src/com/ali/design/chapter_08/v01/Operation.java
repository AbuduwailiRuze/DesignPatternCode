package com.ali.design.chapter_08.v01;

public abstract class Operation {
	
	
	//hello 44443336666
	protected double numberA;
	//hello walee 555
	protected double numberB;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public abstract double getResult();

}
