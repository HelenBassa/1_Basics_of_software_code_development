package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 5. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
 *
 */
public class Task_37_5 {

	public static void main(String[] args) {
		int num;
		boolean valueCalculate;

		num = enterFromConsole("Введите трехзначное число: ");

		while ((num < 100) || (num > 999)) {
			System.out.print("Некорректное значение! ");
			num = enterFromConsole("Введите трехзначное число: ");
		}

		valueCalculate = valueCalculate(num);
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
		value = Math.abs(sc.nextInt());

		return value;
	}

	public static boolean valueCalculate(int num) {
		int n1;
		int n2;
		int n3;
		boolean value;

		n1 = (num / 100);
		n2 = (num % 100 / 10);
		n3 = (num % 100 % 10);

		value = (Math.pow(num, 2)) == (Math.pow((n1 + n2 + n3), 3));
		return value;
	}

	public static void outputConsole(boolean valueCalculate) {
		System.out.print(valueCalculate);
	}

}
