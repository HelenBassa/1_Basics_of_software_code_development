package by.training.linear;

/**
 * Написать программу, которая выводит на экран первые четыре степени PI
 *
 */
public class Task_15 {

	public static void main(String[] args) {
		int n;
		n = 4;

		piValue(n);
	}

	public static void piValue(int n) {
		double value;
		for (int i = 1; i <= n; i++) {
			value = Math.pow(Math.PI, i);
			System.out.println("PI в степени " + i + " равно " + value);
		}

	}

}
