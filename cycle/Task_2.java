package by.training.cycle;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [a, b] с шагом h:
 *
 */
public class Task_2 {

	public static void main(String[] args) {
		double a;
		double b;
		double h;

		a = enterFromConsole("Введите значение начала отрезка a: ");
		b = enterFromConsole("Введите значение конца отрезка b: ");
		h = enterFromConsole("Введите значение шага h: ");

		outputConsole(a, b, h);

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

	public static double functionValue(double x) {
		double value;

		if (x > 2) {
			value = x;
		} else {
			value = -x;
		}

		return value;
	}

	public static void outputConsole(double a, double b, double h) {

		for (double i = a; i <= b; i += h) {
			System.out.printf("x = %.2f\t y = %.2f \n", i, functionValue(i));

		}

	}

}
