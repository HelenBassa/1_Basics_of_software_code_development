package by.training.linear;

import java.util.Scanner;

/**
 * Дано значение a. Не используя никаких функций и никаких операций, кроме
 * умножения, получить значение a^8 за три операции и a^10 за четыре операции.
 *
 */
public class Task_27 {

	public static void main(String[] args) {
		double a;
		double valueCalculate[];

		a = enterFromConsole("Введите значение числа a: ");
		valueCalculate = valueCalculate(a);

		outputConsole(a, valueCalculate);
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

	public static double[] valueCalculate(double a) {
		double a2;
		double a4;
		double a8;
		double a10;

		a2 = a * a;
		a4 = a2 * a2;
		a8 = a4 * a4;
		a10 = a2 * a8;

		return new double[] { a8, a10 };
	}

	public static void outputConsole(double a, double[] valueCalculate) {
		double a8;
		double a10;

		a8 = valueCalculate[0];
		a10 = valueCalculate[1];

		System.out.println("Значение числа a = " + a + " в степени 8 равно " + a8);
		System.out.println("Значение числа a = " + a + " в степени 10 равно " + a10);
	}

}
