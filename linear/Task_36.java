package by.training.linear;

import java.util.Scanner;

/**
 * Найти частное произведений четных и нечетных цифр четырехзначного числа.
 *
 */
public class Task_36 {

	public static void main(String[] args) {
		int num;
		int[] valueCalculate;

		num = enterFromConsole("Введите четырехзначное число: ");

		valueCalculate = valueCalculate(num);
		outputConsole(num, valueCalculate);
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

		while ((value < 1000) | (value > 9999)) {
			System.out.print("Введенное число НЕ четырехзначное! Введите ЧЕТЫРЕХЗНАЧНОЕ ЧИСЛО: ");
			value = sc.nextInt();
		}

		return value;
	}

	public static int[] valueCalculate(int num) {
		int evenNum;
		int oddNum;

		evenNum = 1;
		oddNum = 1;

		while (num > 0) {
			if ((num % 10 % 2) == 0) {
				evenNum *= num % 10;
			} else {
				oddNum *= num % 10;
			}
			num /= 10;
		}

		return new int[] { evenNum, oddNum };
	}

	public static void outputConsole(int num, int[] valueCalculate) {
		int evenNum;
		int oddNum;
		double quotEvenOdd;

		evenNum = valueCalculate[0];
		oddNum = valueCalculate[1];
		quotEvenOdd = (double) evenNum / (double) oddNum;

		if (evenNum != 1 && oddNum != 1) {
			System.out.printf("Произведение четных цифр введенного четырехзначного числа %d равно %d \n", num, evenNum);
			System.out.printf("Произведение нечетных цифр введенного четырехзначного числа %d равно %d \n", num,
					oddNum);
			System.out.printf(
					"Частное произведений четных и нечетных цифр введенного четырехзначного числа %d равно %.5f \n",
					num, quotEvenOdd);
		} else {
			System.out.print("Число состоит из только четных (нечетных) цифр");
		}

	}

}
