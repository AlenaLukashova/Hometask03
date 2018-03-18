package by.tc.jb24.l38;

import java.util.Scanner;

public class Line01 {
	public static void main(String[] args) {
		int number = readIntFromConsole();
		findAnswer(number);
	}

	public static int readIntFromConsole() {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		System.out.println("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		return number;
	}

	public static void findAnswer(int number) {		
		while (number != 0) {
			int lastDigit = lastDigitCalc(number);
			number = remainDigitsCalc(number);

			if (isEven(lastDigit)) {
				System.out.println("В числе есть четная цифра. ");
				return;
			} 
		}
		System.out.println("В числе нет четных цифр. ");
	}

	public static int lastDigitCalc(int number) {
		return number % 10;
	}

	public static int remainDigitsCalc(int number) {
		return number / 10;
	}
	
	public static boolean isEven(int lastDigit) {
		return lastDigit % 2 == 0;
	}
}
