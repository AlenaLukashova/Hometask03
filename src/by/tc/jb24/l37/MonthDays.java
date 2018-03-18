package by.tc.jb24.l37;

import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		int year = readIntFromConsole("¬ведите год: ");
		int month = readIntFromConsole("¬ведите мес€ц: ");
		int days = calculateAmountOfDays(month, year);
		printResult(days);

	}

	public static int readIntFromConsole(String prompt) {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		System.out.println(prompt);
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}
		return number;
	}

	public static int calculateAmountOfDays(int month, int year) {
		int days = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 2:
			if (year % 4 == 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		}
		return days;
	}

	public static void printResult(int days) {
		System.out.println(" оличество дней в мес€це равно  " + days);
	}
}