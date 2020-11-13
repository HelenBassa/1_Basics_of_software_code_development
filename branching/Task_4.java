package by.training.branching;

import java.util.Scanner;

/**
 * Даны размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
 * 
 * Определить, пройдет ли кирпич через отверстие.
 *
 */
public class Task_4 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;

		double a;
		double b;

		boolean valueCalculate;

		System.out.println("Введите размеры кирпича:");
		x = enterFromConsole("x: ");
		y = enterFromConsole("y: ");
		z = enterFromConsole("z: ");
		
		System.out.println("Введите размеры прямоугольного отверстия:");
		a = enterFromConsole("a: ");
		b = enterFromConsole("b: ");

		valueCalculate = valueCalculate(x, y, z, a, b);
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
		value = Math.abs(sc.nextDouble());

		return value;
	}

	public static boolean valueCalculate(double x, double y, double z, double a, double b) {
		boolean value;
		value = (x <= a && y <= b || y <= a && x <= b || x <= a && z <= b || z <= a && x <= b || z <= a && y <= b
				|| y <= a && z <= b);
		return value;
	}

	public static void outputConsole(boolean valueCalculate) {
		if (valueCalculate == true) {
			System.out.println("Кирпич пройдет через отверстие");
		} else {
			System.out.println("Кирпич не пройдет через отверстие");
		}

	}
}
