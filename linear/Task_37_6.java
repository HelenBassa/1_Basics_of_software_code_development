package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 6. Треугольник со сторонами a, b, c является равнобедренным.
 *
 */
public class Task_37_6 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		boolean valueCalculate;

		a = enterFromConsole("Введите значение a: ");
		b = enterFromConsole("Введите значение b: ");
		c = enterFromConsole("Введите значение c: ");

		while (a == 0 || b == 0 || c == 0) {
			System.out.println("Некорректное значение! Введите значения a, b, c не равные нулю: ");

			a = enterFromConsole("Введите значение a: ");
			b = enterFromConsole("Введите значение b: ");
			c = enterFromConsole("Введите значение c: ");
		}

		valueCalculate = valueCalculate(a, b, c);
		outputConsole(valueCalculate);

	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;

		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();

		return value;
	}

	public static boolean valueCalculate(int a, int b, int c) {
		boolean value;
		value = (a == b) || (b == c) || (c == a);
		return value;
	}

	public static void outputConsole(boolean valueCalculate) {
		System.out.print(valueCalculate);
	}

}
