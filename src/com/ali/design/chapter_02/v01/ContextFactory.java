package com.ali.design.chapter_02.v01;

public class ContextFactory {

	public static Context createStrategy(String str) {
		Context context = null;
		switch (str) {
		case "A":
			context = new Context(new ConcreateStrategyA());
			break;
		case "B":
			context = new Context(new ConcreateStrategyB());
			break;
		case "C":
			context = new Context(new ConcreateStrategyC());
			break;

		default:
			break;
		}

		return context;

	}

}
