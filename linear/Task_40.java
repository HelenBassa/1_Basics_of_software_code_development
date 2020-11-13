package by.training.linear;

import java.util.Scanner;

/**
 * Дано значение x. Получить значения -2x + 3x^2 - 4x^3 и 1 + 2x + 3x^2 + 4x^3.
 * Позаботьтесь об экономии операций.
 *
 */
public class Task_40 {

	public static void main(String[] args) {
		double x;
		double[] result;

		x = enterFromConsole("Введите значение x: ");
		
		result = result(x);
		outputConsole(result);

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

	public static double[] result(double x) {
		double value1 = x * (x * (-4 * x + 3) - 2);
		double value2 = x * (x * (4 * x + 3) + 2) + 1;
		return new double[] { value1, value2 };
	}

	public static void outputConsole(double[] result) {
		double value1;
		double value2;

		value1 = result[0];
		value2 = result[1];

		System.out.println("-2x + 3x^2 - 4x^3 = " + value1);
		System.out.println("1 + 2x + 3x^2 + 4x^3 = " + value2);

	}
}
