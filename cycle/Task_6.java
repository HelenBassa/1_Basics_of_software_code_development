package by.training.cycle;

/**
 * Вывести на экран соответствия между символами и их численными обозначениями в
 * памяти компьютера.
 *
 */
public class Task_6 {

	public static void main(String[] args) {
		
		System.out.println("Код ASCII -> символ -> численное обозначение в памяти компьютера");
		functionValue();

	}

	public static void functionValue() {

		for (int i = 1; i <= 255; i++) {
			char symbol;
			String numDesignInComputerMemory;
			
			symbol = (char) i;
			numDesignInComputerMemory = Integer.toBinaryString(symbol);

			System.out.printf("%d\t -> %s\t -> %s\t \n", i, symbol, numDesignInComputerMemory);

		}

	}

}
