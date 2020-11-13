package by.training.linear;

import java.util.Scanner;

/**
 * Составить программу для вычисления пути, пройденного лодкой, если ее скорость
 * в стоячей воде V км/ч, скорость течения реки V1 км/ч, время движения по озеру
 * t1 ч, а против течения реки - t2 ч.
 *
 */
public class Task_31 {

	public static void main(String[] args) {
		double v;
		double v1;
		double t1;
		double t2;
		double distance;

		System.out.println("Введите следующие значения");
		v = enterFromConsole("Скорость лодки в стоячей воде V (км/ч): ");
		v1 = enterFromConsole("Скорость течения реки V1 (км/ч): ");
		t1 = enterFromConsole("Время движения лодки по озеру t1 (ч): ");
		t2 = enterFromConsole("Время движения лодки против течения реки - t2 (ч): ");

		distance = distance(v, v1, t1, t2);
		outputConsole(distance);
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

	public static double distance(double v, double v1, double t1, double t2) {
		double value;
		value = t1 * v + t2 * (v - v1);
		return value;
	}

	public static void outputConsole(double distance) {
		System.out.printf("Путь, пройденный лодкой: %.2f км", distance);
	}

}
