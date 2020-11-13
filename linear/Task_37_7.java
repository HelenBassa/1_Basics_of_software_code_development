/**
 * 
 */
package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 7. Сумма каких-либо двух цифр заданного трехзначного натурального числа N
 * равна третьей цифре.
 *
 */
public class Task_37_7 {

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

		value = (n1 + n2 == n3) || (n2 + n3 == n3) || (n1 + n3 == n3);
		return value;
	}

	public static void outputConsole(boolean valueCalculate) {
		System.out.print(valueCalculate);
	}

}
