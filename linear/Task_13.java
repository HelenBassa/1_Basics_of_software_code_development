package by.training.linear;

import java.util.Scanner;

/**
 * Заданы координаты трех вершин треугольника (x1, y1) , (x2, y2) , (x3, y3).
 * Найти его периметр и площадь.
 *
 */
public class Task_13 {

	public static void main(String[] args) {
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;

		double valueCalculate[];

		x1 = enterFromConsole("Введите значение числа x1: ");
		y1 = enterFromConsole("Введите значение числа y1: ");
		x2 = enterFromConsole("Введите значение числа x2: ");
		y2 = enterFromConsole("Введите значение числа y2: ");
		x3 = enterFromConsole("Введите значение числа x3: ");
		y3 = enterFromConsole("Введите значение числа y3: ");

		valueCalculate = valueCalculate(x1, y1, x2, y2, x3, y3);

		outputConsole(x1, y1, x2, y2, x3, y3, valueCalculate);
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

	public static double sideLength(double m, double n, double q, double r) {
		double value;
		value = Math.sqrt((Math.pow(Math.abs(m - q), 2)) + (Math.pow(Math.abs(n - r), 2)));
		return value;
	}

	public static double[] valueCalculate(double x1, double y1, double x2, double y2, double x3, double y3) {
		double a;
		double b;
		double c;
		double rectanglePerimeter;
		double p;
		double rectangleArea;

		a = sideLength(x1, y1, x2, y2);
		b = sideLength(x2, y2, x3, y3);
		c = sideLength(x3, y3, x1, y1);
		rectanglePerimeter = a + b + c;
		p = rectanglePerimeter / 2;
		rectangleArea = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return new double[] { rectanglePerimeter, rectangleArea };
	}

	public static void outputConsole(double x1, double y1, double x2, double y2, double x3, double y3,
			double[] valueCalculate) {
		double rectanglePerimeter;
		double rectangleArea;

		rectanglePerimeter = valueCalculate[0];
		rectangleArea = valueCalculate[1];

		System.out.printf(
				"Прямоугольный треугольник с координатами x1 = %f, y1 = %f, x2 = %f, y2 = %f, x3 = %f, y3 = %f имеет периметр равный %f и площадь равную %f",
				x1, y1, x2, y2, x3, y3, rectanglePerimeter, rectangleArea);
	}

}
