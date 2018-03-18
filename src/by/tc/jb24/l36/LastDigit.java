package by.tc.jb24.l36;

import java.util.Scanner;

public class LastDigit {
	public static void main(String[] args) {
		int number;
		int poslZifra;
		int poslZifraKv;

		number = readNumberFromConsole();
		poslZifra = calcPoslZifra(number);
		poslZifraKv = calcPoslZifraKv(poslZifra);
		printResult(number, poslZifraKv);

	}

	public static int readNumberFromConsole() {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.println("¬ведите число: ");
		while (!sc.hasNextInt()) {
			sc.nextInt();
			System.out.println("¬ведите число: ");
		}
		return number = sc.nextInt();
	}

	public static int calcPoslZifra(int number) {
		int poslZifra;

		poslZifra = number % 10;
		return poslZifra;
	}

	public static int calcPoslZifraKv(int poslZifra) {
		int poslZifraKv;

		poslZifraKv = (int) (Math.pow(poslZifra, 2) % 10);
		return poslZifraKv;
	}

	public static void printResult(int number, int poslZifraKv) {
		System.out.println("„исло " + number + " последн€€ цифра его квадрата "
				+ poslZifraKv);
	}
}
