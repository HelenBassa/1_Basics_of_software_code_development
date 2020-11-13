package by.training.branching;

import java.util.Scanner;

/**
 * Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3).
 * 
 * Определить, будут ли они расположены на одной прямой.
 *
 */
public class Task_3 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		boolean valueCalculate;

		System.out.println("Введите значения точек A(x1, y1), B(x2, y2) и C(x3, y3):");
		x1 = enterFromConsole("x1: ");
		y1 = enterFromConsole("y1: ");
		x2 = enterFromConsole("x2: ");
		y2 = enterFromConsole("y2: ");
		x3 = enterFromConsole("x3: ");
		y3 = enterFromConsole("y3: ");

		valueCalculate = valueCalculate(x1, y1, x2, y2, x3, y3);
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

	public static boolean valueCalculate(double x1, double y1, double x2, double y2, double x3, double y3) {
		boolean value;
		value = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
		return value;
	}

	public static void outputConsole(boolean valueCalculate) {
		if (valueCalculate == true) {
			System.out.println("Точки A, B и C находятся на одной прямой");
		} else {
			System.out.println("Точки A, B и C не находятся на одной прямой");
		}

	}

}
