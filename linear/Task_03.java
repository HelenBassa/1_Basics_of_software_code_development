package by.training.linear;

import java.util.Scanner;

/**
 * Найдите значение функции: z = 2 * x + ( y – 2 ) * 5.
 *
 */
public class Task_03 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;

		x = enterFromConsole("Введите значение числа x: ");
		y = enterFromConsole("Введите значение числа y: ");
		z = functionValue(x, y);

		outputConsole(x, y, z);
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
		value = 2 * x + (y - 2) * 5;
		return value;
	}

	public static void outputConsole(double x, double y, double z) {
		System.out.println("Значение функции z = 2 * x + ( y – 2 ) * 5 при x = " + x + ", y = " + x + " равно " + z);
	}

}
