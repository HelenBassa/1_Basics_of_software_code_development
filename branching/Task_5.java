package by.training.branching;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 *
 */
public class Task_5 {

	public static void main(String[] args) {
		double x;
		double functionValue;

		x = enterFromConsole("Введите значение x: ");

		functionValue = functionValue(x);
		outputConsole(x, functionValue);

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
		value = Math.abs(sc.nextDouble());

		return value;
	}

	public static double functionValue(double x) {
		double value;

		if (x <= 3) {
			value = Math.pow(x, 2) - 3 * x + 9;
		} else {
			value = 1 / (Math.pow(x, 3) + 6);
		}

		return value;
	}

	public static void outputConsole(double x, double functionValue) {
		System.out.printf("Значение функции F(x) при x = %f равно %f", x, functionValue);
	}

}
