package by.tc.jb24.l35;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		int n = 10;
		String minString = "";
		String maxString = "";

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("> ");
			if (sc.hasNextLine()) {
				String currentString = sc.next();
				if (i == 0) {
					minString = currentString;
					maxString = currentString;
				} else {
					maxString = getMaxString(maxString, currentString);
					minString = getMinString(minString, currentString);
				}
			}
		}

		PrintResult(minString, maxString);
	}

	public static String getMinString(String str, String minString) {
		if (str.length() < minString.length()) {
			return str;
		} else {
			return minString;
		}
	}

	public static String getMaxString(String str, String maxString) {
		if (str.length() > maxString.length()) {
			return str;
		} else {
			return maxString;
		}
	}

	public static void PrintResult(String minString, String maxString) {
		System.out.println("min string =" + minString + "; length="
				+ minString.length());
		System.out.println("max string =" + maxString + "; length="
				+ maxString.length());
	}
}
