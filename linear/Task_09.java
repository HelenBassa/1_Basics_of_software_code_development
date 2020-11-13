/**
 * 
 */
package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 *
 */
public class Task_09 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double functionValue;

		a = enterFromConsole("Введите значение числа a: ");
		b = enterFromConsole("Введите значение числа b: ");
		c = enterFromConsole("Введите значение числа c: ");
		d = enterFromConsole("Введите значение числа d: ");

		functionValue = functionValue(a, b, c, d);

		outputConsole(a, b, c, d, functionValue);
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

	public static double functionValue(double a, double b, double c, double d) {
		double value;
		value = (a / c) * (b / d) - (((a * b) - c) / (c * d));
		return value;
	}

	public static void outputConsole(double a, double b, double c, double d, double functionValue) {
		System.out.println("Значение функции при a = " + a + ", b = " + b + ", c = " + c + " и d = " + d + " равно "
				+ functionValue);
	}

}
