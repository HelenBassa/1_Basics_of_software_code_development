package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 4. Точка с координатами (x, y) принадлежит части плоскости, лежащей между
 * прямыми x = m, x = n (m < n).
 *
 */
public class Task_37_4 {

	public static void main(String[] args) {
		int m;
		int n;
		int x;
		boolean belongToPlane;

		m = enterFromConsole("Введите значение m: ");
		n = enterFromConsole("Введите значение n: ");

		while (m >= n) {
			System.out.println("Некорректное значение! Введите значение m < n: ");

			m = enterFromConsole("Введите значение m: ");
			n = enterFromConsole("Введите значение n: ");
		}

		x = enterFromConsole("Введите значение x: ");

		belongToPlane = belongToPlane(m, n, x);
		outputConsole(belongToPlane);

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

	public static boolean belongToPlane(int m, int n, int x) {
		boolean value;
		value = (x >= m) && (x <= n);
		return value;
	}
	
	public static void outputConsole(boolean belongToPlane) {
		System.out.print(belongToPlane);
	}

}
