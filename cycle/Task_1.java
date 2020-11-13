package by.training.cycle;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 *
 */
public class Task_1 {

	public static void main(String[] args) {
		long num;
		long sum;

		num = enterFromConsole("Введите целое положительное число: ");

		while (num < 1) {
			System.out.print("Некорректное значение! ");
			num = enterFromConsole("Введите целое положительное число: ");
		}
		
		sum = sum(num);

		outputConsole(num, sum);

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

	public static long sum(long num) {
		long value;

		value = 0;
		for (long i = 1; i <= num; i++) { // до введенного числа включительно
			value += i;
		}
		return value;
	}

	public static void outputConsole(long num, long sum) {
		System.out.printf("Сумма чисел от 1 до %d равна %d", num, sum);
	}

}
