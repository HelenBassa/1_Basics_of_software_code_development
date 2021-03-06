﻿package by.training.linear;

import java.util.Scanner;

/**
 * Составить линейную программу, печатающую значение true, если указанное
 * высказывание является истинным, и false - в противном случае:
 * 
 * 2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух
 * его последних цифр.
 *
 */
public class Task_37_2 {

	public static void main(String[] args) {
		int num;
		boolean valueCalculate;

		num = enterFromConsole("Введите четырехзначное число: ");

		while ((num < 1000) || (num > 9999)) {
			System.out.print("Некорректное значение! ");
			num = enterFromConsole("Введите четырехзначное число: ");
		}

		valueCalculate = valueCalculate(num);
		outputConsole(valueCalculate);
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

	public static boolean valueCalculate(int num) {
		boolean value;
		value = (num / 1000 % 10 + num / 100 % 10) == (num / 10 % 10 + num % 10);
		return value;
	}

	public static void outputConsole(boolean valueCalculate) {
		System.out.print(valueCalculate);
	}

}
