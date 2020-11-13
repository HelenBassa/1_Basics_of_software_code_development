package by.training.linear;

import java.util.Scanner;

/**
 * Ввести любой символ и определеить его порядковый номер, а также указать
 * предыдущий и последующий символы.
 *
 */
public class Task_33 {

	public static void main(String[] args) {
		char symbol;
		int[] valueCalculate;

		symbol = enterFromConsole("Введите любой символ: ");
		valueCalculate = valueCalculate(symbol);

		outputConsole(symbol, valueCalculate);
	}

	public static char enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		char value;

		System.out.print(message);
		while (!sc.hasNext()) {
			System.out.print(message);
			sc.next();
		}
		value = sc.next().charAt(0);

		return value;
	}

	public static int[] valueCalculate(char symbol) {
		int symbolNumber;
		int prevSymbolNumber;
		int nextSymbolNumber;

		symbolNumber = (int) symbol;
		prevSymbolNumber = symbolNumber - 1;
		nextSymbolNumber = symbolNumber + 1;

		return new int[] { symbolNumber, prevSymbolNumber, nextSymbolNumber };
	}

	public static void outputConsole(char symbol, int valueCalculate[]) {
		int symbolNumber;
		int prevSymbolNumber;
		int nextSymbolNumber;
		char prevSymbol;
		char nextSymbol;

		symbolNumber = valueCalculate[0];
		prevSymbolNumber = valueCalculate[1];
		nextSymbolNumber = valueCalculate[2];

		prevSymbol = (char) (prevSymbolNumber);
		nextSymbol = (char) (nextSymbolNumber);

		System.out.printf("Порядковый номер символа %s равен %d \n", symbol, symbolNumber);
		System.out.printf("Предыдущий символ %s, последующий символ %s \n", prevSymbol, nextSymbol);
	}

}
