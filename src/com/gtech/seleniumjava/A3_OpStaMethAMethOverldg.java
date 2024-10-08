package com.gtech.seleniumjava;

class A3_OpStaMethAMethOverldg {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed!");
			return 0;
		}
		return a / b;
	}

	static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed!");
			return 0;
		}
		return a / b;
	}

	static int modulo(int a, int b) {
		if (b == 0) {
			System.out.println("Modulo by zero is not allowed!");
			return 0;
		}
		return a % b;
	}

	static double modulo(double a, double b) {
		if (b == 0) {
			System.out.println("Modulo by zero is not allowed!");
			return 0;
		}
		return a % b;
	}
}

public class Main {
	public static void main(string[] args) {

		System.out.println("Addition of two numbers: " + A3_OpStaMethAMethOverldg.add(20, 50));
		System.out.println("Addition of three numbers: " + A3_OpStaMethAMethOverldg.add(10, 20, 30));

		System.out.println("Subtraction of two integers: " + A3_OpStaMethAMethOverldg.subtract(50, 10));
		System.out.println("Subtraction of two doubles: " + A3_OpStaMethAMethOverldg.subtract(45.5, 15.5));

		System.out.println("Multiplication of two integers: " + A3_OpStaMethAMethOverldg.multiply(100, 50));
		System.out.println("Multiplication of two doubles: " + A3_OpStaMethAMethOverldg.multiply(101.5, 51.25));

		System.out.println("Division of two integers: " + A3_OpStaMethAMethOverldg.divide(45, 5));
		System.out.println("Division of two doubles: " + A3_OpStaMethAMethOverldg.divide(28.5, 3.1));

		System.out.println("Modulo of two integers: " + A3_OpStaMethAMethOverldg.modulo(60, 9));
		System.out.println("Modulo of two doubles: " + A3_OpStaMethAMethOverldg.modulo(28.5, 5.2));
	}
}
