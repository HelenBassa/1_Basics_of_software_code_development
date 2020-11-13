package by.training.linear;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ( ( a – 3 ) * b / 2 ) + c.
 * 
 */
public class Task_04 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		a = enterFromConsole("Введите значение числа a: ");
		b = enterFromConsole("Введите значение числа b: ");
		c = enterFromConsole("Введите значение числа c: ");
		z = functionValue(a, b, c);

		outputConsole(a, b, c, z);
	}

	public static double enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double value;
		System.out.print(message);

		while (!sc.hasNextDouble()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}

		value = sc.nextDouble();
		return value;
	}

	public static double functionValue(double a, double b, double c) {
		double value;
		value = ((a - 3) * b / 2) + c;
		return value;
	}

	public static void outputConsole(double a, double b, double c, double z) {
		System.out.println("Значение функции z = ( ( a – 3 ) * b / 2 ) + c при a = " + a + ", b = " + b + ", c = " + c
				+ " равно " + z);
	}

}
