package by.training.linear;

import java.util.Scanner;

/**
 * Найти площадь треугольника, две строны которого равны a и b, а угол между
 * этими сторонами gamma.
 * 
 * (Формула площади s = a * b * sin(gamma) / 2)
 *
 */
public class Task_26 {

	public static void main(String[] args) {
		double a;
		double b;
		double gamma;
		double triangleArea;

		System.out.println("Введите длины сторон треугольника a и b, а также угол между этими сторонами gamma:");

		a = enterFromConsole("Введите длину стороны a: ");
		b = enterFromConsole("Введите длину стороны b: ");
		gamma = enterFromConsole("Введите угол между этими сторонами gamma (в градусах): ");

		triangleArea = triangleArea(a, b, gamma);
		outputConsole(a, b, gamma, triangleArea);

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

	public static double triangleArea(double a, double b, double gamma) {
		double value;
		double radians;
		
		radians = Math.toRadians(gamma);
		value = a * b * Math.sin(radians) / 2;
		
		return value;
	}

	public static void outputConsole(double a, double b, double gamma, double triangleArea) {
		System.out.println("Площадь треугольника, со сторонами a = " + a + ", b = " + b
				+ " и уголом между этими сторонами gamma = " + gamma + " градусов, равна " + triangleArea);
	}

}
