package com.ali.design.chapter_01.v01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("请输入数字A：");
		int a = in.nextInt();
		System.out.println("请输入数字运算符（+，-，*，/1）：");
		String op = in.next();
		System.out.println("请输入数字B：");
		int b = in.nextInt();
		int res = 0;
		if ("+".equals(op)) {
			res = a + b;
		}
		if ("-".equals(op)) {
			res = a - b;
		}
		if ("*".equals(op)) {
			res = a * b;
		}
		if ("/".equals(op)) {
			res = a / b;
		}

		System.out.println("结果：" + res);

	}

}
