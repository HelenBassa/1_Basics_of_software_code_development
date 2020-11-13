package by.training.cycle;

import java.math.BigInteger;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 *
 */
public class Task_4 {

	public static void main(String[] args) {
		int num;
		BigInteger functionValue;

		num = 200;
		functionValue = functionValue(num);
		outputConsole(num, functionValue);

	}

	public static BigInteger functionValue(int num) {
		BigInteger value;
		value = BigInteger.ONE;

		for (int i = 1; i <= num; i++) {
			value = value.multiply(BigInteger.valueOf(i * i));
		}

		return value;
	}

	public static void outputConsole(int num, BigInteger functionValue) {
		System.out.printf("Произведение квадратов от 1 до %d равно %d", num, functionValue);
	}

}
