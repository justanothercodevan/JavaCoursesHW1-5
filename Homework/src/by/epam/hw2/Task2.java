package by.epam.hw2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a:");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		a = sc.nextDouble();		
		System.out.println("Введите b:");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		b = sc.nextDouble();
		System.out.println("Введите c:");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		c = sc.nextDouble();
		
		sc.close();
		
		if (a != 0.0) {
			double ans = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c))/(2*a) - Math.pow(a,3)*c + b;
			System.out.println(ans);
		} else {
			System.out.println("a не может быть отрицательным");
		}

	}

}
