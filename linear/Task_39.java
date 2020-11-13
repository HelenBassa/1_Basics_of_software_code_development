package by.training.linear;

import java.util.Scanner;

/**
 * Дано действительное число x. Не пользуясь никакими другими арифметическими
 * операциями кроме умножения, сложения и вычитания, вычислите за минимальное
 * число операций: 2x^4 - 3x^3 + 4x^2 - 5x + 6
 *
 */
public class Task_39 {

	public static void main(String[] args) {
		double x;
		double result;

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

	public static double result(double x) {
		double value;
		value = x * (x * (x * (2 * x - 3) + 4) - 5) + 6;
		return value;
	}

	public static void outputConsole(double result) {
		System.out.print(result);
	}

}
