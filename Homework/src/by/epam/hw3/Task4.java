package by.epam.hw3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = readFromConsole("x");
		
		System.out.println(functionFromX(x));

	}
	
	public static int readFromConsole(String name){
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.printf("Введите %s: ", name);
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.printf("Введите %s: ", name);
		}
		num = sc.nextInt();
		sc.close();
		return num;
	}
	
	public static double functionFromX(int x) {
		double ans = 0.0;
		if (x <= -3) {
			ans = 9.0;
		} else {
			ans = 1 /  (Math.pow(x, 2) + 1);
		}		
		return ans;
	}

}
