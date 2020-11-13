package by.training.cycle;

import java.util.Scanner;

/**
 * Даны числовой ряд и некоторое число e.
 * 
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному e.
 * Общий член ряда имеет вид:
 *
 */
public class Task_5 {

	public static void main(String[] args) {
		int n;
		double e;
		double sum;

		n = 1;
		e = enterFromConsole("Введите число e: ");
		sum = functionValue(n, e);
		
		outputConsole(e, sum);

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

	public static double functionValue(int n, double e) {
		double value;
		
		value = 0;

		while (Math.abs((1 / Math.pow(2, n)) + (1 / Math.pow(2, n))) >= e) {
			value += Math.abs((1 / Math.pow(2, n)) + (1 / Math.pow(2, n)));
			n += 1;
		}
		
		return value;
	}
	
	public static void outputConsole(double e, double sum) {
		System.out.printf("Сумма членов ряда, модуль которых больше или равен заданному e = %f равна %f", e, sum);
	}

	

}
