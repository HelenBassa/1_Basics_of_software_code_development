package by.training.linear;

import java.util.Scanner;

/**
 * Даны натуральные числа M и N. Вывести старшую цифру дробной части и младшую
 * цифру целой части M/N.
 *
 */
public class Task_35 {

	public static void main(String[] args) {
		int m;
		int n;
		int[] valueCalculate;

		System.out.println("Введите натуральные числа M и N");
		m = enterFromConsole("M: ");
		n = enterFromConsole("N: ");

		valueCalculate = valueCalculate(m, n);

		outputConsole(m, n, valueCalculate);
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

	public static int[] valueCalculate(int m, int n) {
		double x;
		int c;
		int d;

		x = (double) m / n;
		c = (int) x % 10;
		d = (int) (10 * (x - (int) x));

		return new int[] { c, d };
	}

	public static void outputConsole(int m, int n, int[] valueCalculate) {
		double x;
		int c;
		int d;

		x = (double) m / n;
		c = valueCalculate[0];
		d = valueCalculate[1];

		System.out.printf("M/N равно %.2f \n", x);
		System.out.printf("Младшая цифра целой части M/N равна %d \n", c);
		System.out.printf("Cтаршая цифра дробной части M/N равна %d", d);
	}

}
