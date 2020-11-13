package by.training.linear;

import java.util.Scanner;

/**
 * Три сопротивления R1 R2 R3 соединены параллельно. Найдите сопротивление
 * соединения.
 *
 */
public class Task_30 {

	public static void main(String[] args) {
		double r1;
		double r2;
		double r3;
		double totalResistance;

		System.out.println("Введите значение сопротивлений R1, R2 и R3");
		r1 = enterFromConsole("Введите R1: ");
		r2 = enterFromConsole("Введите R2: ");
		r3 = enterFromConsole("Введите R3: ");
		totalResistance = totalResistance(r1, r2, r3);

		outputConsole(r1, r2, r3, totalResistance);
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
		value = Math.abs(sc.nextDouble());

		return value;
	}

	public static double totalResistance(double r1, double r2, double r3) {
		double value;
		value = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
		return value;
	}

	public static void outputConsole(double r1, double r2, double r3, double totalResistance) {
		System.out.printf(
				"Сопротивление соединения (при трех параллельно соединеных сопротивления R1 = %f Ом, R2 = %f Ом, R3 = %f Ом) равно %f Ом",
				r1, r2, r3, totalResistance);
	}

}
