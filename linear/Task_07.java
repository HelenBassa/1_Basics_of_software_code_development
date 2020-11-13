package by.training.linear;

import java.util.Scanner;

/**
 * Дан прямоугольник, ширина которого в два раза меньше длины.
 * 
 * Найти площадь прямоугольника.
 * 
 *
 */
public class Task_07 {

	public static void main(String[] args) {
		double length;
		double rectangleArea;

		length = enterFromConsole("Введите длину прямоугольника length: ");
		rectangleArea = rectangleArea(length);

		outputConsole(length, rectangleArea);
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

	public static double rectangleArea(double length) {
		double value;
		value = length / 2;
		value *= length;
		return value;
	}

	public static void outputConsole(double length, double rectangleArea) {
		System.out.println("Площадь прямоугольника (ширина которого в два раза меньше длины равной " + length
				+ ") равна " + rectangleArea);
	}
}
