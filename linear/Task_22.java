package by.training.linear;

import java.util.Scanner;

/**
 * Дано натуральное число T, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах, минутах и
 * секундах в следующей форме: HHч MMм SSс
 * 
 */
public class Task_22 {

	public static void main(String[] args) {
		long timeInSeconds;
		long valueCalculate[];

		timeInSeconds = enterFromConsole(
				"Введите натуральное число, которое представляет длительность прошедшего времени в секундах: ");
		valueCalculate = valueCalculate(timeInSeconds);

		outputConsole(timeInSeconds, valueCalculate);
	}

	public static long enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		long value;

		System.out.print(message);

		while (!sc.hasNextLong()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}

		value = Math.abs(sc.nextLong());
		return value;
	}

	public static long[] valueCalculate(long timeInSeconds) {
		long hour;
		long minute;
		long second;

		hour = timeInSeconds / 3600;
		minute = timeInSeconds / 60 % 60;
		second = timeInSeconds % 60;

		return new long[] { hour, minute, second };
	}

	public static void outputConsole(long timeInSeconds, long[] valueCalculate) {
		long hour;
		long minute;
		long second;

		hour = valueCalculate[0];
		minute = valueCalculate[1];
		second = valueCalculate[2];

		System.out.printf("Длительность прошедшего времени в " + timeInSeconds + " секундах равна %02dч %02dм %02dс",
				hour, minute, second);
	}

}
