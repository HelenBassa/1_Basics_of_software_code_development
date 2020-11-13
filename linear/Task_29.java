package by.training.linear;

import java.util.Scanner;

/**
 * Найти (в радианах и градусах) все углы треугольника со сторонами a, b, c.
 *
 */
public class Task_29 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;

		double valueCalculate[];

		System.out.println("Введите длину сторон треугольника a, b, c");
		a = enterFromConsole("Введите длину стороны a: ");
		b = enterFromConsole("Введите длину стороны b: ");
		c = enterFromConsole("Введите длину стороны c: ");

		valueCalculate = valueCalculate(a, b, c);
		outputConsole(a, b, c, valueCalculate);

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

	public static double[] valueCalculate(double a, double b, double c) {
		double alfaRadians;
		double betaRadians;
		double gammaRadians;

		double alfaDegrees;
		double betaDegrees;
		double gammaDegrees;

		alfaRadians = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
		betaRadians = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
		gammaRadians = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * c * b));

		alfaDegrees = alfaRadians * 180 / Math.PI;
		betaDegrees = betaRadians * 180 / Math.PI;
		gammaDegrees = gammaRadians * 180 / Math.PI;

		return new double[] { alfaRadians, betaRadians, gammaRadians, alfaDegrees, betaDegrees, gammaDegrees };
	}

	public static void outputConsole(double a, double b, double c, double[] valueCalculate) {
		double alfaRadians;
		double betaRadians;
		double gammaRadians;

		double alfaDegrees;
		double betaDegrees;
		double gammaDegrees;

		alfaRadians = valueCalculate[0];
		betaRadians = valueCalculate[1];
		gammaRadians = valueCalculate[2];

		alfaDegrees = valueCalculate[3];
		betaDegrees = valueCalculate[4];
		gammaDegrees = valueCalculate[5];

		System.out.printf(
				"Углы треугольника в радианах равны: alfa = %.2f радиан, beta = %.2f радиан, gamma = %.2f радиан \n",
				alfaRadians, betaRadians, gammaRadians);
		System.out.printf(
				"Углы треугольника в градусах равны: alfa = %.2f градусов, beta = %.2f градусов, gamma = %.2f градусов ",
				alfaDegrees, betaDegrees, gammaDegrees);
	}

}
