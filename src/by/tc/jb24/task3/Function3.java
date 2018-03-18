package by.tc.jb24.task3;

import java.util.Scanner;

public class Function3 {

	public static void main(String[] args) {
		
		double x=readDoubleFromConsole("x = ");
		if (isInputValid(x)){
			double y = calculate(x);
			printResult(y);
		} else {
			System.out.println("The function isn't defined for given x");
		}

	}
	
	public static double readDoubleFromConsole(String variable) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter " + variable);
		return sc.nextDouble();
	}
	
	public static boolean isInputValid(double x) {
		return x>-3 && x<=3;
    }
	
	public static double calculate(double x) {
		double y=0;
		
		if (x<=-3){
			y=9;			
		} else if (x>3){
		    y= 1 / (Math.pow(x, 2)+1);
		} 		
		return y;
    }
	
	public static void printResult(double y){
		System.out.println("Fx=" + y);
	}
}
