package by.tc.jb24.task2;

import java.util.Scanner;

public class Function2 {
	private static double h;

	public static void main(String[] args) {
		double a=readDoubleFromConsole("a");
		double b=readDoubleFromConsole("b");
		double h = readDoubleFromConsole("h");		
		calculate(a,b,h);		
	}

	public static double readDoubleFromConsole(String variable) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter " + variable + ":");
		return sc.nextDouble();
	}
	
	public static void calculate(double a, double b, double h){
		for(double x=a; x <= b; x=x+h){
			double y = calculateFx(x);
			printResult(x,y);						
		}
	}
	
	public static double calculateFx(double x){
		return 2 * Math.tan(x/2) + 1;
	}
	
	public static void printResult(double x, double y){
		System.out.println("x=" + x + " | y=" + y);
	}
}
