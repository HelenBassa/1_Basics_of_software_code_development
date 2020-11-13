package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 9. График функции y = ax^2 + bx + c проходит через заданную точку с
 * координатами (m, n).
 * 
 */
public class Task_37_9 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double m;
		double n;
		boolean valueCalculate;

		a = enterFromConsole("Введите значение a: ");
		b = enterFromConsole("Введите значение b: ");
		c = enterFromConsole("Введите значение c: ");
		m = enterFromConsole("Введите значение m: ");
		n = enterFromConsole("Введите значение n: ");

		valueCalculate = valueCalculate(a, b, c, m, n);
		outputConsole(valueCalculate);

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

	public static boolean valueCalculate(double a, double b, double c, double m, double n) {
		boolean value;
		value = a * Math.pow(m, 2) + b * m + c == n;
		return value;
	}

	public static void outputConsole(boolean belongToPlane) {
		System.out.print(belongToPlane);
	}

}
