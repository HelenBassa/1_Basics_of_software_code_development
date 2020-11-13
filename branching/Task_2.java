package by.training.branching;

import java.util.Scanner;

/**
 * Найти max {min(a, b), min (c, d)}.
 */
public class Task_2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double maxBranching;
		double maxMath;

		System.out.println("Введите значения a, b, c, d:");
		a = enterFromConsole("a: ");
		b = enterFromConsole("b: ");
		c = enterFromConsole("c: ");
		d = enterFromConsole("d: ");

		maxBranching = maxBranching(a, b, c, d);
		maxMath = maxMath(a, b, c, d);

		outputConsole(maxMath, maxBranching);

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

	public static double max(double x, double y) {
		double value;

		if (x > y) {
			value = x;
		} else {
			value = y;
		}

		return value;
	}

	public static double min(double x, double y) {
		double value;

		if (x < y) {
			value = x;
		} else {
			value = y;
		}

		return value;
	}

	public static double maxBranching(double a, double b, double c, double d) {
		double value;
		value = max((min(a, b)), (min(c, d)));
		return value;
	}

	public static double maxMath(double a, double b, double c, double d) {
		double value;
		value = Math.max((Math.min(a, b)), (Math.min(c, d)));
		return value;
	}

	public static void outputConsole(double maxMath, double maxBranching) {
		System.out.printf("Максимальное значение из {min(a, b), min (c, d)} равно %f \n", maxBranching);
		System.out.printf("Максимальное значение из {min(a, b), min (c, d)} равно %f", maxMath);
	}

}