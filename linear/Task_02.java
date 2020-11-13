package by.training.linear;

import java.util.Scanner;

/**
 * Найдите значение функции: c = 3 + a.
 *
 */
public class Task_02 {

	public static void main(String[] args) {
		double a;
		double c;

		a = enterFromConsole("Введите значение числа a: ");
		c = functionValue(a);
		
		outputConsole(a, c);
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

	public static double functionValue(double a) {
		double value;
		value = 3 + a;
		return value;
	}

	public static void outputConsole(double a, double c) {
		System.out.println("Значение функции c = 3 + a при a = " + a + " равно " + c);
	}

}
