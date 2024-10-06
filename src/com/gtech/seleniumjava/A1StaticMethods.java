package com.gtech.seleniumjava;

public class A1StaticMethods {
	public static void staticMethod() {
		System.out.println("Static method is called in Main Method");
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			staticMethod();
		}
	}

}
