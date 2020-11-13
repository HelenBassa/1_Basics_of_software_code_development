package by.training.cycle;

import java.util.Scanner;

/**
 * Даны два числа.
 * 
 * Определить цифры, входящие в запись как первого так и второго числа.
 *
 */
public class Task_8 {

	public static void main(String[] args) {
		long a;
		long b;

		a = enterFromConsole("Введите число a: ");
		b = enterFromConsole("Введите число b: ");
		outputConsole(a, b);

	}

	public static long enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long value;

		System.out.print(message);
		while (!sc.hasNextLong()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}
		value = sc.nextLong();

		return value;
	}

	public static void outputConsole(long a, long b) {
		long c;
		long d;

		while (a > 0) {
			d = a % 10;
			a = a / 10;
			c = b;
			while (c > 0) {
				if (c % 10 == d) {
					System.out.printf("%d ", d);
				}
				
				c = c / 10;
			}
		}
		
		System.out.println();
	}

}
