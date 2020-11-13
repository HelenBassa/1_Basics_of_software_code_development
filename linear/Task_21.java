package by.training.linear;

import java.util.Scanner;

/**
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях).
 * 
 * Поменять местами дробную и целую части числа и вывести полученное значение
 * числа.
 *
 */
public class Task_21 {

	public static void main(String[] args) {
		double realNum;
		double swapRealNum;

		realNum = enterFromConsole(
				"Введите действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях): ");

		swapRealNum = swapRealNum(realNum);

		outputConsole(realNum, swapRealNum);
	}

	public static double enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double value;
		double lowerLimit;
		double upperLimit;

		lowerLimit = 100.000;
		upperLimit = 999.999;

		System.out.print(message);

		while (!sc.hasNextDouble()) {
			System.out.print("Это не число! ");
			sc.next();
			System.out.print(message);
		}

		value = Math.abs(sc.nextDouble());

		while ((value < lowerLimit) | (value > upperLimit)) {
			System.out.print("Введенное число не соответствует условию! Введите действительное число R вида nnn.ddd: ");
			sc.next();
		}

		return value;
	}

	public static double swapRealNum(double realNum) {
		double value;
		value = (realNum * 1000) % 1000 + (int) realNum / 1000.0;
		return value;
	}

	public static void outputConsole(double realNum, double swapRealNum) {
		System.out
				.println("В случае замены целой и дробной части числа " + realNum + " получится число " + swapRealNum);
	}
}
