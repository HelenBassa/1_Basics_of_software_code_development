package by.training.linear;

import java.util.Scanner;

/**
 * Известна длина окружности.
 * 
 * Найти площадь круга, ограниченного этой окружностью.
 *
 */
public class Task_20 {

	public static void main(String[] args) {
		double length;
		double circleArea;

		length = enterFromConsole("Введите длину окружности: ");

		circleArea = circleArea(length);

		outputConsole(length, circleArea);
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

	public static double circleArea(double length) {
		double value;
		value = Math.pow(length, 2) / 4 * Math.PI;
		return value;
	}

	public static void outputConsole(double length, double circleArea) {
		System.out.println("Площадь круга, ограниченного окружностью длиной " + length + ", равна " + circleArea);
	}

}
