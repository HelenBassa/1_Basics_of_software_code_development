package by.training.linear;

import java.util.Scanner;

/**
 * Найти произведение цифр заданного четырехзначного числа.
 *
 */
public class Task_16 {

	public static void main(String[] args) {
		int num;
		int mult;

		num = enterFromConsole("Введите четырехзначное число: ");
		mult = mult(num);

		outputConsole(num, mult);
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

		while ((value < 1000) | (value > 9999)) {
			System.out.print("Введенное число НЕ четырехзначное! Введите ЧЕТЫРЕХЗНАЧНОЕ ЧИСЛО: ");
			value = sc.nextInt();
		}

		return value;
	}

	public static int mult(int num) {
		int a;
		int b;
		int c;
		int d;
		int value;

		a = num / 1000;
		b = num / 100 % 10;
		c = num / 10 % 10;
		d = num % 10;
		value = a * b * c * d;

		return value;
	}

	public static void outputConsole(int num, int mult) {
		System.out.println("Произведение цифр числа " + num + " равно " + mult);
	}

}
