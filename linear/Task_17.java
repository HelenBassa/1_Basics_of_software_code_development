package by.training.linear;

import java.util.Scanner;

/**
 * Даны два числа.
 * 
 * Найти среднее арифметическое кубов этих чисел и среднее геометрическое
 * модулей этих чисел.
 *
 */
public class Task_17 {

	public static void main(String[] args) {
		double a;
		double b;
		double valueCalculate[];

		a = enterFromConsole("Введите первое число: ");
		b = enterFromConsole("Введите второе число: ");

		valueCalculate = valueCalculate(a, b);
		outputConsole(a, b, valueCalculate);
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

	public static double[] valueCalculate(double a, double b) {
		double arithmeticMean;
		double geometricMean;

		arithmeticMean = ((Math.pow(a, 3)) + (Math.pow(b, 3))) / 2;
		geometricMean = (Math.sqrt(Math.abs(a * b)));

		return new double[] { arithmeticMean, geometricMean };
	}

	public static void outputConsole(double a, double b, double[] valueCalculate) {
		double arithmeticMean;
		double geometricMean;

		arithmeticMean = valueCalculate[0];
		geometricMean = valueCalculate[1];

		System.out.println("Среднее арифметическое кубов чисел " + a + " и " + b + " равно " + arithmeticMean);
		System.out.println("Среднее геометрическое модулей чисел " + a + " и " + b + " равно " + geometricMean);
	}

}
