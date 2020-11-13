package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 8. Заданное число N является степенью числа a (показатель степени может
 * находится в диапазоне от 0 до 4).
 *
 */
public class Task_37_8 {

	public static void main(String[] args) {
		long n;
		long a;
		boolean valueCalculate;

		n = enterFromConsole("Введите значение n: ");
		a = enterFromConsole("Введите значение a: ");

		valueCalculate = valueCalculate(n, a);
		outputConsole(valueCalculate);
		
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

	public static boolean valueCalculate(long n, long a) {
		boolean value;
		double power;

		value = true;
		power = Math.log(n) / Math.log(a);

		if (power >= 0 && power <= 4) {
			return value;
		}

		return !value;
	}

	public static void outputConsole(boolean valueCalculate) {
		System.out.print(valueCalculate);
	}

}
