package by.training.linear;

import java.util.Scanner;

/**
 * Дана длина ребра куба.
 * 
 * Найти площадь грани, площадь полной поверхности и объем этого куба.
 *
 */
public class Task_18 {

	public static void main(String[] args) {
		double a;
		double valueCalculate[];

		a = enterFromConsole("Введите длину ребра куба: ");

		valueCalculate = valueCalculate(a);

		outputConsole(a, valueCalculate);
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

	public static double[] valueCalculate(double a) {
		double faceArea;
		double cubeSurfaceArea;
		double cubeVolume;

		faceArea = Math.pow(a, 2);
		cubeSurfaceArea = 6 * faceArea;
		cubeVolume = Math.pow(a, 3);

		return new double[] { faceArea, cubeSurfaceArea, cubeVolume };
	}

	public static void outputConsole(double a, double[] valueCalculate) {
		double faceArea;
		double cubeSurfaceArea;
		double cubeVolume;

		faceArea = valueCalculate[0];
		cubeSurfaceArea = valueCalculate[1];
		cubeVolume = valueCalculate[2];

		System.out.println("Площадь грани куба с ребром длиной a = " + a + " равна " + faceArea);
		System.out.println("Площадь полной поверхности куба с ребром длиной a = " + a + " равна " + cubeSurfaceArea);
		System.out.println("Объем куба с ребром длиной a = " + a + " равен " + cubeVolume);
	}

}
