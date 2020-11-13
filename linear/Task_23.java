package by.training.linear;

import java.util.Scanner;

/**
 * Найти площадь кольца, внутренний радиус которого равен r, а внешний R (R > r)
 *
 */
public class Task_23 {

	public static void main(String[] args) {
		double inRadius;
		double outRadius;
		double ringArea;

		inRadius = enterFromConsole("Введите значение внутреннего радиуса r: ");
		outRadius = enterFromConsole("Введите значение внешнего радиуса R: ");

		while (inRadius >= outRadius) {
			System.out.println("Некорректные значения! Введите значения, где r < R: ");

			inRadius = enterFromConsole("Введите значение внутреннего радиуса r: ");
			outRadius = enterFromConsole("Введите значение внешнего радиуса R: ");
		}

		ringArea = ringArea(inRadius, outRadius);

		outputConsole(inRadius, outRadius, ringArea);

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

	public static double ringArea(double inRadius, double outRadius) {
		double value;
		value = Math.PI * (Math.pow(outRadius, 2) - Math.pow(inRadius, 2));
		return value;
	}

	public static void outputConsole(double inRadius, double outRadius, double ringArea) {
		System.out.println("Площадь кольца, внутренний радиус которого равен r = " + inRadius + ", а внешний R = "
				+ outRadius + " равна " + ringArea);
	}

}
