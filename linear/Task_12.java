/**
 * 
 */
package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить расстояние между двумя точками с данными координатами: (x1, y1) и
 * (x2, y2)
 *
 */
public class Task_12 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double distance;

		x1 = enterFromConsole("Введите значение числа x1: ");
		y1 = enterFromConsole("Введите значение числа y1: ");
		x2 = enterFromConsole("Введите значение числа x2: ");
		y2 = enterFromConsole("Введите значение числа y2: ");

		distance = distance(x1, y1, x2, y2);

		outputConsole(x1, y1, x2, y2, distance);
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

	public static double distance(double x1, double y1, double x2, double y2) {
		double value;
		value = Math.sqrt((Math.pow(Math.abs(x1 - x2), 2)) + (Math.pow(Math.abs(y1 - y2), 2)));
		return value;
	}

	public static void outputConsole(double x1, double y1, double x2, double y2, double distance) {
		System.out.println("Расстояние между двумя точками с координатами: (" + x1 + "," + y1 + ") и (" + x2 + "," + y2
				+ ") равно " + distance);
	}

}
