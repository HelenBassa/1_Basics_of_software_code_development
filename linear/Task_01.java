package by.training.linear;

import java.util.Scanner;

/**
 * Даны два действительных числа x и y.
 * 
 * Вычислить их сумму, разность, произведение и частное.
 *
 */
public class Task_01 {

	public static void main(String[] args) {
		double x;
		double y;
		double valueCalculate[];

		x = enterFromConsole("Введите значение числа x: ");
		y = enterFromConsole("Введите значение числа y: ");

		valueCalculate = valueCalculate(x, y);
		outputConsole(x, y, valueCalculate);
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

	public static double[] valueCalculate(double x, double y) {
		double sum;
		double diff;
		double mult;
		double quot;

		sum = x + y;
		diff = x - y;
		mult = x * y;
		quot = x / y;

		return new double[] { sum, diff, mult, quot };
	}

	public static void outputConsole(double x, double y, double[] valueCalculate) {
		double sum;
		double diff;
		double mult;
		double quot;

		sum = valueCalculate[0];
		diff = valueCalculate[1];
		mult = valueCalculate[2];
		quot = valueCalculate[3];

		System.out.println("Сумма числа x = " + x + " и числа y = " + y + " равна " + sum);
		System.out.println("Разность числа x = " + x + " и числа y = " + y + " равна " + diff);
		System.out.println("Произведение числа x = " + x + " и числа y = " + y + " равно " + mult);
		System.out.println("Частное числа x = " + x + " и числа y = " + y + " равно " + quot);
	}

}
