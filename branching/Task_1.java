package by.training.branching;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах).
 * 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 *
 */
public class Task_1 {

	public static void main(String[] args) {
		double alfa;
		double beta;

		System.out.println("Введите значение (в градусах) углов alfa и beta:");
		alfa = enterFromConsole("alfa (в градусах): ");
		beta = enterFromConsole("beta (в градусах): ");

		outputConsole(alfa, beta);
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

	public static void outputConsole(double alfa, double beta) {
		double value;
		value = alfa + beta;

		if (value < 180) {
			System.out.println("Треугольник существует");
			if ((180 - value == 90) || (alfa == 90) || (beta == 90)) {
				System.out.println("Треугольник является прямоугольным");
			} else {
				System.out.println("Треугольник не является прямоугольным");
			}
		} else {
			System.out.println("Треугольника не существует");
		}

	}

}
