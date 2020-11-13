/**
 * 
 */
package by.training.linear;

import java.util.Scanner;

/**
 * Вычислить длину окружности и площадь круга одного и того же заданного радиуса
 * R
 *
 */
public class Task_14 {

	public static void main(String[] args) {
		double radius;
		double[] valueCalculate;

		radius = enterFromConsole("Введите радиус R: ");

		valueCalculate = valueCalculate(radius);
		outputConsole(radius, valueCalculate);
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

	public static double[] valueCalculate(double radius) {
		double circumference;
		double circleArea;

		circumference = 2 * Math.PI * radius;
		circleArea = Math.PI * Math.pow(radius, 2);

		return new double[] { circumference, circleArea };
	}

	public static void outputConsole(double radius, double[] valueCalculate) {
		double circumference;
		double circleArea;

		circumference = valueCalculate[0];
		circleArea = valueCalculate[1];

		System.out.println("Круг с радиусом R = " + radius + " имеет длину окружности = " + circumference
				+ " и площадь = " + circleArea);
	}

}
