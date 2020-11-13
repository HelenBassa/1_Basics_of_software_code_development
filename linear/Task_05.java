package by.training.linear;

import java.util.Scanner;

/**
 * Составить алгоритм нахождения среднего арифметического двух чисел.
 *
 */
public class Task_05 {

	public static void main(String[] args) {
		double a;
		double b;
		double average;

		a = enterFromConsole("Введите значение числа a: ");
		b = enterFromConsole("Введите значение числа b: ");
		average = average(a, b);

		outputConsole(a, b, average);
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

	public static double average(double a, double b) {
		double value;
		value = (a + b) / 2;
		return value;
	}

	public static void outputConsole(double a, double b, double average) {
		System.out
				.println("Значение среднего арифметического двух чисел a = " + a + " и b = " + b + " равно " + average);
	}

}
