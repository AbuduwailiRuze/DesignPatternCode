package com.ali.design.chapter_06.v02;

public class Finery extends Person {

	protected Person component;

	public void decorate(Person _component) {
		component = _component;
	}

	@Override
	public void show() {
		if (component != null) {
			component.show();
		}
	}

}
