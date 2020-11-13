package by.training.cycle;

/**
 * Найти сумму квадратов первых ста чисел.
 *
 */
public class Task_3 {

	public static void main(String[] args) {
		int num;
		long functionValue;

		num = 100;
		functionValue = functionValue(num);
		outputConsole(num, functionValue);

	}

	public static long functionValue(int num) {
		long value;

		value = 0;
		for (int i = 1; i <= num; i++) {
			value += Math.pow(i, 2);
		}
		return value;
	}

	public static void outputConsole(int num, long functionValue) {
		System.out.printf("Сумма квадратов от 1 до %d равно %d", num, functionValue);
	}

}
