package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 * 
 *
 */
public class Task_08 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double functionValue;

		a = enterFromConsole("Введите значение числа a: ");
		b = enterFromConsole("Введите значение числа b: ");
		c = enterFromConsole("Введите значение числа c: ");

		functionValue = functionValue(a, b, c);

		outputConsole(a, b, c, functionValue);
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
		value = ((b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2);
		return value;
	}

	public static void outputConsole(double a, double b, double c, double functionValue) {
		System.out.println("Значение функции при a = " + a + ", b = " + b + " и c = " + c + " равно " + functionValue);
	}

}
