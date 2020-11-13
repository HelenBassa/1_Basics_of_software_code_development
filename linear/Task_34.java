package by.training.linear;

import java.util.Scanner;

/**
 * Дана величина А, выражающая объем информации в байтах. Перевести А в более
 * крупные единицы измерения информации.
 *
 */
public class Task_34 {

	public static void main(String[] args) {
		long byteInf;

		long valueCalculate[];

		byteInf = enterFromConsole("Введите объем информации в байтах: ");

		valueCalculate = valueCalculate(byteInf);
		outputConsole(byteInf, valueCalculate);

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
		value = sc.nextLong();

		return value;
	}

	public static long[] valueCalculate(long byteInf) {
		long kByteInf;
		long mByteInf;
		long gByteInf;

		kByteInf = (long) (byteInf / Math.pow(2, 10));
		mByteInf = (long) (kByteInf / Math.pow(2, 10));
		gByteInf = (long) (mByteInf / Math.pow(2, 10));

		return new long[] { kByteInf, mByteInf, gByteInf };
	}

	public static void outputConsole(long byteInf, long[] valueCalculate) {
		long kByteInf;
		long mByteInf;
		long gByteInf;

		kByteInf = valueCalculate[0];
		mByteInf = valueCalculate[1];
		gByteInf = valueCalculate[2];

		System.out.printf("Объем информации в байтах равен %d байт \n", byteInf);
		System.out.printf("Объем информации %d байт равен %d килобайт \n", byteInf, kByteInf);
		System.out.printf("Объем информации %d байт равен %d мегабайт\n", byteInf, mByteInf);
		System.out.printf("Объем информации %d байт равен %d гигабайт", byteInf, gByteInf);
	}

}
