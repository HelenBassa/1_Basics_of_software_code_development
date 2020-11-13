/**
 * 
 */
package by.training.linear;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true, если
 * точка с координатами (x, y) принадлежит закрашенной области, и false - в
 * противном случае:
 *
 */
public class Task_38_2 {

	public static void main(String[] args) {
		double x;
		double y;
		boolean valueCalculate;

		x = enterFromConsole("Введите значение x: ");
		y = enterFromConsole("Введите значение y: ");

		valueCalculate = valueCalculate(x, y);
		outputConsole(valueCalculate);
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

	public static boolean valueCalculate(double x, double y) {
		boolean value;
		value = (y >= 0) && (y <= 4) && (x <= 2) && (x >= -2) || (y <= 0) && (y >= -3) && (x <= 4) && (x >= -4);
		return value;
	}

	public static void outputConsole(boolean belongToPlane) {
		System.out.print(belongToPlane);
	}

}
