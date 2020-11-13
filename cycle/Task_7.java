package by.training.cycle;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 *
 */
public class Task_7 {

	public static void main(String[] args) {
		int m;
		int n;

		m = enterFromConsole("Введите начало отрезка m (натуральное число): ");
		n = enterFromConsole("Введите начало отрезка n (натуральное число): ");

		while (m <= 0 || n <= 0) {
			System.out.println("Неверный ввод!");
			m = enterFromConsole("Введите начало отрезка m (натуральное число): ");
			n = enterFromConsole("Введите начало отрезка n (натуральное число): ");
		}

		outputConsole(m, n);

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

	public static void outputConsole(int m, int n) {
		for (int i = m; i <= n; i++) {
			System.out.printf("%d: ", i);

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.printf("%d ", j);
				}
			}

			System.out.println();

		}

	}

}
