package com.ali.design.chapter_02.v01;


public class Context {
	Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void contextInterface() {
		strategy.AlgrithmInterface();
	}
}
