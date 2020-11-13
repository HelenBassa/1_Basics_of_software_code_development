package by.training.linear;

import java.util.Scanner;

/**
 * Написать код для решения задачи. В n малых бидонах 80 л молока.
 * 
 * Сколько литров молока в m больших бидонах, если в каждом бидоне на 12 л
 * больше, чем в малом?
 * 
 *
 */
public class Task_06 {

	public static void main(String[] args) {
		int n;
		int m;
		int totalLargeCanVolume;

		n = enterFromConsole("Введите количество малых бидонов n: ");
		m = enterFromConsole("Введите количество больших бидонов m: ");

		totalLargeCanVolume = totalLargeCanVolume(m, n);
		outputConsole(m, totalLargeCanVolume);

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

		value = sc.nextInt();
		return value;
	}

	public static int totalLargeCanVolume(int m, int n) {
		int totalSmallCanVolume;
		int volumeSmallCan;
		int volumeLargeCan;
		int totalLargeCanVolume;

		totalSmallCanVolume = 80;
		volumeSmallCan = totalSmallCanVolume / n;
		volumeLargeCan = volumeSmallCan + 12;
		totalLargeCanVolume = volumeLargeCan * m;

		return totalLargeCanVolume;
	}

	public static void outputConsole(int m, int totalLargeCanVolume) {
		System.out.println("В " + m + " больших бидонах " + totalLargeCanVolume + " литров молока");
	}

}
