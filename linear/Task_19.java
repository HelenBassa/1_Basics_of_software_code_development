package by.training.linear;

import java.util.Scanner;

/**
 * Дана сторона равностороннего треугольника.
 * 
 * Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
 * 
 *
 */
public class Task_19 {

	public static void main(String[] args) {
		double a;
		double valueCalculate[];

		a = enterFromConsole("Введите длину стороны равностороннего треугольника: ");

		valueCalculate = valueCalculate(a);

		outputConsole(a, valueCalculate);
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

	public static double[] valueCalculate(double a) {
		double triangleArea;
		double triangleHeight;
		double inscribedCircleRadius;
		double outscribedCircleRadius;

		triangleArea = Math.pow(a, 2) * Math.sqrt(3) / 4;
		triangleHeight = a * Math.sqrt(3) / 2;
		inscribedCircleRadius = a * Math.sqrt(3) / 6;
		outscribedCircleRadius = 2 * inscribedCircleRadius;

		return new double[] { triangleArea, triangleHeight, inscribedCircleRadius, outscribedCircleRadius };
	}

	public static void outputConsole(double a, double[] valueCalculate) {
		double triangleArea;
		double triangleHeight;
		double inscribedCircleRadius;
		double outscribedCircleRadius;

		triangleArea = valueCalculate[0];
		triangleHeight = valueCalculate[1];
		inscribedCircleRadius = valueCalculate[2];
		outscribedCircleRadius = valueCalculate[3];

		System.out
				.println("Площадь равностороннего тругольника со стороной равной a = " + a + " равна " + triangleArea);
		System.out.println(
				"Высота равностороннего тругольника со стороной равной a = " + a + " равна " + triangleHeight);
		System.out.println("Радиус вписанной окружности равностороннего тругольника со стороной равной a = " + a
				+ " равен " + inscribedCircleRadius);
		System.out.println("Радиус описанной окружности равностороннего тругольника со стороной равной a = " + a
				+ " равен " + outscribedCircleRadius);
	}

}
