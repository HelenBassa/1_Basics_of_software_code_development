package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить корни квадратного уравнения ax2+bx+c=0 с заданными коэффициентами
 * a, b и c (предполагается, что a !=0 и что дискриминант уравнения не
 * отрицателен)
 *
 */
public class Task_25 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		System.out.println("Введите коэффициенты для уравнения ax^2 + bx + c = 0 (a не должно быть равно 0):");

		a = enterFromConsole("Введите значение коэффициента a: ");

		while (a == 0) {
			System.out.println("Некорректное значение коэффициента a! Введите значения, где a != 0: ");
			a = enterFromConsole("Введите значение коэффициента a: ");
		}

		b = enterFromConsole("Введите значение коэффициента b: ");
		c = enterFromConsole("Введите значение коэффициента c: ");

		outputConsole(a, b, c);

	}

	public static double enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double value;

		System.out.print(message);
		while (!sc.hasNextDouble()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}
		value = sc.nextDouble();

		return value;
	}

	public static double calcDiscriminant(double a, double b, double c) {
		double value;
		value = Math.pow(b, 2) - 4 * a * c;
		return value;
	}

	public static void outputConsole(double a, double b, double c) {
		double x1;
		double x2;
		double x;
		double discriminant;

		discriminant = calcDiscriminant(a, b, c);

		if (discriminant > 0) {
			x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if (discriminant == 0) {
			x = -b / (2 * a);
			System.out.println("x = " + x);
		} else {
			System.out.println("Корней нет");
		}

	}

}
