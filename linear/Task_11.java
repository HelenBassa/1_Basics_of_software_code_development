/**
 * 
 */
package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить периметр и площадь проямоугольнонго треугольника по длинам a и b двух катетов
 *
 */
public class Task_11 {

	public static void main(String[] args) {
		double a;
		double b;
		double valueCalculate[];

		a = enterFromConsole("Введите длину катета a: ");
		b = enterFromConsole("Введите длину катета b: ");

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
		double aSideLength;
		double rectanglePerimeter;
		double rectangleArea;

		aSideLength = Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)));
		rectanglePerimeter = a + b + aSideLength;
		rectangleArea = (a * b) / 2;

		return new double[] { rectanglePerimeter, rectangleArea };
	}

	public static void outputConsole(double a, double b, double[] valueCalculate) {
		double rectanglePerimeter;
		double rectangleArea;

		rectanglePerimeter = valueCalculate[0];
		rectangleArea = valueCalculate[1];

		System.out.println("Прямоугольный тругольник с катетами a = " + a + " и b= " + b + " имеет периметр = "
				+ rectanglePerimeter + " и площадь = " + rectangleArea);
	}

}
