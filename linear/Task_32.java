package by.training.linear;

import java.util.Scanner;

/**
 * Текущее показание электронных часов: m час (0<=m<=23) n мин (0<=n<=59) k сек
 * (0<=k<=59). Какое время будут показывать часы через p час q мин r сек?
 *
 */
public class Task_32 {

	public static void main(String[] args) {
		int m;
		int n;
		int k;
		int p;
		int q;
		int r;
		int newTime[];

		System.out.println("Введите показания электронных часов");
		m = enterFromConsole("Часы, m ( 0 <= m <= 23 ): ");
		n = enterFromConsole("Минуты, n ( 0 <= n <= 59 ): ");
		k = enterFromConsole("Секунды, k ( 0 <= k <= 59 ): ");
		System.out.println("Введите добавленное время");
		p = enterFromConsole("Часы, p ( 0 <= p <= 23 ): ");
		q = enterFromConsole("Минуты, q ( 0 <= q <= 59 ): ");
		r = enterFromConsole("Секунды, r ( 0 <= r <= 59 ): ");

		newTime = newTime(m, n, k, p, q, r);

		outputConsole(newTime);
	}

	public static int enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value;

		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}
		value = Math.abs(sc.nextInt());

		return value;
	}

	public static int[] newTime(int m, int n, int k, int p, int q, int r) {
		int newTimeInSeconds;
		int newHour;
		int newMinute;
		int newSecond;

		newTimeInSeconds = (m + p) * 3600 + (n + q) * 60 + (k + r);
		newHour = newTimeInSeconds / 3600 % 24;
		newMinute = newTimeInSeconds % 3600 / 60;
		newSecond = newTimeInSeconds % 60;

		return new int[] { newHour, newMinute, newSecond };
	}

	public static void outputConsole(int newTime[]) {
		int newHour;
		int newMinute;
		int newSecond;

		newHour = newTime[0];
		newMinute = newTime[1];
		newSecond = newTime[2];

		System.out.printf("Новое время: %02d час %02d мин %02d сек ", newHour, newMinute, newSecond);
	}

}
