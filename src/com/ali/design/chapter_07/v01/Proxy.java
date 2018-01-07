package com.ali.design.chapter_07.v01;

public class Proxy extends Subject {

	RealSubject subject;

	@Override
	public void request() {

		if (subject == null) {
			subject = new RealSubject();
		}
		subject.request();
	}

}
