package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 *
 */
public class Task_10 {

	public static void main(String[] args) {
		double x;
		double y;
		double functionValue;

		x = enterFromConsole("Введите значение числа x: ");
		y = enterFromConsole("Введите значение числа y: ");

		functionValue = functionValue(x, y);

		outputConsole(x, y, functionValue);
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

	public static double functionValue(double x, double y) {
		double value;
		value = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x) * Math.tan(y);
		return value;
	}

	public static void outputConsole(double x, double y, double functionValue) {
		System.out.println("Значение функции при x = " + x + " и y = " + y + " равно " + functionValue);
	}

}
