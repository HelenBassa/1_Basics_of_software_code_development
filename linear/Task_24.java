package by.training.linear;

import java.util.Scanner;

/**
 * Найти площадь равнобедренной трапеции с основаниями a и b и углом alpha при
 * большем основании a.
 *
 */
public class Task_24 {

	public static void main(String[] args) {
		double a;
		double b;
		double alphaInDegrees;
		double upperLimit;
		double trapeziumArea;

		a = enterFromConsole("Введите значение большего основания равнобедренной трапеции a: ");
		b = enterFromConsole("Введите значение меньшего основания равнобедренной трапеции b: ");

		while (a >= b) {
			System.out.println("Некорректные значения! Введите значения, где a < b: ");
			a = enterFromConsole("Введите значение большего основания равнобедренной трапеции a: ");
			b = enterFromConsole("Введите значение меньшего основания равнобедренной трапеции b: ");
		}

		alphaInDegrees = enterFromConsole("Введите значение угла alpha при большем основании a: ");
		upperLimit = 90;

		while (alphaInDegrees >= upperLimit) {
			System.out.println("Некорректные значения! Введите значения, где alpha < " + upperLimit + " : ");
			alphaInDegrees = enterFromConsole("Введите значение угла alpha при большем основании a: ");
		}

		trapeziumArea = trapeziumArea(a, b, alphaInDegrees);

		outputConsole(a, b, alphaInDegrees, trapeziumArea);

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

	public static double trapeziumArea(double a, double b, double alphaInDegrees) {
		double alphaInRadians;
		double h;
		double value;

		alphaInRadians = Math.toRadians(alphaInDegrees);
		h = Math.abs(a - b) * 0.5 * Math.tan(alphaInRadians);
		value = (a + b) * h * 0.5;

		return value;
	}

	public static void outputConsole(double a, double b, double alphaInDegrees, double trapeziumArea) {
		System.out.println("Площадь равнобедренной трапеции с основаниями a = " + a + " и b = " + b
				+ " и углом alpha = " + alphaInDegrees + " равна " + trapeziumArea);
	}

}
