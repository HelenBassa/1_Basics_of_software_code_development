package by.training.linear;

import java.util.Scanner;

/**
 * Составить программу перевода радианной меры угла в градусы, минуты и секунды.
 *
 */
public class Task_28 {

	public static void main(String[] args) {
		double angleInRadians;
		int angleInDegrees[];

		angleInRadians = enterFromConsole("Введите значение угла в радианах: ");

		angleInDegrees = angleInDegrees(angleInRadians);
		outputConsole(angleInRadians, angleInDegrees);
		
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

	public static int[] angleInDegrees(double angleInRadians) {
		double deg;
		int degree;

		double min;
		int minute;

		double sec;
		int second;

		deg = Math.toDegrees(angleInRadians);
		degree = (int) deg;

		min = (deg - degree) * 60;
		minute = (int) min;

		sec = (min - minute) * 60;
		second = (int) Math.round(sec);

		return new int[] { degree, minute, second };
	}

	public static void outputConsole(double angleInRadians, int[] angleInDegrees) {
		int degree;
		int minute;
		int second;
		
		degree = angleInDegrees[0];
		minute = angleInDegrees[1];
		second = angleInDegrees[2];

		System.out.printf("Угол равный %f радиан в градусах равен: %d градусов %d минут %d секунд", angleInRadians,
				degree, minute, second);
	}

}
